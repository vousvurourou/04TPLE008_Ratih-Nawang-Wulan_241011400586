/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author Ratih Nawang Wulan
 */
import java.util.Scanner;

class Segitiga {
    private double alas;
    private double tinggi;
    
    public void setAlas(double alas) {
        this.alas = alas;
    }
    
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    public double getAlas() {
        return alas;
    }
    
    public double getTinggi() {
        return tinggi;
    }
    
    public double getLuas() {
        return 0.5*alas*tinggi;
    }
    
}
public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Jumlah Segitiga   : ");
        int n = input.nextInt();
        
        Segitiga[] s = new Segitiga[n];
        
        for (int i = 0; i < n; i++) {
            s[i] = new Segitiga();
            
            System.out.println("\nSegitiga ke- " + (i+1));
            System.out.print("Masukan alas      : ");
            double alas = input.nextDouble();
            
            System.out.println("Masukan tinggi      :");
            double tinggi = input.nextDouble();
            
            s[i].setAlas(alas);
            s[i].setTinggi(tinggi);
        }
        
        System.out.println("\n===== Hasil =====");
        for (int i = 0; i < n; i++) {
            System.out.println("Segitiga ke- " + (i + 1));
            System.out.println("Alas        : " + s[i].getAlas());
            System.out.println("Tinggi      : " + s[i].getTinggi());
            System.out.println("Luas        : " + s[i].getLuas());
            System.out.println();
        }
    }
    
}
