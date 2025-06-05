package dto;

import modelo.Cliente;
import modelo.Consumo;

import java.util.List;

public class TarjetaDTO {
    private String clienteID;
    private String tarjetaID;

    public TarjetaDTO(String clienteID, String tarjetaID) {
        this.clienteID = clienteID;
        this.tarjetaID = tarjetaID;
    }

    public String getClienteID() {
        return clienteID;
    }

    public void setClienteID(String clienteID) {
        this.clienteID = clienteID;
    }

    public String getTarjetaID() {
        return tarjetaID;
    }

    public void setTarjetaID(String tarjetaID) {
        this.tarjetaID = tarjetaID;
    }
}
