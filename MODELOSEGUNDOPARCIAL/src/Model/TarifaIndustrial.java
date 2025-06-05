package Model;

public class TarifaIndustrial extends Tarifa {
    private float ibb;

    public TarifaIndustrial(float valorKwh, float iva, float ibb) {
        super(valorKwh, iva);
        this.ibb = ibb;
    }

    public float calcularTarifa(int consumo){
        float base = consumo * this.getValorKwh();
        float ivaCalculado = base * this.getIva()/100;
        float ibbCalculado = base * this.getIbb()/100;
        float total = ibbCalculado + ivaCalculado + base;

        return total;
    }

    public float getIbb() {
        return ibb;
    }

    public void setIbb(float ibb) {
        this.ibb = ibb;
    }
}
