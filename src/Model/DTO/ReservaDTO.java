package Model.DTO;

public class ReservaDTO {
    private String fecha;
    private String hora;
    private String numeroCorrelativo;

    public ReservaDTO(String fecha, String hora, String numeroCorrelativo) {
        this.fecha = fecha;
        this.hora = hora;
        this.numeroCorrelativo = numeroCorrelativo;
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
}
