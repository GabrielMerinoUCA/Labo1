package Model.Collection;

import Model.Entity.Evento;

import java.util.HashMap;
import java.util.Map;

// Singleton para que actue como global y no tener que pasarla a cada rato por metodos
public class ColeccionEventos {
    private static ColeccionEventos instancia;
    private Map<String, Evento> eventos = new HashMap<String, Evento>();



    public static ColeccionEventos getInstancia() {
        if(instancia == null) {
            instancia = new ColeccionEventos();
        }
        return instancia;
    }

    public void agregarEvento(Evento evento) {
        //eventos.put(evento. ,evento);
    }
}
