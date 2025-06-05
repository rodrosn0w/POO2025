package controller;

import modelo.Consumo;
import modelo.Tarjeta;

import java.util.ArrayList;
import java.util.List;

public class ConsumoController {
    private static ConsumoController INSTANCE = null;
    private List<Consumo> consumos = null;

    private ConsumoController() {
        this.consumos = new ArrayList<Consumo>();
    }

    public static synchronized ConsumoController getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ConsumoController();
        }
        return INSTANCE;
    }

    public void registrarConsumo(String tarjetaID, int mes, int anio, String nombreEstablecimiento , float monto) {
        Tarjeta tarjeta = TarjetaController.getInstance().buscarTarjetaPorID(tarjetaID);
        if (tarjeta == null) {
            throw new IllegalArgumentException("Tarjeta no encontrada.");
        }

        Consumo consumo = new Consumo(mes, anio, monto, nombreEstablecimiento);
        tarjeta.getConsumos().add(consumo);
    }

}
