package Model.Entity;


import Model.Collection.ColeccionEventos;

import java.util.ArrayList;
import java.util.Map;

public class Cliente {
    private String nombres;
    private String apellidos;
    private String BBDL; // Bikini Bottom Driver Lisence. Los gringos usan lisencia como ID.
    private String lugarResidencia;
    private Integer edad;
    private String numeroTelefono;
    private String lugarTrabajo;
    private ArrayList<Evento> eventos;

    public Cliente(String nombres, String apellidos, String BBDL, String lugarResidencia, Integer edad,
                   String numeroTelefono, String lugarTrabajo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.BBDL = BBDL;
        this.lugarResidencia = lugarResidencia;
        this.edad = edad;
        this.numeroTelefono = numeroTelefono;
        this.lugarTrabajo = lugarTrabajo;
    }

    /**
     * @param evento El evento reservado por el cliente. Adicionalmente, se
     *               agregara a la collecion con todos los eventos
     * @return agregarEvento retorna verdadero si el codigo correlativo no existe
     * y retorna falso si ya existe. Si ya existe, no se guardara el regisro
     */
    public Boolean agregarEvento(Evento evento) {
        Map<String, Evento> allEventos = ColeccionEventos.getInstancia().getEventos();
        if(allEventos.get(evento.getReserva().getNumeroCorrelativo()) == null) {
            ColeccionEventos.getInstancia().agregarEvento(evento);
            eventos.add(evento);
            return true;
        }
        return false;
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getBBDL() {
        return BBDL;
    }

    public void setBBDL(String BBDL) {
        this.BBDL = BBDL;
    }

    public String getLugarResidencia() {
        return lugarResidencia;
    }

    public void setLugarResidencia(String lugarResidencia) {
        this.lugarResidencia = lugarResidencia;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }

}