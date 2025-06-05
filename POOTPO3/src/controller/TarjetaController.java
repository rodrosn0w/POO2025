package controller;

import dto.TarjetaDTO;
import modelo.Cliente;
import modelo.Tarjeta;
import modelo.TarjetaCredito;
import modelo.TarjetaDebito;

import java.util.ArrayList;
import java.util.List;

public class TarjetaController {
    private static TarjetaController INSTANCE = null;
    private List<Tarjeta> tarjetas = null;

    private TarjetaController() {
        this.tarjetas = new ArrayList<Tarjeta>();
    }

    public static synchronized TarjetaController getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new TarjetaController();
        }
        return INSTANCE;
    }

    public void altaTarjetaCredito(TarjetaDTO tdto) {
        Cliente cliente = ClienteController.getInstance().buscarClientePorID(tdto.getClienteID());
        if (cliente == null) {
            throw new RuntimeException("Cliente no encontrado");
        }

        // Validaciones
        for (Tarjeta t : tarjetas) {
            if (t.getCliente().getClienteID().equals(cliente.getClienteID())) {
                throw new IllegalStateException("❌ El cliente ya tiene una tarjeta asignada");
            }

            if (t.getTarjetaID().equals(tdto.getTarjetaID())) {
                throw new IllegalStateException("❌ Ya existe una tarjeta con ese ID");
            }
        }

        TarjetaCredito tc = new TarjetaCredito(cliente, tdto.getTarjetaID(), 0.10f); // 10% interés
        tarjetas.add(tc);

        System.out.println("✔️ Tarjeta de crédito creada para el cliente " + cliente.getNombre());


    }

    public void altaTarjetaDebito(TarjetaDTO tdto) {
        Cliente cliente = ClienteController.getInstance().buscarClientePorID(tdto.getClienteID());
        if (cliente == null) {
            throw new RuntimeException("Cliente no encontrado");
        }

        for (Tarjeta t : tarjetas) {
            if (t.getCliente().getClienteID().equals(cliente.getClienteID())) {
                throw new IllegalStateException("❌ El cliente ya tiene una tarjeta asignada");
            }

            if (t.getTarjetaID().equals(tdto.getTarjetaID())) {
                throw new IllegalStateException("❌ Ya existe una tarjeta con ese ID");
            }
        }

        TarjetaDebito td = new TarjetaDebito(cliente, tdto.getTarjetaID(), 0.21f); // por ejemplo: 21% de IVA
        tarjetas.add(td);

        System.out.println("✔️ Tarjeta de débito creada para el cliente " + cliente.getNombre());
    }

    public float calcularConsumoReal(String tarjetaID, int mes, int anio) {
        for (Tarjeta t : tarjetas) {
            if (t.getTarjetaID().equals(tarjetaID)) {
                return t.calcularConsumoReal(mes, anio);
            }
        }
        throw new IllegalArgumentException("❌ No se encontró la tarjeta con ID: " + tarjetaID);
    }

    public Tarjeta buscarTarjetaPorID(String tarjetaID) {
        for (Tarjeta t : tarjetas) {
            if (t.getTarjetaID().equals(tarjetaID)) {
                return t;
            }
        }
        return null;
    }


}
