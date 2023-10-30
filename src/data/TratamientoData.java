package data;

import entidades.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author Veronica
 */
public class TratamientoData {

    private Connection con = null;

    public TratamientoData() {

        con = Conexion.getConexion();
    }

    public int guardarTratamiento(Tratamiento tratamiento) {
        int idTramamientoGuardado = 0;
        String sql = "INSERT INTO tratamientos(tipo, descripcion, importe, activo)"
                + " VALUES (?,?,?,?)";
        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {

            ps.setString(1, tratamiento.getTipo());
            ps.setString(2, tratamiento.getDescripcion());
            ps.setDouble(3, tratamiento.getImporte());
            ps.setBoolean(4, tratamiento.isActivo());
            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys();) {
                if (rs.next()) {

                    tratamiento.setIdTratamiento(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Tratamiento guardado exitosamente. ");
                    idTramamientoGuardado = tratamiento.getIdTratamiento();
                }
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla tratamientos" + ex.getMessage());
        }
        return idTramamientoGuardado;
    }

    public List<Tratamiento> listarTratamientosActivos() {
        List<Tratamiento> listaTratamientosActivos = new ArrayList<>();
        String sql = "SELECT * "
                + "FROM tratamientos "
                + "WHERE activo = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Tratamiento tratamiento = new Tratamiento();
                tratamiento.setIdTratamiento(rs.getInt("idTratamiento"));
                tratamiento.setTipo(rs.getString("tipo"));
                tratamiento.setDescripcion("descripcion");
                tratamiento.setImporte(rs.getDouble("importe"));
                tratamiento.setActivo(rs.getBoolean("activo"));
                listaTratamientosActivos.add(tratamiento);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla tratamientos " + ex.getMessage());
        }
        return listaTratamientosActivos;
    }

    public void darDeBajaTratamiento(int idTratamiento) {
        try {
            String sql = "UPDATE tratamiento SET activo = 0 WHERE idTratamiento = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idTratamiento);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se dió de baja el tratamiento.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla de tratamientos. " + ex.getMessage());
        }
    }

    public void modificarTratamiento(Tratamiento tratamiento) {
        String sql = "UPDATE tratamiento SET tipo = ?, descripcion = ?, importe = ?, activo = ? WHERE idTratamiento = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tratamiento.getTipo());
            ps.setString(2, tratamiento.getDescripcion());
            ps.setDouble(3, tratamiento.getImporte());
            ps.setBoolean(4, tratamiento.isActivo());
            ps.setInt(5, tratamiento.getIdTratamiento());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Tratamiento modificado con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tratamientos. " + ex.getMessage());
        }
    }

    public Tratamiento buscarTrataminetoPorId(int idTratamiento) {

        String sql = "SELECT tipo, descripcion, importe, activo FROM tratamientos WHERE idTratamiento = ? AND activo = 1";
        Tratamiento tratamiento = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idTratamiento);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tratamiento = new Tratamiento();
                tratamiento.setIdTratamiento(idTratamiento);
                tratamiento.setTipo(rs.getString("tipo"));
                tratamiento.setDescripcion(rs.getString("descripcion"));
                tratamiento.setImporte(rs.getDouble("importe"));
                tratamiento.setActivo(rs.getBoolean("activo"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe tratamiento activo con ese codigo. ");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla tratamientos" + ex);
        }
        return tratamiento;
    }
}
