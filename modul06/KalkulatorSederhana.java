package id.ac.unpas.modul06;

import javax.swing.*;
import java.awt.*;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        // Membuat frame utama
        JFrame frame = new JFrame("Kalkulator Sederhana");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(new BorderLayout());

        // Membuat layar kalkulator (bagian atas)
        JTextField layar = new JTextField();
        layar.setEditable(false); // layar tidak bisa diketik langsung
        layar.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(layar, BorderLayout.NORTH);

        // Panel untuk tombol-tombol angka dan operator
        JPanel panelTombol = new JPanel();
        panelTombol.setLayout(new GridLayout(4, 4, 5, 5));

        // Daftar tombol (10 angka dan 4 operator)
        String[] tombol = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            "0", "C", "=", "/"
        };

        // Menambahkan tombol ke panel
        for (String t : tombol) {
            JButton btn = new JButton(t);
            panelTombol.add(btn);
        }

        // Menambahkan panel tombol ke frame (tengah)
        frame.add(panelTombol, BorderLayout.CENTER);

        // Tampilkan jendela
        frame.setVisible(true);
    }
}
