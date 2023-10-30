package entidades;

import java.time.LocalDate;

/**
 * @author Veronica
 */
public class Visita {

    private int idVisita;
    private Mascota mascota;
    private String detalle_sintomas;
    private double pesoActual;
    private double pesoAVG;
    private Tratamiento tratamiento;
    private LocalDate fecha_v;
    private String forma_pago;
    private boolean abonada;

    public Visita() {
    }

    public Visita(Mascota mascota, String detalle_sintomas, double pesoActual, double pesoAVG, Tratamiento tratamiento, LocalDate fecha_v, String forma_pago, boolean abonada) {
        this.mascota = mascota;
        this.detalle_sintomas = detalle_sintomas;
        this.pesoActual = pesoActual;
        this.pesoAVG = pesoAVG;
        this.tratamiento = tratamiento;
        this.fecha_v = fecha_v;
        this.forma_pago = forma_pago;
        this.abonada = abonada;
    }

    public Visita(int idVisita, Mascota mascota, String detalle_sintomas, double pesoActual, double pesoAVG, Tratamiento tratamiento, LocalDate fecha_v, String forma_pago, boolean abonada) {
        this.idVisita = idVisita;
        this.mascota = mascota;
        this.detalle_sintomas = detalle_sintomas;
        this.pesoActual = pesoActual;
        this.pesoAVG = pesoAVG;
        this.tratamiento = tratamiento;
        this.fecha_v = fecha_v;
        this.forma_pago = forma_pago;
        this.abonada = abonada;
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public String getDetalle_sintomas() {
        return detalle_sintomas;
    }

    public void setDetalle_sintomas(String detalle_sintomas) {
        this.detalle_sintomas = detalle_sintomas;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public double getPesoAVG() {
        return pesoAVG;
    }

    public void setPesoAVG(double pesoAVG) {
        this.pesoAVG = pesoAVG;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    public LocalDate getFecha_v() {
        return fecha_v;
    }

    public void setFecha_v(LocalDate fecha_v) {
        this.fecha_v = fecha_v;
    }

    public String getForma_pago() {
        return forma_pago;
    }

    public void setForma_pago(String forma_pago) {
        this.forma_pago = forma_pago;
    }

    public boolean isAbonada() {
        return abonada;
    }

    public void setAbonada(boolean abonada) {
        this.abonada = abonada;
    }

    @Override
    public String toString() {
        return tratamiento + " Fecha: " + fecha_v;
    }
}
