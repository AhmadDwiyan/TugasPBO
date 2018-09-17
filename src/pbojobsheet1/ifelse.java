package pbojobsheet1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GL62
 */
import java.util.*;
public class ifelse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Daftar Nilai Tugas WEB ");
        int nilai;
        nilai= input.nextInt();
        if(nilai >= 90){
            System.out.println("Nilai Mu A");
        }
        else if(nilai >=75 ){
        System.out.println("Nilai Mu B");
    }
        else if(nilai >=50){
            System.out.println("Nilai Mu C");
        }
        else {
            System.out.println("Nilai Mu D");
        }
    }
}
