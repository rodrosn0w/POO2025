package DTO;

import java.util.Date;

public class MedicionDTO {
    private Date fechaLectura;
    private int año;
    private int bimestre;
    private int lectura;

    public MedicionDTO(Date fechaLectura, int año, int bimestre, int lectura) {
        this.fechaLectura = fechaLectura;
        this.año = año;
        this.bimestre = bimestre;
        this.lectura = lectura;
    }

    public Date getFechaLectura() {
        return fechaLectura;
    }

    public void setFechaLectura(Date fechaLectura) {
        this.fechaLectura = fechaLectura;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getBimestre() {
        return bimestre;
    }

    public void setBimestre(int bimestre) {
        this.bimestre = bimestre;
    }

    public int getLectura() {
        return lectura;
    }

    public void setLectura(int lectura) {
        this.lectura = lectura;
    }
}
