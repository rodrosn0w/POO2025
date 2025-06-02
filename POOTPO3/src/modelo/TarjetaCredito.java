package modelo;
import java.util.ArrayList;


public class TarjetaCredito extends Tarjeta {
    private float interes;

    public TarjetaCredito(Cliente cliente, String tarjetaID, float interes) {
        super(cliente, tarjetaID);
        this.interes = interes;
    }

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }


    public float calcularConsumoReal(int mes, int anio) {
        float total = 0;

        for (Consumo c : this.getConsumos()) {
            if (c.getMes() == mes && c.getAnio() == anio) {
                total += c.getMonto() * (1 + interes); // aplica interés
            }
        }

        return total;
    }

}
