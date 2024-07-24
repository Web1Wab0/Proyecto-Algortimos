/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author elmas
 */
public class reservaciones {
    private Integer reservacionid;
    private String dni;
    private Integer sedeid;
    private Integer mesaid;
    private String fechahorareserva;
    private String mensaje;
    public reservaciones(){}

    public Integer getReservacionid() {
        return reservacionid;
    }

    public void setReservacionid(Integer reservacionid) {
        this.reservacionid = reservacionid;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    

    public Integer getSedeid() {
        return sedeid;
    }

    public void setSedeid(Integer sedeid) {
        this.sedeid = sedeid;
    }

    public Integer getMesaid() {
        return mesaid;
    }

    public void setMesaid(Integer mesaid) {
        this.mesaid = mesaid;
    }

    public String getFechahorareserva() {
        return fechahorareserva;
    }

    public void setFechahorareserva(String fechahorareserva) {
        this.fechahorareserva = fechahorareserva;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
}
