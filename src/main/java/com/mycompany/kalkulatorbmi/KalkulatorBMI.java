
package com.mycompany.kalkulatorbmi;

import java.util.Scanner;
public class KalkulatorBMI {

    public static void main(String[] args) {
        Scanner alim = new Scanner (System.in);
        int berat;
        double tinggi;
        double bmi;
        
        System.out.println("masukkanberat badan : ");
        berat = alim.nextInt();
        System.out.println("masukkan tinggi badan :");
        tinggi = alim.nextDouble();
        tinggi/=100;
        bmi = berat/(tinggi*tinggi);
        System.out.println("bmi  : "+bmi);
        
        if(bmi > 27){
            System.out.println("obesitas");
        }
        else if(bmi > 24.9){
            System.out.println("kelebihan berat badan");
        }    
        else if(bmi > 18.9){
            System.out.println("normal");
        }     
        else{
            System.out.println("kurus");
        }   
        
    }
}
