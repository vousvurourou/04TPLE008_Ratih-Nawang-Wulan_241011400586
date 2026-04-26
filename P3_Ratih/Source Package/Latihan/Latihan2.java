import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Latihan2 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String nama = "";
        System.out.print("Ketik Nama Anda   : ");

        try {
            nama = dataIn.readLine();
        }
        catch(IOException e) {
            System.out.print("Ada kesalahan !");
        }

        System.out.println();
        System.out.println("Hello " + nama + "\nLanjutkan belajarnya pasti menjadi programmer java !");
    }
    
}
