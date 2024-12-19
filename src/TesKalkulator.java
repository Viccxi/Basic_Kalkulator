import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TesKalkulator {
    public static void main(String[] args) {
        // Membuat frame
        JFrame frame = new JFrame("Kalkulator Sederhana");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel utama
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Label dan text field untuk input
        JLabel label1 = new JLabel("Masukkan bilangan pertama:");
        JTextField textField1 = new JTextField();
        JLabel label2 = new JLabel("Masukkan bilangan kedua:");
        JTextField textField2 = new JTextField();

        // Tombol operasi
        JButton btnAdd = new JButton("Penjumlahan");
        JButton btnSubtract = new JButton("Pengurangan");
        JButton btnMultiply = new JButton("Perkalian");
        JButton btnDivide = new JButton("Pembagian");

        // Area untuk menampilkan hasil
        JLabel resultLabel = new JLabel("Hasil:");
        JTextField resultField = new JTextField();
        resultField.setEditable(false); // Non-editable

        // Tambahkan elemen ke panel
        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(btnAdd);
        panel.add(btnSubtract);
        panel.add(btnMultiply);
        panel.add(btnDivide);
        panel.add(resultLabel);
        panel.add(resultField);

        // Tambahkan panel ke frame
        frame.add(panel);

        // Tambahkan aksi untuk tombol
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(textField1.getText());
                    double b = Double.parseDouble(textField2.getText());
                    Kalkulator k = new Kalkulator(a, b);
                    resultField.setText(String.valueOf(a + b));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Input tidak valid!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnSubtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(textField1.getText());
                    double b = Double.parseDouble(textField2.getText());
                    Kalkulator k = new Kalkulator(a, b);
                    resultField.setText(String.valueOf(a - b));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Input tidak valid!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(textField1.getText());
                    double b = Double.parseDouble(textField2.getText());
                    Kalkulator k = new Kalkulator(a, b);
                    resultField.setText(String.valueOf(a * b));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Input tidak valid!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(textField1.getText());
                    double b = Double.parseDouble(textField2.getText());
                    Kalkulator k = new Kalkulator(a, b);
                    if (b != 0) {
                        resultField.setText(String.valueOf(a / b));
                    } else {
                        JOptionPane.showMessageDialog(frame, "Pembagian dengan nol tidak diperbolehkan!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Input tidak valid!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Tampilkan frame
        frame.setVisible(true);
    }
}
