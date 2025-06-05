package Model;

import java.util.Date;

public class Medicion {
    private Date fechaLectura;
    private int año;
    private int bimestre;
    private int lectura;

    public Medicion(Date fechaLectura, int año, float montoTotal, int lectura) {
        this.fechaLectura = fechaLectura;
        this.año = año;
        this.bimestre = bimestre;
        this.lectura = lectura;
    }

    public int getLectura(){
        return lectura;
    }
    public int getAño(){
        return año;
    }
    public int getBimestre(){
        return bimestre;
    }
}
