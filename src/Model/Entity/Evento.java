package Model.Entity;

import Model.Enum.TipoEvento;
import java.util.ArrayList;

public abstract class Evento {
    protected TipoEvento tipoEvento;
    protected Integer EventoID;
    protected Float precio;
    protected Integer numeroInvitados;
    protected Float anticipo;
    protected Alimento alimento;
    protected ArrayList<Bebida> bebidas;
    protected Reserva reserva;
    protected Boolean estado; // Concretado True, no concretado False.


}
