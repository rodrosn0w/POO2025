package Model;

public abstract class Usuario {
    private Medidor medidor;
    private int idUsuario;
    private String calle;
    private int piso;
    private String dpto;
    private int codigoPostal;
    private String localidad;
    private String provincia;


    public Usuario(Medidor medidor, int idUsuario, String calle, int piso, String dpto, int codigoPostal, String localidad, String provincia) {
        this.medidor = medidor;
        this.idUsuario = idUsuario;
        this.calle = calle;
        this.piso = piso;
        this.dpto = dpto;
        this.codigoPostal = codigoPostal;
        this.localidad = localidad;
        this.provincia = provincia;

    }

    public int obtenerUltimoConsumo(int año, int bimestre){
        return this.medidor.obtenerUltimoConsumo(año, bimestre);

    }

    public Medidor getMedidor() {
        return medidor;
    }

    public void setMedidor(Medidor medidor) {
        this.medidor = medidor;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
