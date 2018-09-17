/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbojobsheet1;

/**
 *
 * @author GL62
 */
import java.util.*;
public class Kondisi {
 public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     int angka;
     System.out.print("Masukan Nilai Akhir PBO = ");  
         angka = input.nextInt();
         if (angka <70){
             System.out.println("Silahkan mengerjakan Remidi");
         }
         else {
             System.out.println("Selamat Anda Lulus");
         }
       
 }   
}
