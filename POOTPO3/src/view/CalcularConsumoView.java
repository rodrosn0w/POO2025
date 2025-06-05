package view;

import controller.TarjetaController;

import javax.swing.*;
import java.awt.*;

public class CalcularConsumoView extends JFrame {
    private JLabel labelTarjetaID;
    private JLabel labelMes;
    private JLabel labelAnio;

    private JTextField txtTarjetaID;
    private JTextField txtMes;
    private JTextField txtAnio;

    private JButton btnCalcular;
    private JButton btnCancelar;

    public CalcularConsumoView() {
        this.setTitle("Calcular Consumo Real");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        labelTarjetaID = new JLabel("ID Tarjeta:");
        txtTarjetaID = new JTextField();

        labelMes = new JLabel("Mes:");
        txtMes = new JTextField();

        labelAnio = new JLabel("Año:");
        txtAnio = new JTextField();

        btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener(e -> calcularConsumo());

        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(e -> dispose());

        add(labelTarjetaID); add(txtTarjetaID);
        add(labelMes); add(txtMes);
        add(labelAnio); add(txtAnio);
        add(btnCalcular); add(btnCancelar);

        setVisible(true);
    }

    private void calcularConsumo() {
        try {
            String tarjetaID = txtTarjetaID.getText();
            int mes = Integer.parseInt(txtMes.getText());
            int anio = Integer.parseInt(txtAnio.getText());

            float total = TarjetaController.getInstance().calcularConsumoReal(tarjetaID, mes, anio);
            JOptionPane.showMessageDialog(this, "✔️ Consumo real: $" + total);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "❌ Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CalcularConsumoView::new);
    }
}
