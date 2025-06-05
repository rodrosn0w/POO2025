package view;

import controller.TarjetaController;
import dto.TarjetaDTO;

import javax.swing.*;
import java.awt.*;

public class AltaTarjetaDebitoVew extends JFrame {
    private JLabel labelClienteID;
    private JLabel labelTarjetaID;

    private JTextField txtClienteID;
    private JTextField txtTarjetaID;

    private JButton btnGuardar;
    private JButton btnCancelar;

    private TarjetaController tarjetaController;

    public AltaTarjetaDebitoVew() {
        this.setTitle("Alta Tarjeta Débito");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        tarjetaController = TarjetaController.getInstance();

        labelClienteID = new JLabel("Cliente ID:");
        txtClienteID = new JTextField();

        labelTarjetaID = new JLabel("Tarjeta ID:");
        txtTarjetaID = new JTextField();

        btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(e -> guardarTarjeta());

        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(e -> dispose());

        add(labelClienteID); add(txtClienteID);
        add(labelTarjetaID); add(txtTarjetaID);
        add(btnGuardar); add(btnCancelar);

        setVisible(true);
    }

    private void guardarTarjeta() {
        String clienteID = txtClienteID.getText();
        String tarjetaID = txtTarjetaID.getText();

        try {
            TarjetaDTO dto = new TarjetaDTO(clienteID, tarjetaID);
            tarjetaController.altaTarjetaDebito(dto);
            JOptionPane.showMessageDialog(this, "✔️ Tarjeta de débito creada correctamente.");
            dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "❌ Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AltaTarjetaDebitoVew::new);
    }
}
