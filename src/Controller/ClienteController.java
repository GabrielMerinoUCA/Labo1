package Controller;

import Model.Entity.Cliente;

import java.util.Scanner;

public class ClienteController {
    public Cliente crearCliente() {
        String nombres;
        String apellidos;
        String BBDL;
        String lugarResidecia;
        Integer edad;
        String numeroTelefono;
        String lugarTrabajo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("| Datos del cliente |");

        System.out.print("Apellidos: ");
        apellidos = scanner.nextLine();

        System.out.print("\nNombres: ");
        nombres  = scanner.nextLine();

        System.out.print("\nID: ");
        BBDL = scanner.nextLine();

        System.out.print("\nLugar de residencia: ");
        lugarResidecia = scanner.nextLine();

        System.out.print("\nEdad: ");
        edad = scanner.nextInt();

        System.out.print("\nNumero de telefono: ");
        numeroTelefono = scanner.nextLine();

        System.out.print("\nLugar de trabajo (Si no aplica, escribir 0): ");
        lugarTrabajo  = scanner.nextLine();
        lugarTrabajo = lugarTrabajo.equals("0") ? "" : lugarTrabajo;

        return new Cliente(nombres, apellidos, BBDL, lugarResidecia, edad, numeroTelefono, lugarTrabajo);
    }
}
