package Tugas;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        int gaji_perhari;
        int jumlah_hari_kerja;

        System.out.print("Masukan Nama Karyawan : ");
        nama = input.nextLine();

        System.out.print("Masukan Gaji/hari : ");
        gaji_perhari = input.nextInt();

        System.out.print("Masukan Jumlah Hari Kerja : ");
        jumlah_hari_kerja = input.nextInt();

        int gaji_total = gaji_perhari*jumlah_hari_kerja;

        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Total Gaji Karyawan : " + gaji_total);

    }
    
}
