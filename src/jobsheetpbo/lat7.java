/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheetpbo;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class lat7 {
    public static void main (String []args){
        Scanner masukan = new Scanner (System.in);
        System.out.print("Silahkan piih angka 1-3 :");
        int bil = masukan.nextInt();
        switch (bil) {
            case 1 : System.out.println ("satu");
                break;
            case 2 : System.out.println("Dua");
                break;
            case 3 : System.out.println("Tiga");
                break;
            
        }
    }
    
}
