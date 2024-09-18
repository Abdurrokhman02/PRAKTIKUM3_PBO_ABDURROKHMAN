/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas3_1;

/**
 *
 * @author Abdurrokhman
 */
public class DemoKonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KonversiSuhu2 convert = new KonversiSuhu2();
        
        double suhuC = 25.0;
        double suhuF = convert.celciusToFahrenheit(suhuC); //suhu F diambil dari hasil konversi C

        System.out.println("Suhu Celcius: " +suhuC); //Untuk menampilkan suhu C
        System.out.println("Konversi Celcius ke Fahrenheit: " + convert.celciusToFahrenheit(suhuC));
        System.out.println("Konversi Celcius ke Reamur: " + convert.celciusToReamur(suhuC));
        System.out.println("Konversi Fahrenheit ke Reamur: " + convert.fahrenheitToReamur(suhuF));
    }
    
}
