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
public class FungsiPengembalianNilai {
    public static void main (String [] args){
    Scanner masukan = new Scanner (System.in);
    int a,b,c;
    System.out.println("program menjumlakan 2 nilai");
    System.out.print("masukkan nilai a : ");
    a=masukan.nextInt();
    System.out.println("masukkan nilai b : ");
    b=masukan.nextInt();
    System.out.print("masukkan nilai c : ");
    c= masukan.nextInt();
    System.out.println();
    int jumlah;
    System.out.println("jumlah a+b:"+(jumlah(a,b)));
    System.out.println("jumlah b+c:"+(jumlah(b,c)));
    System.out.println("jumlah a+c:"+(jumlah(a,c)));
    
    //konstruktor
    private static int jumlah(int a,int b){
        int hasil = a+b;
        return hasil;
    }
}

