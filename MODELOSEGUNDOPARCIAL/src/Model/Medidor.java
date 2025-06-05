package Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Medidor {
    private int nroMedidor;
    private Date fechaInstalacion;
    private Collection<Medicion> mediciones;

    public Medidor(int nroMedidor, Date fechaInstalacion) {
        this.nroMedidor = nroMedidor;
        this.fechaInstalacion = fechaInstalacion;
        mediciones = new ArrayList<Medicion>();
    }

    public int obtenerUltimoConsumo(int año, int bimestre){
        for (Medicion medicion : mediciones) {
            if(medicion.getAño() == año && medicion.getBimestre() == bimestre){
                return medicion.getLectura();
            }
        }
        return -1;
    }

    public int getNroMedidor() {
        return nroMedidor;
    }

    public void setNroMedidor(int nroMedidor) {
        this.nroMedidor = nroMedidor;
    }

    public Date getFechaInstalacion() {
        return fechaInstalacion;
    }

    public void setFechaInstalacion(Date fechaInstalacion) {
        this.fechaInstalacion = fechaInstalacion;
    }

    public Collection<Medicion> getMediciones() {
        return mediciones;
    }

    public void setMediciones(Collection<Medicion> mediciones) {
        this.mediciones = mediciones;
    }
}
