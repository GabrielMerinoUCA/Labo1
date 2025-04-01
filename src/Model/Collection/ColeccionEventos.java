package Model.Collection;

import Model.Entity.Evento;

import java.util.ArrayList;

public class ColeccionEventos {
    private ArrayList<Evento> eventos;

    public void agregarEvento(Evento evento) {
        eventos.add(evento);
    }


}
