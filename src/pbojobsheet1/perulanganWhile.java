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
public class perulanganWhile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a=0,total=0,bil =7;
        while(bil!=0){
            a++;
            System.out.println("Masukan Bilangan ke -"+a+" : ");
            bil=input.nextInt();
            total +=bil;
        }
        System.out.println("Total Jumlah bilangan "+(a-1)+" Bilangan");
        System.out.println(total);
    }
}
