package Controller;

import DTO.UsuarioResidencialDTO;
import Model.Tarifa;
import Model.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class EmpresaElectricaController {

    private static EmpresaElectricaController INSTANCE = null;

    private List<Usuario> usuarios;
    private List<Tarifa> tarifas;
    private List<Factura> facturas;

    private EmpresaElectricaController() {
        this.usuarios = new ArrayList<Usuario>();
        this.tarifas = new ArrayList<Tarifa>();
        this.facturas = new ArrayList<Factura>();
    }

    public static synchronized EmpresaElectricaController getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new EmpresaElectricaController();

        }
        return INSTANCE;
    }

    //o	a) Alta de usuario residencial
    public void altaUsuarioResidencial(UsuarioResidencialDTO urDTO) {
        for (Usuario u : usuarios) {
            if(u instanceof UsuarioResidencial) {
                UsuarioResidencial ur = (UsuarioResidencial) u;
                if (ur.getNombre().equals(urDTO.getNombre())) {
                    System.out.println("Ya existe un usuario con ese nombre");
                    return;
                }
            }
        }

        UsuarioResidencial urdto = toModel(urDTO);
        usuarios.add(urdto);
    }

    private static UsuarioResidencial toModel(UsuarioResidencialDTO dto) {
        Medidor medidor = new Medidor(123, new Date()); // o generar el número dinámicamente si querés

        return new UsuarioResidencial(
                medidor,
                0, // idUsuario, lo podés inicializar en 0 si se asigna después
                dto.getCalle(),
                dto.getPiso(),
                dto.getDpto(),
                dto.getCodigoPostal(),
                dto.getLocalidad(),
                dto.getProvincia(),
                dto.getNombre(),
                dto.getDni()
        );
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Tarifa> getTarifas() {
        return tarifas;
    }

    public void setTarifas(List<Tarifa> tarifas) {
        this.tarifas = tarifas;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }
    //o	b) Alta de usuario industrial
    //o	c) Consulta de consumo
}
