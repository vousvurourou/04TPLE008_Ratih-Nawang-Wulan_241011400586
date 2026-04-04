package Latihan;
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float makan, transport, belanja, total;
        float P_makan, P_transport, P_belanja;

        System.out.print("Masukan nominal makan: ");
        makan = input.nextFloat();
        System.out.print("Masukan nominal transport: ");
        transport = input.nextFloat();
        System.out.print("Masukan nominal belanja: ");
        belanja = input.nextFloat();
        
        total = (makan+transport+belanja);
        P_makan = (makan/total)*100;
        P_transport = (transport/total)*100;
        P_belanja = (belanja/total)*100;

        System.out.println("            DATA PENGELUARAN        ");
        System.out.println("Nominal Makan               :"+ makan);
        System.out.println("Nominal Transport           :"+ transport);
        System.out.println("Nominal Belanja             :"+ belanja);
        System.out.println("TOTAL PENGELUARAN         :");

        System.out.println("            PRESENTASE PENGELUARAN        ");
        System.out.println("Makan               :"+ P_makan);
        System.out.println("Transport           :"+ P_transport);
        System.out.println("Belanja             :"+ P_belanja);
    }
}