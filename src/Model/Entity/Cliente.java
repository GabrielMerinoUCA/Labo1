package Model.Entity;


import java.util.ArrayList;

public class Cliente {
    private String nombres;
    private String apellidos;
    private String BBDL; // Bikini Bottom Driver Lisence. Los gringos usan lisencia como ID.
    private String lugarResidencia;
    private Integer edad;
    private String numeroTelefono;
    private String lugarTrabajo;
    private ArrayList<Evento> eventos;
}