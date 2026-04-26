/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author Ratih Nawang Wulan
 */

class StudentRecord {
    private String nama;
    private  int umur;
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public String getNama() {
        return nama;
    }
    
    public int getUmur() {
        return umur;
    }
}
public class latihan1 {
    public static void main(String[] args) {
        StudentRecord student = new StudentRecord();
        
        student.setNama("Ratih Nawang wulan");
        student.setUmur(20);
        
        System.out.println("Nama    : " + student.getNama());
        System.out.println("Umur    : " + student.getUmur());
    }
}
