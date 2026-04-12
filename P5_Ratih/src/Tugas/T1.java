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
public class T1 {
    public static void main (String args []){
        Scanner input = new Scanner(System.in);
        
        int layanan;
        int jumlah;
        float panjang, lebar, luas;
        float harga = 0, total;
        
        System.out.println("Pilih Layanan: )");
        System.out.println("1. Banner");
        System.out.println("2. Stiker");
        System.out.print("Pilih Layanan (1/2): ");
        layanan = input.nextInt();
        
        if (layanan !=1 && layanan !=2){
           System.out.println("PILIHAN TIDAK VALID!");
           return;   
        }
       
        System.out.print("Masukan Panjang (meter): ");
        panjang = input.nextFloat();
        System.out.print("Masukan Lebar (meter): ");
        lebar = input.nextFloat();
        System.out.print("Masukan Jumlah: ");
        jumlah = input.nextInt();
        
        luas = panjang * lebar;
        
        if (luas < 1){
            luas = 1;
        }
        
        if (layanan == 1){
            harga = 20000;
        } else if (layanan == 2) {
            harga = 60000;
        }
        
        total = luas * harga * jumlah;
        
        System.out.println("===== STRUK PRINTIQUE =====");
        System.out.println("Pilih Layanan : " + layanan);
        System.out.println("Jumlah L/P (meter) : " + luas + "m2");
        System.out.println("Jumlah Cetak: " + jumlah);
        System.out.println("Total Harga : " + total); 
        System.out.println("===========================");
        
    }
}
