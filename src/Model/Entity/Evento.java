package Model.Entity;

import Model.Enum.TipoEvento;
import java.util.ArrayList;

public abstract class Evento {
    protected TipoEvento tipoEvento;
    protected String codigoEvento;
    protected Float precio;
    protected Integer numeroInvitados;
    protected Float anticipo;
    protected Alimento alimento;
    protected ArrayList<Bebida> bebidas;
    protected Reserva reserva;
    protected Boolean estado; // Concretado True, no concretado False.

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getCodigoEvento() {
        return codigoEvento;
    }

    public void setCodigoEvento(String codigoEvento) {
        this.codigoEvento = codigoEvento;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Integer getNumeroInvitados() {
        return numeroInvitados;
    }

    public void setNumeroInvitados(Integer numeroInvitados) {
        this.numeroInvitados = numeroInvitados;
    }

    public Float getAnticipo() {
        return anticipo;
    }

    public void setAnticipo(Float anticipo) {
        this.anticipo = anticipo;
    }

    public Alimento getAlimento() {
        return alimento;
    }

    public void setAlimento(Alimento alimento) {
        this.alimento = alimento;
    }

    public ArrayList<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(ArrayList<Bebida> bebidas) {
        this.bebidas = bebidas;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
