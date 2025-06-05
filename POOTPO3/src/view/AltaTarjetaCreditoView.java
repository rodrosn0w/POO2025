package view;

import controller.TarjetaController;
import dto.TarjetaDTO;

import javax.swing.*;
import java.awt.*;

public class AltaTarjetaCreditoView extends JFrame {
    private JLabel labelClienteID;
    private JLabel labelTarjetaID;

    private JTextField txtClienteID;
    private JTextField txtTarjetaID;

    private JButton btnGuardar;
    private JButton btnCancelar;

    private TarjetaController tarjetaController;



    public AltaTarjetaCreditoView() {
        this.setTitle("Alta Tarjeta Credito");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(3, 2));
        tarjetaController = TarjetaController.getInstance();

        labelClienteID = new JLabel("Cliente ID");
        add(labelClienteID);

        txtClienteID = new JTextField();
        add(txtClienteID);

        labelTarjetaID = new JLabel("Tarjeta ID");
        add(labelTarjetaID);

        txtTarjetaID = new JTextField();
        add(txtTarjetaID);

        btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(e -> GuardarTarjeta());
        add(btnGuardar);

        btnCancelar = new JButton("Cancelar");
        add(btnCancelar);

        setVisible(true);

    }

    private void GuardarTarjeta() {
        String clienteID = txtClienteID.getText();
        String tarjetaID = txtTarjetaID.getText();

        try {
            TarjetaDTO tdto = new TarjetaDTO(clienteID, tarjetaID);
            tarjetaController.altaTarjetaCredito(tdto);
            JOptionPane.showMessageDialog(this, "Tarjeta de crédito creada correctamente.");
            dispose(); // Cierra la ventana
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater((AltaTarjetaCreditoView::new));
    }

}