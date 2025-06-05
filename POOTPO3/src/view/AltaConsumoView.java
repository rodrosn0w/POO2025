package view;

import controller.ConsumoController;

import javax.swing.*;
import java.awt.*;

public class AltaConsumoView extends JFrame {
    private JLabel labelTarjetaID;
    private JLabel labelMes;
    private JLabel labelAnio;
    private JLabel labelComercio;
    private JLabel labelMonto;

    private JTextField txtTarjetaID;
    private JTextField txtMes;
    private JTextField txtAnio;
    private JTextField txtComercio;
    private JTextField txtMonto;

    private JButton btnGuardar;
    private JButton btnCancelar;

    public AltaConsumoView() {
        this.setTitle("Alta de Consumo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        labelTarjetaID = new JLabel("ID Tarjeta:");
        txtTarjetaID = new JTextField();

        labelMes = new JLabel("Mes:");
        txtMes = new JTextField();

        labelAnio = new JLabel("Año:");
        txtAnio = new JTextField();

        labelComercio = new JLabel("Nombre del comercio:");
        txtComercio = new JTextField();

        labelMonto = new JLabel("Monto:");
        txtMonto = new JTextField();

        btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(e -> guardarConsumo());

        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(e -> dispose());

        add(labelTarjetaID); add(txtTarjetaID);
        add(labelMes); add(txtMes);
        add(labelAnio); add(txtAnio);
        add(labelComercio); add(txtComercio);
        add(labelMonto); add(txtMonto);
        add(btnGuardar); add(btnCancelar);

        setVisible(true);
    }

    private void guardarConsumo() {
        try {
            String tarjetaID = txtTarjetaID.getText();
            int mes = Integer.parseInt(txtMes.getText());
            int anio = Integer.parseInt(txtAnio.getText());
            String comercio = txtComercio.getText();
            float monto = Float.parseFloat(txtMonto.getText());

            ConsumoController.getInstance().registrarConsumo(tarjetaID, mes, anio, comercio, monto);
            JOptionPane.showMessageDialog(this, "✔️ Consumo registrado correctamente.");
            dispose();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "❌ Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AltaConsumoView::new);
    }
}
