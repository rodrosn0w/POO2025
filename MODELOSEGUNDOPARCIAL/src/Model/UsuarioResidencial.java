package Model;

public class UsuarioResidencial extends Usuario{
    private String nombre;
    private int dni;

    public UsuarioResidencial(Medidor medidor, int idUsuario, String calle, int piso, String dpto, int codigoPostal, String localidad, String provincia, String nombre, int dni) {
        super(medidor, idUsuario, calle, piso, dpto, codigoPostal, localidad, provincia);
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
