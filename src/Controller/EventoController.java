package Controller;

import Model.Collection.ColeccionTiposEventos;
import Model.Entity.*;

import java.util.ArrayList;
import java.util.Scanner;

public class EventoController {
    public Evento crearEvento() {
        TipoEvento tipoEvento;
        String codigoEvento;
        Float precio;
        Integer numeroInvitados;
        Float anticipo;
        Alimento alimento;
        ArrayList<Bebida> bebidas;
        Reserva reserva;
        Evento evento;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el tipo de evento");
        ArrayList<TipoEvento> tiposEventos = ColeccionTiposEventos.getInstancia().getTiposEventos();
        int index = 1;
        for(TipoEvento te: tiposEventos) {
            System.out.println(Integer.toString(index) + ". " + te.getTipoEvento());
            index++;
        }
        index = 0;
        do {
            System.out.print("Tipo de evento: ");
            index = scanner.nextInt() - 1; // porque el menu empiesa en 1
            if(index > tiposEventos.size() || index < 0) {
                System.out.println("Numero invalido");
                continue;
            }
            tipoEvento =
            break;
        } while(true);



        return evento;
    }
}
