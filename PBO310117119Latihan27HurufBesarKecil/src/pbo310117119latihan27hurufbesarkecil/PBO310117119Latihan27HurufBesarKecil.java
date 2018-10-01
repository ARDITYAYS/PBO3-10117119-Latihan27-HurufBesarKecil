/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan27hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author Yogaputra
 * Nama : Arditya Yogaputra S 
 * Kelas : IF-3 / PBO-3 
 * Nim : 10117119 
 * Deskripsi : Program ini dapat membuat dua kalimat menjadi  besar dan kecil
 */
public class PBO310117119Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String Kalimat;
        
        Scanner scenner = new Scanner(System.in);
    
        System.out.print("Masukan Kalimat : ");
        Kalimat = scenner.nextLine();
        
        System.out.print("");
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : " + Kalimat.toUpperCase());
        System.out.println("Huruf Kecil : " + Kalimat.toLowerCase());
    }
    
}
