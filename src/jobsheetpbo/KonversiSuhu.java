/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheetpbo;

/**
 *
 * @author User
 */
public class KonversiSuhu {
    public static void main (String [] args){
        System.out.println("---KONVERSI SUHU---");
        System.out.println("Suhu awal = 78 derajat celcius");
     int c = 78 ;
     int r, f, k;
     r = 4/5 * c;
     System.out.println("Suhu dalam reamur : " + r + " derajat");
     f = (9/5) * c + 32;
     System.out.println("Suhu dalam fahrenheit : " + f + " derajat");
     k = c + 273;
     System.out.println("Suhu dalam fahrenheit : " + k + " derajat");
     
    }
    
}
