// contoh materi pada hal 5

import javax.swing.JOptionPane;

public class Latihan1 {
    public static void main(String[] args) {
        String nama = "";
        nama = JOptionPane.showInputDialog("Ketik Nama Anda  :");

        String msg = "Hello " + nama + "\nLanjutkan belajarnya pasti menjadi programmer java!";
        
        JOptionPane.showMessageDialog(null, msg);
    }
}
