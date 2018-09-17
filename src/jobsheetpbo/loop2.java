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
public class loop2 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        //untuk baris 
        for (int i = 0; i < 6; i++) {
            //untuk kolom
            for (int j = 0; j <i;j++){
                //untuk menampilkan simbol
                System.out.print("@");
                
            }
           //untuk mengenter
           System.out.println("");
        }
    }
    
}
