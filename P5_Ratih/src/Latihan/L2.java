/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author Ratih Nawang Wulan
 */
public class L2 {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        float realisasi, kehadiran, tugas = 0, uts, uas;
        float p_kehadiran, p_tugas, p_uts, p_uas, nilai_akhir;
        float P_hadir;
        
        System.out.print("Masukan Realisasi Kehadiran: ");
        realisasi = input.nextFloat();
        System.out.print("Masukan Jumlah Kehadiran: ");
        kehadiran = input.nextFloat();
        System.out.print("Masukan Nilai UTS: ");
        uts = input.nextFloat();
        System.out.print("Masukan Nilai UAS: ");
        uas = input.nextFloat();
        
        P_hadir = kehadiran/realisasi;
        
        p_kehadiran = (kehadiran/realisasi * 10);
        p_tugas = (tugas * 20 / 100);
        p_uts = (uts * 30 / 100);
        p_uas = (uas * 40 /100);
        
        nilai_akhir = p_kehadiran + p_tugas + p_uts + p_uas;
                
        if (P_hadir >= 0.75) { 
            if (nilai_akhir <= 100 && nilai_akhir >= 80){
                System.out.println("Nilai: " + nilai_akhir + "GRADE A");
            } else if (nilai_akhir < 80 && nilai_akhir >= 70){
                System.out.println("Nilai: " + nilai_akhir + "GRADE B");
            } else if (nilai_akhir < 70 && nilai_akhir >= 60){
                System.out.println("Nilai: " + nilai_akhir + "GRADE C");
            } else if (nilai_akhir < 60 && nilai_akhir >= 55) {
                System.out.println("Nilai: " + nilai_akhir + "GRADE D");
            } else if (nilai_akhir < 55) {
                System.out.println("Nilai: " + nilai_akhir + "GRADE E");
            }
        } else {
            if (nilai_akhir >= 55){
                System.out.println("Nilai: 55 GRADE D");
                System.out.println("TIDAK LULUS !");
            } else {
                System.out.println("Nilai : " + nilai_akhir + "GRADE E");
                System.out.println("TIDAK LULUS !");
            }
        }
    }
}
