package Model.Collection;

import Model.Entity.Cliente;
import java.util.HashMap;
import java.util.Map;

public class ColeccionClientes {
    private static ColeccionClientes instancia;
    private Map<String, Cliente> clientes = new HashMap<String, Cliente>();

    private ColeccionClientes(){}

    public static ColeccionClientes getInstancia() {
        if(instancia == null) {
            instancia = new ColeccionClientes();
        }
        return instancia;
    }

    /**
     * Agrega clientes y evita duplicados
     * @param cliente cliente a agregar
     * @return verdadero si no existe y por ender se guardo,
     * falso si ya existe y por ende no se guardo.
     */
    public Boolean agregarCliente(Cliente cliente) {
        if(clientes.get(cliente.getBBDL()) == null) {
            clientes.put(cliente.getBBDL(), cliente);
            return true;
        }
        return false;
    }
}
