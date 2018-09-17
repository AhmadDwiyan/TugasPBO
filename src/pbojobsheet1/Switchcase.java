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
public class Switchcase {
    public static void main(String[] args){
        int angka;
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan Pilih Angka 1-3");
        angka = input.nextInt();
        switch(angka){
            case 1 :
                System.out.println("Satu");
                break;
            case 2:
                System.out.println("Dua");
                break;
            case 3:
                System.out.println("Tiga");
                break;
            default :
                System.out.println(" Periksa Perintahnya !!");
        }
    }
}
