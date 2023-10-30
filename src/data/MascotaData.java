package data;

import entidades.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @author Veronica
 */
public class MascotaData {

    private Connection con = null;
    private ClienteData cd = new ClienteData();

    public MascotaData() {
        con = Conexion.getConexion();
    }

    public int guardarMascota(Mascota mascota) {
        int numHC = 0;

        String sql = "INSERT INTO mascotas(alias, sexo, especie, raza, "
                + "colores, fN, idCliente, activo)"
                + " VALUES (?,?,?,?,?,?,?,?)";
        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {

            ps.setString(1, mascota.getAlias());
            ps.setString(2, mascota.getSexo());
            ps.setString(3, mascota.getEspecie());
            ps.setString(4, mascota.getRaza());
            ps.setString(5, mascota.getColores());
            ps.setDate(6, Date.valueOf(mascota.getfN()));
            ps.setInt(7, mascota.getCliente().getIdCliente());
            ps.setBoolean(8, true);

            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys();) {
                if (rs.next()) {

                    mascota.setIdMascota(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Mascota guardada exitosamente. ");
                    numHC = mascota.getIdMascota();
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla Mascotas. " + ex.getMessage());
        }
        return numHC;
    }

    public Mascota buscarMascota(int idMascota) {

        Mascota mascota = null;

        String sql = "SELECT * FROM mascotas WHERE idMascota = ?";

        try (PreparedStatement ps = con.prepareStatement(sql);) {

            ps.setInt(1, idMascota);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mascota = new Mascota();
                mascota.setIdMascota(idMascota);
                mascota.setAlias(rs.getString("alias"));
                mascota.setSexo(rs.getString("sexo"));
                mascota.setEspecie(rs.getString("especie"));
                mascota.setRaza(rs.getString("raza"));
                mascota.setColores(rs.getString("colores"));
                mascota.setfN(rs.getDate("fN").toLocalDate());
                Cliente cliente = cd.buscarClientePorId(rs.getInt("idCliente"));
                mascota.setCliente(cliente);
                mascota.setActivo(rs.getBoolean("activo"));
            } else {
                JOptionPane.showMessageDialog(null, "No hay registro de mascota con ese código. ");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla Mascotas. " + ex.getMessage());
        }
        return mascota;
    }

    public void modificarMascota(Mascota mascota) {

        String sql = "UPDATE mascotas SET alias = ?, sexo = ?, especie = ?, raza = ?, "
                + "colores = ?, fN = ?, idCliente = ?"
                + " WHERE idMascota = ?";

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, mascota.getAlias());
            ps.setString(2, mascota.getSexo());
            ps.setString(3, mascota.getEspecie());
            ps.setString(4, mascota.getRaza());
            ps.setString(5, mascota.getColores());
            ps.setDate(6, Date.valueOf(mascota.getfN()));
            ps.setInt(7, mascota.getCliente().getIdCliente());
            ps.setInt(8, mascota.getIdMascota());
            int fila = ps.executeUpdate();

            if (fila > 0) {
                JOptionPane.showMessageDialog(null, "Datos de mascota actualizados. ");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mascotas. " + ex.getMessage());
        }
    }

    public void bajaMascota(int idMascota) {
        try {
            String sql = "UPDATE mascotas "
                    + "SET activo = 0 "
                    + "WHERE idMascota = ? ";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMascota);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se dió de baja a la mascota. ");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla mascotas. " + e.getMessage());
        }
    }

    public void reactivarMascota(int idMascota) {
        try {
            String sql = "UPDATE mascotas "
                    + "SET activo = 1 "
                    + "WHERE idMascota = ? ";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMascota);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se reactivó el código de mascota Nº " + idMascota + ". ");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla mascotas. " + e.getMessage());
        }
    }

    public List<Mascota> listarMascotaPorCliente(int idCliente) {

        String sql = "SELECT idMascota, especie, raza, alias, sexo FROM mascotas WHERE idCliente = ?";

        ArrayList<Mascota> mascotas = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCliente);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Mascota mascota = new Mascota();

                mascota.setIdMascota(rs.getInt("idMascota"));
                mascota.setEspecie(rs.getString("especie"));
                mascota.setRaza(rs.getString("raza"));
                mascota.setAlias(rs.getString("alias"));
                mascota.setSexo(rs.getString("sexo"));
                mascotas.add(mascota);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Mascotas. " + ex.getMessage());
        }
        return mascotas;
    }

    public ArrayList<Mascota> listarMascotas() {
        String sql = " SELECT idMascota, alias, sexo, especie, raza, fN FROM mascotas WHERE activo = 1";
        ArrayList<Mascota> mascotas = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Mascota mascota = new Mascota();
                mascota.setIdMascota(rs.getInt("idMascota"));
                mascota.setAlias(rs.getString("alias"));
                mascota.setSexo(rs.getString("sexo"));
                mascota.setEspecie(rs.getString("especie"));
                mascota.setRaza(rs.getString("raza"));
                mascota.setfN(rs.getDate("fN").toLocalDate());
                mascotas.add(mascota);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Mascotas. " + ex.getMessage());
        }
        return mascotas;
    }

    public ArrayList<Object> listarItemsHC(int idMascota) {

        ArrayList items = new ArrayList();
        String sql = "SELECT v.fecha_v, v.pesoActual, v.detalle_sintomas, t.tipo, t.descripcion "
                + "FROM visitas AS v "
                + "INNER JOIN mascotas AS m ON v.idMascota = m.idMascota "
                + "LEFT JOIN tratamientos AS t ON v.idTratamiento = t.idTratamiento "
                + "WHERE m.idMascota = ? "
                + " ORDER BY v.fecha_v ASC";
        try (PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idMascota);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                String fecha = rs.getString("fecha_v");
                double peso = rs.getDouble("pesoActual");
                String sintomas = rs.getString("detalle_sintomas");
                String tratamiento = rs.getString("tipo");
                String descripcion = rs.getString("descripcion");

                items.add(new Object[]{fecha, peso, sintomas, tratamiento, descripcion});
            }

            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return items;

    }

    public ArrayList<Mascota> listarMascotasPorDni(int dni) {

        List<Mascota> mascotas = new ArrayList<>();
        String sql = "SELECT * "
                + "FROM mascotas m INNER JOIN clientes c ON m.idCliente = c.idCliente "
                + "WHERE c.dni = ? AND m.activo = 1";

        Cliente cliente = cd.buscarClienteActivoPorDni(dni);

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            if (cliente != null) {
                ps.setInt(1, dni);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    Mascota mascota = new Mascota(); // Inicializa un nuevo objeto Mascota en cada iteración

                    mascota.setIdMascota(rs.getInt("idMascota"));
                    mascota.setAlias(rs.getString("alias"));
                    mascota.setSexo(rs.getString("sexo"));
                    mascota.setEspecie(rs.getString("especie"));
                    mascota.setRaza(rs.getString("raza"));
                    mascota.setfN(rs.getDate("fN").toLocalDate());

                    mascotas.add(mascota);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay cliente con ese DNI");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error SQL al buscar el ID del cliente de la mascota");
            ex.printStackTrace();
        }

        return (ArrayList<Mascota>) mascotas;
    }

}
