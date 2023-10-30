package data;

import entidades.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.text.DecimalFormat;
import java.util.*;
import javax.swing.JOptionPane;

/**
 * @author Veronica
 */
public class VisitaData {

    private Connection con = null;
    private ClienteData cd = new ClienteData();
    private MascotaData md = new MascotaData();
    private TratamientoData td = new TratamientoData();

    /* se declara una variable privada y 
  se inicializa creando una nueva instancia de la clase ClienteData y MascotaData por esto
  la clase VisitaData tiene una dependencia de la clase MascotaData 
  y puede utilizar sus métodos y propiedades a través de esta variable md.*/
    public VisitaData() {
        this.con = Conexion.getConexion();
    }

    public void guardarVisita(Visita visita) {

        String sql = "INSERT INTO visitas(idMascota, pesoActual, avg, detalle_sintomas, idTratamiento, fecha_v, forma_de_pago, abonada)"
                + "VALUES(?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, visita.getMascota().getIdMascota());
            ps.setDouble(2, visita.getPesoActual());
            ps.setDouble(3, visita.getPesoAVG());
            ps.setString(4, visita.getDetalle_sintomas());
            ps.setInt(5, visita.getTratamiento().getIdTratamiento());
            ps.setDate(6, Date.valueOf(visita.getFecha_v()));
            ps.setString(7, visita.getForma_pago());
            ps.setBoolean(8, false);   //lo inicializo en false porque lo cambio cuando lo pagan
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                visita.setIdVisita(rs.getInt(1)); //el 1 es porque quiero el idInscripcion que está en la columna 1 
                JOptionPane.showMessageDialog(null, "Nueva visita registrada");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla visitas");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar la visita " + ex.getMessage());
        }
    }

    public List<Visita> obtenerVisitasPorMascota(int idMascota) {
        ArrayList<Visita> visitasPorMascota = new ArrayList<>();
        String sql = "SELECT * FROM visitas WHERE idMascota = ?";

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idMascota);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Visita visita = new Visita();
                visita.setIdVisita(rs.getInt("idVisita"));
                Mascota mascota = md.buscarMascota(rs.getInt("idMascota"));
                visita.setMascota(mascota);
                visita.setDetalle_sintomas(rs.getString("detalle_sintomas"));
                Tratamiento tratamiento = td.buscarTrataminetoPorId(rs.getInt("idTratamiento"));
                visita.setTratamiento(tratamiento);
                visita.setFecha_v(rs.getDate("fecha_v").toLocalDate());
                visita.setForma_pago(rs.getString("forma_de_Pago"));
                visita.setAbonada(rs.getBoolean("abonada"));
                visitasPorMascota.add(visita);
            }
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla visitas");
        }
        return visitasPorMascota;
    }

    public void actualizarSintomas(Visita visita) {

        String sql = "UPDATE visitas SET detalle_sintomas = ? WHERE idVisita=? AND abonada = 0";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, visita.getDetalle_sintomas());
            ps.setInt(2, visita.getIdVisita());
            int fila = ps.executeUpdate();

            if (fila > 0) {
                JOptionPane.showMessageDialog(null, "Detalle de visita actualizado");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla visitas");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo modificar el detalle de visita " + ex.getMessage());
        }
    }

    public double obtenerPesoAVG(int idM) {
        double avg = 0;
        int x = 0;
        String sql = "SELECT COUNT(fecha_v) AS cantidad, SUM(pesoActual) AS total FROM ( SELECT fecha_v, pesoActual FROM visitas WHERE idMascota = ? ORDER BY fecha_v DESC LIMIT 10 ) subquery;";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idM);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                x = rs.getInt("cantidad");
                avg = (rs.getDouble("total")) / x;
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla Visitas");
            System.out.println(ex);
        }
        return avg;
    }

}

/*SELECT v.fecha_v, v.pesoActual, v.detalle_sintomas, t.tipo, t.descripcion
FROM visitas AS v
INNER JOIN mascotas AS m ON v.idMascota = m.idMascota
LEFT JOIN tratamientos AS t ON v.idTratamiento = t.idTratamiento
WHERE m.idMascota = ?
ORDER BY v.fecha_v ASC;*/
