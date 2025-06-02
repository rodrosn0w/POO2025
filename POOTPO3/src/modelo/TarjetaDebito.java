package modelo;

public class TarjetaDebito extends Tarjeta {
    private float devIVA;

    public TarjetaDebito(Cliente cliente, String tarjetaID, int mes, float devIVA) {
        super(cliente, tarjetaID);
    }

    public float getDevIVA() {
        return devIVA;
    }

    public void setDevIVA(float devIVA) {
        this.devIVA = devIVA;
    }

    public float calcularConsumoReal(int mes, int anio) {
        float total = 0;

        for (Consumo c : this.getConsumos()) {
            if (c.getMes() == mes && c.getAnio() == anio) {
                total += c.getMonto() * (1 - devIVA); // aplica interés
            }
        }

        return total;
    }
}
