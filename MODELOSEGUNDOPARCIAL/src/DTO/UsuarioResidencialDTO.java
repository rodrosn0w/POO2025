package DTO;

public class UsuarioResidencialDTO {

    private String nombre;
    private int dni;
    private String calle;
    private int altura;
    private int piso;
    private String dpto;
    private int codigoPostal;
    private String localidad;
    private String provincia;

    public UsuarioResidencialDTO(String nombre, int dni, String calle, int altura, int piso,
                                 String dpto, int codigoPostal, String localidad, String provincia) {
        this.nombre = nombre;
        this.dni = dni;
        this.calle = calle;
        this.altura = altura;
        this.piso = piso;
        this.dpto = dpto;
        this.codigoPostal = codigoPostal;
        this.localidad = localidad;
        this.provincia = provincia;
    }

    // Getters y setters...

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getDni() { return dni; }
    public void setDni(int dni) { this.dni = dni; }

    public String getCalle() { return calle; }
    public void setCalle(String calle) { this.calle = calle; }

    public int getAltura() { return altura; }
    public void setAltura(int altura) { this.altura = altura; }

    public int getPiso() { return piso; }
    public void setPiso(int piso) { this.piso = piso; }

    public String getDpto() { return dpto; }
    public void setDpto(String dpto) { this.dpto = dpto; }

    public int getCodigoPostal() { return codigoPostal; }
    public void setCodigoPostal(int codigoPostal) { this.codigoPostal = codigoPostal; }

    public String getLocalidad() { return localidad; }
    public void setLocalidad(String localidad) { this.localidad = localidad; }

    public String getProvincia() { return provincia; }
    public void setProvincia(String provincia) { this.provincia = provincia; }
}
