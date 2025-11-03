package id.ac.unpas.modul06;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author wdgus
 */
public class ContohActionListener {
    public static void main(String[] args) {
        // 1. Buat Frame (Window)
        JFrame frame = new JFrame("Contoh ActionListener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        // 2. Buat komponen (Event Source dan komponen lain)
        JLabel label = new JLabel("Halo, klik tombol di bawah!");
        JButton button = new JButton("Klik Saya!");

        // 3. Buat Event Listener
        // Menggunakan anonymous inner class
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logika yang dieksekusi saat event terjadi
                label.setText("Tombol telah diklik!");
            }
        };

        // 4. Daftarkan listener ke source (tombol)
        button.addActionListener(listener);

        // 5. Tambahkan komponen ke frame
        frame.add(label);
        frame.add(button);

        // 6. Tampilkan frame
        frame.setVisible(true);
    }
}
