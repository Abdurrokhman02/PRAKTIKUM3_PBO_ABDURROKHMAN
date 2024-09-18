/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3_1;

/**
 *
 * @author Abdurrokhman
 */

//inheritance dengan class Matematika
public class KonversiSuhu2 extends KonversiSuhu{
    //konversi fahrenheit ke reamur
    public double fahrenheitToReamur(double fahrenheit) {
        return (fahrenheit-32)* 4/9;
    }
}
