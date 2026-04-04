package Tugas;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang;
        int lebar;

        System.out.print("Masukan Panjang persegi : ");
        panjang = input.nextInt();

        System.out.print("Masukan Lebar Persegi : ");
        lebar = input.nextInt();

        int luas = panjang*lebar;

        System.out.print("Luas Persegi Panjang: " + luas);

    }
    
}
