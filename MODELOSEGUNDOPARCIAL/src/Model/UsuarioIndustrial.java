package Model;

public class UsuarioIndustrial extends Usuario {
    private String razonSocial;
    private String cuit;
    private String IIBB;
    private String condicionFiscal;

    public UsuarioIndustrial(Medidor medidor, int idUsuario, String calle, int piso, String dpto, int codigoPostal, String localidad, String provincia) {
        super(medidor, idUsuario, calle, piso, dpto, codigoPostal, localidad, provincia);
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.IIBB = IIBB;
        this.condicionFiscal = condicionFiscal;
    }
}
