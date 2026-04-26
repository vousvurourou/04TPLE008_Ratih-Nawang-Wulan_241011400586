/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;
import java.util.Scanner;

/**
 *
 * @author Ratih Nawang Wulan
 */
abstract class Tugas1 {
    public void nyala() {
        System.out.println("Kendaraan dinyalakan.");
    }
    
    public void berhenti() {
        System.out.println("Kendaraan berhenti,");
    }
    
    public abstract void jalan();
}

class Mobil extends Tugas1 {
    String namaMobil;
    Mobil(String namaMobil) {
        this.namaMobil = namaMobil;
    }

    public void jalan() {
        System.out.println(namaMobil + "berjalan di jalan raya.");
    }

    public void info() {
        System.out.println("Nama kendaraan  : " + namaMobil);
    }
}

class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("===== Program kendaraan =====");
        System.out.print("Masukan nama mobil    : ");
        String nama = input.nextLine();
        
        Mobil mobil = new Mobil(nama);
        int pilihan;
        
        do{
            System.out.println("\nMenu Kendaraan   : ");
            System.out.println("1. Lihat info");
            System.out.println("2. Nyalakan");
            System.out.println("3. Berhenti");
            System.out.println("4. Jalan");
            System.out.println("0. Keluar");
            System.out.println("Pilih menu  : ");
            pilihan = input.nextInt();
            
            switch (pilihan) {
                case 1:
                    mobil.info();
                    break;
                case 2:
                    mobil.nyala();
                    break;
                case 3:
                    mobil.jalan();
                    break;
                case 0:
                    System.out.println("Program selesai");
                    break;
                default:
                   System.out.println("Pilihan tidak valid !");
            }
        } while (pilihan !=0);
    }
}