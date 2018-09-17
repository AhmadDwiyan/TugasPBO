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
public class Konvrensisushu {
   public static void main(String[] args){
       System.out.println("====KONVERSI SUHU 78 Celcius===");
       double c =78,reamur,fah,kel;
       int pil;
       Scanner input = new Scanner (System.in);
       System.out.println("====Pilih Salah Satu===");
       System.out.println("====1.Fahrenheit ===");
       System.out.println("====2.Kelvin===");
       System.out.println("====3. Reamur===");
       System.out.println("====Masukan Angka===");
       pil = input.nextInt();
       switch (pil) {
           case 1 :
               fah= c*9/5;
               System.out.println(" Hasil Konvrensi Fahrenheit Ialah "+fah);
               break;
           case 2 :
              kel= 273 + c;
               System.out.println(" Hasil Konvrensi Kelvin Ialah "+kel);
               break;
           case 3 :
              reamur= c*4/5;
               System.out.println(" Hasil Konvrensi Reamur Ialah "+reamur);
               break;
       }
   } 
}
