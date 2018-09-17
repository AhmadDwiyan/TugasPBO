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
public class Kondisiganda {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int nilai_inggris,nilai_tpa;
        System.out.println("Masukan Nilai TPA");
        nilai_tpa = input.nextInt();
        System.out.println("Masukan Nilai Bahasa Inggris");
        nilai_inggris = input.nextInt();
        if((nilai_tpa>=85)&&(nilai_inggris>=90)){
            System.out.println("Selamat Kamu Mendapatkan Beasiswa !!");
        }
        else{ 
            System.out.println("Maaf Kamu Belum Mendapatkan Beasiswa");
        }
                
    }
}
