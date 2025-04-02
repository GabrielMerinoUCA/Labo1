package Model.DTO;

public class ReservaPendienteDTO {
    private String fecha;
    private String hora;
    private String numeroCorrelativo;
    private String nombreCliente;
    private String tipoEvento;

    public ReservaPendienteDTO(String fecha, String hora, String numeroCorrelativo, String nombreCliente,
                               String tipoEvento) {
        this.fecha = fecha;
        this.hora = hora;
        this.numeroCorrelativo = numeroCorrelativo;
        this.nombreCliente = nombreCliente;
        this.tipoEvento = tipoEvento;
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
}
