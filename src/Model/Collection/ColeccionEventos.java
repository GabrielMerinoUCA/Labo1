package Model.Collection;

import Model.Entity.Evento;
import java.util.HashMap;
import java.util.Map;

// Singleton para que actue como global y no tener que pasarla a cada rato por metodos
public class ColeccionEventos {
    private static ColeccionEventos instancia;
    private Map<String, Evento> eventos = new HashMap<String, Evento>();

    private ColeccionEventos(){}

    public static ColeccionEventos getInstancia() {
        if(instancia == null) {
            instancia = new ColeccionEventos();
        }
        return instancia;
    }

    /**
     * Agrega Eventos y evita duplicados
     * @param evento
     * @return verdadero si no existe y por ender se guardo,
     *      * falso si ya existe y por ende no se guardo.
     */
    public Boolean agregarEvento(Evento evento) {
        if(eventos.get(evento.getReserva().getNumeroCorrelativo()) == null) {
            eventos.put(evento.getReserva().getNumeroCorrelativo(), evento);
            return true;
        } return false;
    }

    public Map<String, Evento> getEventos() {
        return eventos;
    }
}
