package Model.Collection;

import Model.Entity.TipoEvento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ColeccionTiposEventos {
    private static ColeccionTiposEventos instancia;
    private ArrayList<TipoEvento> tiposEventos = new ArrayList<TipoEvento>();

    private ColeccionTiposEventos() {}

    public static ColeccionTiposEventos getInstancia() {
        if(instancia == null) {
            instancia = new ColeccionTiposEventos();
        }
        return instancia;
    }

    public void agregarTipoEvento(TipoEvento tipoEvento) {
        tiposEventos.add(tipoEvento);
    }

    public ArrayList<TipoEvento> getTiposEventos() {
        return tiposEventos;
    }
}
