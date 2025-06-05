package Model;

public abstract class Tarifa {
    private float valorKwh;
    private float iva;

    public Tarifa(float valorKwh, float iva) {
        this.valorKwh = valorKwh;
        this.iva = iva;
    }
    public float calcularTarifa() {
        return valorKwh * iva;
    }

    public float getValorKwh() {
        return valorKwh;
    }

    public void setValorKwh(float valorKwh) {
        this.valorKwh = valorKwh;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }
}
