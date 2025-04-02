package Controller;

import Model.DTO.ReservaDTO;
import Model.Entity.Cliente;
import Model.Entity.Reserva;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReservaController {

    public void agregarReserva() {
        ClienteController clienteController = new ClienteController();
        Cliente cliente = clienteController.crearCliente();
        Reserva reserva = crearReserva();
    }

    public Reserva crearReserva() {
        ReservaDTOController reservaDTOController ;
        String fecha;
        String hora;
        String horaFin;
        Reserva reserva;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Fecha (usar formato DD/MM/YYYY): ");
            fecha = scanner.nextLine();
            if (!isValidDate(fecha)) {
                continue;
            }

            System.out.println("\nHora (usar formato HH:MM): ");
            hora = scanner.nextLine();
            if (!isValidHour(hora)) {
                continue;
            }

            System.out.println("\nHora de finalizacion de evento (usar formato HH:MM): ");
            horaFin = scanner.nextLine();
            if (!isValidHour(horaFin)) {
                continue;
            }
            break;
        } while (true);

        reservaDTOController = new ReservaDTOController(fecha, hora, generarCodigoCorrelativo(fecha));
        reserva = reservaDTOController.getReserva();
        reserva.setHoraFin(horaFin);
        return reserva;
    }

    private boolean isValidDate(String date) {
        final String DATE_PATTERN = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
        Pattern pattern = Pattern.compile(DATE_PATTERN);
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }

    private boolean isValidHour(String hour) {
        final String HOUR_PATTERN = "^([01]\\d|2[0-3]):([0-5]\\d)$";
        Pattern pattern = Pattern.compile(HOUR_PATTERN);
        Matcher matcher = pattern.matcher(hour);
        return matcher.matches();
    }

    private String generarCodigoCorrelativo(String fecha) {
        Random random = new Random();
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char char1 = alfabeto.charAt(random.nextInt(alfabeto.length()));
        char char2 = alfabeto.charAt(random.nextInt(alfabeto.length()));

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        return "KB-" + Integer.toString(random.nextInt(10)) + Integer.toString(random.nextInt(10)) +
                "T" + char1 + char2 + random.nextInt(10) + "-" +
                fecha.replace("/", "");
    }

    public void mostrarHorariosReservados() {
    }

    public void mostrarReservasPendientes() {
    }

    public void mostrarReservasTerminadas() {
    }
}
