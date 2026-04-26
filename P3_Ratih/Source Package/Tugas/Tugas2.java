import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tugas2 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String nama, inputUmur, ulang;
        int umur;
        try {
            do {
                System.out.print("Ketik Nama Anda   : ");
                nama = dataIn.readLine();

                while (true) {
                    System.out.print("Ketik Umur Anda   : ");
                    inputUmur = dataIn.readLine();

                    try {
                        umur = Integer.parseInt(inputUmur);
                        break; 
                    } catch (NumberFormatException e) {
                        System.out.print("Umur harus berupa angka ! Coba lagi.");
                    }
                } 
                String kategori;
                if (umur < 12){
                    kategori = "Anak-anak";
                } else if (umur <= 17) {
                    kategori = "Remaja";
                } else {
                    kategori = "Dewasa";
                }
               
                System.out.println("\nHello " + nama);
                System.out.println("Umur anda : " + umur + " tahun");
                System.out.println("Kategori : " + kategori);
                System.out.println("tetap semangat belajar java ya!");

                System.out.print("\nIngin mengulang? (y/n) : ");
                ulang = dataIn.readLine();

                System.out.println();

            } while (ulang.equalsIgnoreCase("y"));

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan input!");
        }

    }
}