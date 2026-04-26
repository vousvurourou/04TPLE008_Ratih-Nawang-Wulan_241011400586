import javax.swing.JOptionPane;

public class Tugas1 {
    public static void main(String[] args) {
        String inputUmur = JOptionPane.showInputDialog("Masukan Umur Anda   :");

        int umur = Integer.parseInt(inputUmur);
        String kategori;

        if (umur < 12){
            kategori = "Anak-anak";
        } else if (umur <= 17) {
            kategori = "Remaja";
        } else {
            kategori = "Dewasa";
        }
        JOptionPane.showMessageDialog(null, "Umur anda " + inputUmur + " tahun\nkategori : " + kategori);
        
    }
}