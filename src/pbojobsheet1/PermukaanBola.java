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
public class PermukaanBola {
 public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     int jari,total;
     System.out.println("Masukan Jari Jarinya");
     jari = input.nextInt();
     total = jari*jari*22/7*4;
     System.out.println("Hasilnya Adalah  "+total);
 }   
}
