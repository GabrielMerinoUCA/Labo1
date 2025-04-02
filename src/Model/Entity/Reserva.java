package Model.Entity;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Reserva {
    private Calendar fechaHoraReserva;
    private LocalTime horaFin;
    private String numeroCorrelativo;

    public Reserva(Calendar fechaHoraReserva, LocalTime horaFin, String numeroCorrelativo) {
        this.fechaHoraReserva = fechaHoraReserva;
        this.horaFin = horaFin;
        this.numeroCorrelativo = numeroCorrelativo;
    }

    public Calendar getFechaHoraReserva() {
        return fechaHoraReserva;
    }

    public void setFechaHoraReserva(Calendar fechaHoraReserva) {
        this.fechaHoraReserva = fechaHoraReserva;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public void setHoraFin(String horaFin) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        this.horaFin = LocalTime.parse(horaFin, formatter);
    }

    public String getNumeroCorrelativo() {
        return numeroCorrelativo;
    }

    public void setNumeroCorrelativo(String numeroCorrelativo) {
        this.numeroCorrelativo = numeroCorrelativo;
    }
}
