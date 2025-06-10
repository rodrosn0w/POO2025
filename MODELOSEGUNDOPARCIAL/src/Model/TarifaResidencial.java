package Model;

public class TarifaResidencial extends Tarifa {
    private String nombre;

    public TarifaResidencial(float valorKwh, float iva) {
        super(valorKwh, iva);
    }
}
