package Controller;

import DTO.UsuarioResidencialDTO;
import Model.Tarifa;
import Model.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EmpresaElectricaController {

    private static EmpresaElectricaController INSATNCE = null;

    private List<Usuario> usuarios;
    private List<Tarifa> tarifas;
    private List<Factura> facturas;

    private EmpresaElectricaController() {
        this.usuarios = new ArrayList<Usuario>();
        this.tarifas = new ArrayList<Tarifa>();
        this.facturas = new ArrayList<Factura>();
    }

    public static synchronized EmpresaElectricaController getInstance() {
        if (INSATNCE == null) {
            INSATNCE = new EmpresaElectricaController();

        }
        return INSATNCE;
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
        int dni = Integer.valueOf(urDTO.getDni());
        UsuarioResidencial urdto = new UsuarioResidencial )
        usuarios.add(urdto);

    }
    //o	b) Alta de usuario industrial
    //o	c) Consulta de consumo
}
