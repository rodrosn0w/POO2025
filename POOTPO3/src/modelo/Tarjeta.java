package modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class Tarjeta {
    private Cliente cliente;
    private List<Consumo> consumos;
    private String tarjetaID;

    public Tarjeta(Cliente cliente, String tarjetaID) {
        this.cliente = cliente;
        this.consumos = new ArrayList<Consumo>();
        this.tarjetaID = tarjetaID;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Consumo> getConsumos() {
        return consumos;
    }

    public void setConsumos(List<Consumo> consumos) {
        this.consumos = consumos;
    }

    public String getTarjetaID() {
        return tarjetaID;
    }

    public void setTarjetaID(String tarjetaID) {
        this.tarjetaID = tarjetaID;
    }

    public abstract float calcularConsumoReal(int anio, int mes);

}
