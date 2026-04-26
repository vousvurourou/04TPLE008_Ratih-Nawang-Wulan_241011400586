/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Ratih Nawang Wulan
 */
import java.util.Scanner;

class mahasiswa {
    private String Nama;
    private double Nilai_MTK, Nilai_Inggris, Nilai_IPA;
    
    public void setData(String nama, double mtk, double inggris, double ipa) {
        this.Nama = nama;
        this.Nilai_MTK = mtk;
        this.Nilai_Inggris = inggris;
        this.Nilai_IPA = ipa;
    }
    
    public String getNama(){
        return Nama;
    }
    
    public double getRataRata() {
        return (Nilai_MTK + Nilai_Inggris + Nilai_IPA) / 3;
    }
    
    public String getGrade() {
        double rata = getRataRata(); 
        if (rata >= 85) {
            return "A";
        } else if (rata >= 70) {
            return "B";
        } else if (rata >= 60) {
            return "C";
        } else {
            return "D";
        }
    }
    
    public String getKeterangan() {
        if (getRataRata() >= 70) {
            return "LULUS";
        } else {
            return "TIDAK LULUS";
        }
    }
}
public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ulang;
        
        do {
            System.out.print("Masukan Jumlah Mahasiswa : ");
            int n = input.nextInt();
            input.nextLine();
            
            mahasiswa[] data = new mahasiswa[n];
            
            for (int i = 0; i < n; i++) {
                data[i] = new mahasiswa();
                System.out.println("\nMahasiswa ke- " + (i+1));
                
                System.out.print("Nama          : ");
                String nama = input.nextLine();
                System.out.print("Nilai MTK     : ");
                double mtk = input.nextDouble();
                System.out.print("Nilai Inggris : ");
                double inggris = input.nextDouble();
                System.out.print("Nilai IPA     : ");
                double ipa = input.nextDouble();
                input.nextLine();
                data [i].setData(nama, mtk, inggris, ipa);
            }
            
            System.out.println("\n===== Hasil =====");
            for (int i = 0; i < n; i++){
                System.out.println("Nama        : " + data[i].getNama());
                System.out.println("Rata-rata   : " + data[i].getRataRata());
                System.out.println("Grade       : " + data[i].getGrade());
                System.out.println("Keterangan  : " + data[i].getKeterangan());
                System.out.println();
            }
            
            System.out.print("Ulangi? (y/n) : ");
            ulang = input.nextLine();
            
            System.out.println();
        } while(ulang.equalsIgnoreCase("y"));
    }
}
