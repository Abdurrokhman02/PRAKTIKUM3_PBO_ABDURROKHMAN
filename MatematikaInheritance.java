/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas3;

/**
 *
 * @author Abdurrokhman
 */
public class MatematikaInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematika2 math = new Matematika2();
        
        System.out.println("Penjumlahan: " + math.pertambahan(10, 5));
        System.out.println("Pengurangan: " + math.pengurangan(10, 5));
        System.out.println("Perkalian: " + math.perkalian(10, 5));
        System.out.println("Pembagian: " + math.pembagian(10, 5));
        System.out.println("modulus: " + math.modulus(10, 3));
    }
}
