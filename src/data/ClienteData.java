package data;

import entidades.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @author Veronica
 */
public class ClienteData {

    private Connection con = null;

    public ClienteData() {

        con = Conexion.getConexion();
    }

    public void guardarCliente(Cliente cliente) {

        String sql = "INSERT INTO clientes(dni, apellido, nombre, direccion, telefono, nombreAlt, contAlt, activo)"
                + " VALUES (?,?,?,?,?,?,?,?)";
        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {

            ps.setInt(1, cliente.getDni());
            ps.setString(2, cliente.getApellido());
            ps.setString(3, cliente.getNombre());
            ps.setString(4, cliente.getDireccion());
            ps.setInt(5, cliente.getTelefono());
            ps.setString(6, cliente.getNombreAlt());
            ps.setInt(7, cliente.getContAlt());
            ps.setBoolean(8, cliente.isActivo());
            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys();) {
                if (rs.next()) {

                    cliente.setIdCliente(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Cliente guardado exitosamente. ");
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla clientes" + ex.getMessage());
        }
    }

    //trae clientes activos y dados de baja.
    public Cliente buscarTodoClientePorDni(int dni) {

        Cliente cliente = null;

        String sql = "SELECT * FROM clientes WHERE dni=?";

        try (PreparedStatement ps = con.prepareStatement(sql);) {

            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setDni(dni);
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setTelefono(rs.getInt("telefono"));
                cliente.setNombreAlt(rs.getString("nombreAlt"));
                cliente.setContAlt(rs.getInt("contAlt"));
                cliente.setActivo(rs.getBoolean("activo"));

            } else {
                JOptionPane.showMessageDialog(null, "No hay registro de cliente con ese DNI. ");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla clientes. " + ex.getMessage());
        }

        return cliente;
    }

    public Cliente buscarClientePorId(int id) {

        Cliente cliente = null;

        String sql = "SELECT dni, apellido, nombre, direccion, telefono, nombreAlt,"
                + " contAlt, activo "
                + "FROM clientes "
                + "WHERE idCliente = ?";

        try (PreparedStatement ps = con.prepareStatement(sql);) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(id);
                cliente.setDni(rs.getInt("dni"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setTelefono(rs.getInt("telefono"));
                cliente.setNombreAlt(rs.getString("nombreAlt"));
                cliente.setContAlt(rs.getInt("contAlt"));
                cliente.setActivo(rs.getBoolean("activo"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró cliente con ese código. ");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla clientes. " + ex.getMessage());
        }

        return cliente;
    }

    public void modificar(Cliente cliente) {

        // Verificar campos obligatorios
        if (cliente.getApellido().isEmpty() || cliente.getNombre().isEmpty()
                || cliente.getDireccion().isEmpty() || cliente.getNombreAlt().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ningún campo debe estar vacío.");
            return; // No continuar si hay campos vacíos
        }
        // Verificar campos numéricos
        if (cliente.getDni() <= 0 || cliente.getTelefono() <= 0 || cliente.getContAlt() <= 0) {
            JOptionPane.showMessageDialog(null, "Los campos numéricos deben ser mayores que cero.");
            return; // No continuar si hay campos numéricos vacíos o no válidos
        }

        String sql = "UPDATE clientes SET dni = ?, apellido = ?, nombre = ?, direccion = ?, telefono = ?,"
                + "nombreAlt=?, contAlt = ?, activo = ? "
                + "WHERE idCliente = ?";

        try (PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setInt(1, cliente.getDni());
            ps.setString(2, cliente.getApellido());
            ps.setString(3, cliente.getNombre());
            ps.setString(4, cliente.getDireccion());
            ps.setInt(5, cliente.getTelefono());
            ps.setString(6, cliente.getNombreAlt());
            ps.setInt(7, cliente.getContAlt());
            ps.setBoolean(8, cliente.isActivo());
            ps.setInt(9, cliente.getIdCliente());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Datos actualizados.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No fue posible modificar al cliente:  " + ex.getMessage());
        }
    }

    public void eliminarCliente(int id) {

        String sql = "UPDATE clientes "
                + "SET activo = 0 "
                + "WHERE idCliente = ?;";

        try (PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Cliente dado de baja");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo dar de baja el cliente: " + ex.getMessage());
        }

    }

    public List<Cliente> listar() {
        List<Cliente> listaClientes = new ArrayList<>();
        String sql = "SELECT * FROM clientes WHERE activo = 1;";
        try (PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery();) {
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setDni(rs.getInt("dni"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setTelefono(rs.getInt("telefono"));
                cliente.setNombreAlt(rs.getString("nombreAlt"));
                cliente.setContAlt(rs.getInt("contAlt"));
                cliente.setActivo(rs.getBoolean("activo"));
                listaClientes.add(cliente);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No fue posible realizar la lista: " + ex.getMessage());
        }
        return listaClientes;
    }

    public Cliente buscarClienteActivoPorDni(int dni) {

        Cliente cliente = null;

        String sql = "SELECT idCliente, dni, apellido, nombre, direccion, telefono, nombreAlt,"
                + " contAlt, activo "
                + "FROM clientes "
                + "WHERE dni = ? AND activo = 1";

        try (PreparedStatement ps = con.prepareStatement(sql);) {

            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setDni(dni);
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setTelefono(rs.getInt("telefono"));
                cliente.setNombreAlt(rs.getString("nombreAlt"));
                cliente.setContAlt(rs.getInt("contAlt"));
                cliente.setActivo(rs.getBoolean("activo"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró cliente con ese DNI. ");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla clientes. " + ex.getMessage());
        }

        return cliente;
    }

    public void activarCliente(int dni) {

        String sql = "UPDATE clientes "
                + "SET activo = 1 "
                + "WHERE dni = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            int fila = ps.executeUpdate();
            ps.close();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se reactivó el cliente.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos: " + ex.getMessage());

        }

    }

}
