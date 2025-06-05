package DTO;

public class UsuarioIndustrialDTO {
    private String razonSocial;
    private String cuit;
    private String condicionFiscal;
    private String IIBB;

    public UsuarioIndustrialDTO(String razonSocial, String cuit, String condicionFiscal, String IIBB) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.condicionFiscal = condicionFiscal;
        this.IIBB = IIBB;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getCondicionFiscal() {
        return condicionFiscal;
    }

    public void setCondicionFiscal(String condicionFiscal) {
        this.condicionFiscal = condicionFiscal;
    }

    public String getIIBB() {
        return IIBB;
    }

    public void setIIBB(String IIBB) {
        this.IIBB = IIBB;
    }
}
