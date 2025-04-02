package Presentation;

import Controller.ReservaController;

import java.util.Scanner;

public class Menu {
    public void mostrarMenu() {
        ReservaController reservaController = new ReservaController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bienvenido al Crustaceo Cascarudo\nQue desea hacer?");
            System.out.println(
                    "1. Agregar nueva reserva\n" +
                            "2. Mostrar horarios reservados\n" +
                            "3. Mostrar reservas pendientes\n" +
                            "4. Mostrar reservas terminadas\n" +
                            "0. Salir"
            );
            System.out.print("Ingrese una opcion: ");
            Integer opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Agregar nueva reserva");
                    reservaController.agregarReserva();
                    break;
                case 2:
                    System.out.println("Mostrar horarios reservados");
                    reservaController.mostrarHorariosReservados();
                    break;
                case 3:
                    System.out.println("Mostrar reservas pendientes");
                    reservaController.mostrarReservasPendientes();
                    break;
                case 4:
                    System.out.println("Mostrar resevas terminadas");
                    reservaController.mostrarReservasTerminadas();
                    break;
                case 0:
                    System.out.println("Saliendo del programa");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
