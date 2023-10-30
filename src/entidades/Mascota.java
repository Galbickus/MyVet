package entidades;

import java.time.LocalDate;
//import java.util.*;

/**
 * @author Veronica
 */
public class Mascota {

    private int idMascota;
    private String alias;
    private String sexo;
    private String especie;
    private String raza;
    private String colores;    //pueden ser plumas
    private LocalDate fN;
    private Cliente cliente;
    private boolean activo;

    public Mascota() {
    }

    public Mascota(String alias, String sexo, String especie, String raza, String colores, LocalDate fN, Cliente cliente, boolean activo) {
        this.alias = alias;
        this.sexo = sexo;
        this.especie = especie;
        this.raza = raza;
        this.colores = colores;
        this.fN = fN;
        this.cliente = cliente;
        this.activo = activo;
    }

    public Mascota(int idMascota, String alias, String sexo, String especie, String raza, String colores, LocalDate fN, Cliente cliente, boolean activo) {
        this.idMascota = idMascota;
        this.alias = alias;
        this.sexo = sexo;
        this.especie = especie;
        this.raza = raza;
        this.colores = colores;
        this.fN = fN;
        this.cliente = cliente;
        this.activo = activo;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColores() {
        return colores;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }

    public LocalDate getfN() {
        return fN;
    }

    public void setfN(LocalDate fN) {
        this.fN = fN;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    @Override
    public String toString() {
        return alias + " " + raza;
    }

}
