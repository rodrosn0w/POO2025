package modelo;

import java.util.Date;

public class Consumo {
    private int anio;
    private int mes;
    private float monto;
    private String nombreEstablecimiento;

    public Consumo(int anio, int mes, float monto, String nombreEstablecimiento) {
        this.anio = anio;
        this.mes = mes;
        this.monto = monto;
        this.nombreEstablecimiento = nombreEstablecimiento;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }


    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }
}
