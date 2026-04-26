package Latihan;

public class Latihan3 {
    public static void main(String[] args) {
        int makan = 35000 ;
        int transport = 20000 ;
        int belanja = 45000 ;

        int total = makan+transport+belanja;
        double diskon = total*0.10;
        double totalbayar = total - diskon;

        System.out.println("    HASIL PENGELUARAN MAHASISWA ");
        System.out.println("Makan                       :"+ makan );
        System.out.println("Transport                   :"+ transport );
        System.out.println("Belanja                     :"+ belanja );
        System.out.println("-----------------------------------------");
        System.out.println("Total sebelum diskon        :"+ total );
        System.out.println("diskon 10%                  :"+ diskon );
        System.out.println("Total setelah diskon        :"+ totalbayar );

        
        
        
    }
    
}
