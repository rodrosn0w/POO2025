package View;

import Controller.EmpresaElectricaController;
import DTO.UsuarioResidencialDTO;
import Model.UsuarioResidencial;

import javax.swing.*;
import java.awt.*;

import static java.awt.AWTEventMulticaster.add;

public class AltaUsuarioResidencialView extends JFrame {
    private JTextField txtNombre, txtDNI, txtCalle, txtAltura, txtPiso, txtDpto, txtCodigoPostal, txtLocalidad, txtProvincia;
    private JButton btnGuardar, btnCancelar;
    private EmpresaElectricaController empresaElectricaController;

    public AltaUsuarioResidencialView() {
        this.setTitle("Alta de Usuario Residencial");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(11, 2)); // 9 campos + botones

        empresaElectricaController = EmpresaElectricaController.getInstance();

        // Campos
        add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        add(txtNombre);

        add(new JLabel("DNI:"));
        txtDNI = new JTextField();
        add(txtDNI);

        add(new JLabel("Calle:"));
        txtCalle = new JTextField();
        add(txtCalle);

        add(new JLabel("Altura:"));
        txtAltura = new JTextField();
        add(txtAltura);

        add(new JLabel("Piso:"));
        txtPiso = new JTextField();
        add(txtPiso);

        add(new JLabel("Dpto:"));
        txtDpto = new JTextField();
        add(txtDpto);

        add(new JLabel("Código Postal:"));
        txtCodigoPostal = new JTextField();
        add(txtCodigoPostal);

        add(new JLabel("Localidad:"));
        txtLocalidad = new JTextField();
        add(txtLocalidad);

        add(new JLabel("Provincia:"));
        txtProvincia = new JTextField();
        add(txtProvincia);

        // Botones
        btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(e -> guardarUsuario());
        add(btnGuardar);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(e -> dispose());
        add(btnCancelar);

        setVisible(true);
    }
    private void guardarUsuario() {
        try {
            String nombre = txtNombre.getText();
            int dni = Integer.parseInt(txtDNI.getText());
            String calle = txtCalle.getText();
            int altura = Integer.parseInt(txtAltura.getText());
            int piso = Integer.parseInt(txtPiso.getText());
            String dpto = txtDpto.getText();
            int codigoPostal = Integer.parseInt(txtCodigoPostal.getText());
            String localidad = txtLocalidad.getText();
            String provincia = txtProvincia.getText();

            UsuarioResidencialDTO dto = new UsuarioResidencialDTO(
                    nombre, dni, calle, altura, piso, dpto, codigoPostal, localidad, provincia
            );

            empresaElectricaController.altaUsuarioResidencial(dto);
            JOptionPane.showMessageDialog(null, "Usuario guardado con éxito.");
            dispose();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: ingresá solo números donde corresponde.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AltaUsuarioResidencialView::new);
    }
}

// CASTEO valueOf para chequear DNI