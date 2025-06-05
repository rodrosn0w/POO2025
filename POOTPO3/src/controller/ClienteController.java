package controller;

import modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteController {
    private static ClienteController INSTANCE = null;

    private List<Cliente> clientes = null;

    private ClienteController() {
        this.clientes = new ArrayList<Cliente>();
    }

    public static ClienteController getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ClienteController();
        }
        return INSTANCE;
    }

    public Cliente buscarClientePorID(String clienteID) {
        for (Cliente c : clientes) {
            if (c.getClienteID().equals(clienteID)) {
                return c;
            }
        }
        return null;
    }

    public void altaCliente(Cliente cliente) {
        clientes.add(cliente);
    }

}
