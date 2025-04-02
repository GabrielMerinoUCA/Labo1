package Model.DTO;

public class ReservaTerminadaDTO {
    private String fecha;
    private String hora;
    private String numeroCorrelativo;
    private String nombreCliente;
    private String tipoEvento;
    private Boolean estadoReserva;
    private String horaFin;

    public ReservaTerminadaDTO(String fecha, String hora, String numeroCorrelativo, String nombreCliente,
                               String tipoEvento, Boolean estadoReserva, String horaFin) {
        this.fecha = fecha;
        this.hora = hora;
        this.numeroCorrelativo = numeroCorrelativo;
        this.nombreCliente = nombreCliente;
        this.tipoEvento = tipoEvento;
        this.estadoReserva = estadoReserva;
        this.horaFin = horaFin;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNumeroCorrelativo() {
        return numeroCorrelativo;
    }

    public void setNumeroCorrelativo(String numeroCorrelativo) {
        this.numeroCorrelativo = numeroCorrelativo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public Boolean getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(Boolean estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
}
