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
public class T2 {
    public static void main(String args []) {
        Scanner input = new Scanner(System.in);
        
        int kategori;
        int jumlah;
        float harga = 0, total;
        
        System.out.println("===== TIKER KONSER BABY MONSTER =====");
        System.out.println("1. VIP");
        System.out.println("2. CAT 1");
        System.out.println("3. CAT 2");
        System.out.println("Pilih Kategori (1/2/3): ");
        kategori = input.nextInt();
        
        if (kategori !=1 && kategori !=2){
           System.out.println("PILIHAN TIDAK VALID!");
           return;   
        }
       
        
        System.out.print("Masukan Jumlah Tiket: ");
        jumlah = input.nextInt();
        
        if (kategori == 1){
            harga = 34000000;
        } else if (kategori == 2){
            harga = 20000000;
        } else if (kategori == 3){
            harga = 12000000;
        }
        
        total = harga * jumlah;
       
       System.out.println("=== STRUK PEMBAYARAN TIKET KONSER ===");
       if (kategori == 1){
            System.out.println("Kategori       : VIP");
       } else if (kategori == 2){
            System.out.println("Kategori       : CAT 1");
       } else {
       System.out.println("Kategori       : CAT 2");
       }
       
       System.out.println("Jumlah Tiket     : " + jumlah);
       System.out.println("Total Harga      : " + total);
       System.out.println("=====================================");
    }  
}
