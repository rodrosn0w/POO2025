package View;

import Controller.EmpresaElectricaController;
import DTO.UsuarioResidencialDTO;
import Model.UsuarioResidencial;

import javax.swing.*;
import java.awt.*;

import static java.awt.AWTEventMulticaster.add;

public class AltaUsuarioResidencialView extends JFrame {
    private JLabel labelnombre;
    private JLabel labeldni;

    private JTextField txtnombre;
    private JTextField txtDNI;

    private JButton btnGuardar;
    private JButton btnCancelar;

    private EmpresaElectricaController empresaElectricaController;

    public AltaUsuarioResidencialView() {
        this.setTitle("Alta de Usuario Residencial");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(2, 2));
        empresaElectricaController = EmpresaElectricaController.getInstance();

        labelnombre = new JLabel("Nombre: ");
        add(labelnombre);

        txtnombre = new JTextField();
        add(txtnombre);

        labeldni = new JLabel("DNI: ");
        add(labeldni);

        txtDNI = new JTextField();
        add(txtDNI);

        btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(e -> GuardarUsuario());
        add(btnGuardar);

        btnCancelar = new JButton("Cancelar");

        add(btnCancelar);


        setVisible(true);
    }
    private void GuardarUsuario() {
        String nombre = txtnombre.getText();
        String dni = txtDNI.getText();

        UsuarioResidencialDTO urdto = new UsuarioResidencialDTO(nombre, dni);

        try{
            empresaElectricaController.altaUsuarioResidencial(urdto);
            JOptionPane.showMessageDialog(null, "Usuario guardado");
            dispose();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater((AltaUsuarioResidencialView::new));
    }
}

// CASTEO valueOf para chequear DNI