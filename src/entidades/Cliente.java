package entidades;

import java.util.List;

/**
 *
 * @author Veronica
 */
public class Cliente {

    private int idCliente;
    private int dni;
    private String apellido;
    private String nombre;
    private String direccion;
    private int telefono;
    private String nombreAlt;
    private int contAlt;
    private boolean activo;
    private List <Mascota> mascotas;

    public Cliente() {
    }

    public Cliente(int dni, String apellido, String nombre, String direccion, int telefono, String nombreAlt, int contAlt, boolean activo) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nombreAlt = nombreAlt;
        this.contAlt = contAlt;
        this.activo = activo;
    }

    public Cliente(int idCliente, int dni, String apellido, String nombre, String direccion, int telefono, String nombreAlt, int contAlt, boolean activo) {
        this.idCliente = idCliente;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nombreAlt = nombreAlt;
        this.contAlt = contAlt;
        this.activo = activo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombreAlt() {
        return nombreAlt;
    }

    public void setNombreAlt(String nombreAlt) {
        this.nombreAlt = nombreAlt;
    }

    public int getContAlt() {
        return contAlt;
    }

    public void setContAlt(int contAlt) {
        this.contAlt = contAlt;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }


    @Override
    public String toString() {
        return nombre + " " + apellido + ", DNI " + dni;
    }
}
