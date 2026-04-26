/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;
public abstract class Latihan1 {
    public void breath() {
        System.out.println("Bernafas melalui hidung."); 
    }
    
    public void eat() {
        System.out.println("Makan melalui mulut."); 
    }
    
    public abstract void walk();
}
class Human extends Latihan1{
    public void walk(){
        System.out.println("Manusia berjalan dengan dua kaki.");
    }
}
/**
 *
 * @author Ratih Nawang Wulan
 */
class Main {
    public static void main(String[] args) {
        Human manusia = new Human();
        
        System.out.println("===== Latihan Objek Manusia =====");
        manusia.breath();
        manusia.eat();
        manusia.walk();
    }
    
}
