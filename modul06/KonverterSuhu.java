package id.ac.unpas.modul06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KonverterSuhu {
    public static void main(String[] args) {
        // Membuat frame utama
        JFrame frame = new JFrame("Konverter Suhu Celcius ke Fahrenheit");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setLayout(new GridLayout(3, 2, 10, 10));

        // Komponen-komponen
        JLabel labelCelcius = new JLabel("Celcius:");
        JTextField inputCelcius = new JTextField();
        JButton btnKonversi = new JButton("Konversi");
        JLabel labelFahrenheit = new JLabel("Fahrenheit:");
        JLabel hasil = new JLabel("");

        // Menambahkan komponen ke frame
        frame.add(labelCelcius);
        frame.add(inputCelcius);
        frame.add(btnKonversi);
        frame.add(new JLabel("")); // spacer kosong
        frame.add(labelFahrenheit);
        frame.add(hasil);

        // Event untuk tombol Konversi
        btnKonversi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Ambil nilai dari JTextField
                    double celcius = Double.parseDouble(inputCelcius.getText());

                    // Konversi ke Fahrenheit
                    double fahrenheit = (celcius * 9 / 5) + 32;

                    // Tampilkan hasil
                    hasil.setText(String.format("%.2f °F", fahrenheit));
                } catch (NumberFormatException ex) {
                    // Jika input bukan angka
                    JOptionPane.showMessageDialog(frame, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Tampilkan frame
        frame.setVisible(true);
    }
}
