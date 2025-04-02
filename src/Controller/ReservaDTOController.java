package Controller;

import Model.DTO.ReservaDTO;
import Model.Entity.Reserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class ReservaDTOController {
    private ReservaDTO reservaDTO;
    //crear dtos, transformar normal a dto, transformar dto a normal

    public ReservaDTOController(String fecha, String hora, String numeroCorrelativo) {
        reservaDTO = new ReservaDTO(fecha, hora, numeroCorrelativo);
    }

    /**
     * Obtener objeto Reserva a partir de ReservaDTO
     * @return
     * @throws ParseException
     */
    public Reserva getReserva() {
        try {
            // Parsear cadenas de texto fecha y hora a Calendar para atributo "fechaHora"
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            String fechaHora = reservaDTO.getFecha() + " " + reservaDTO.getHora();
            Date date = sdf.parse(fechaHora);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            return new Reserva(calendar, null, reservaDTO.getNumeroCorrelativo());

        } catch (Exception e) {
            System.out.println("Error inesperado");
        }

        return null;
    }

    public void setReservaDTO(Reserva reserva) {
        SimpleDateFormat sdf_fecha = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = sdf_fecha.format(reserva.getFechaHoraReserva().getTime());

        SimpleDateFormat sdf_hora = new SimpleDateFormat("HH:mm");
        String hora = sdf_hora.format(reserva.getFechaHoraReserva().getTime());

        reservaDTO.setFecha(fecha);
        reservaDTO.setHora(hora);
        reservaDTO.setNumeroCorrelativo(reserva.getNumeroCorrelativo());
    }

}
