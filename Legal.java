package com.mycompany.legal;
import java.util.Scanner;
public class Legal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa tu edad: ");
        int edad = sc.nextInt();
        if( edad >= 18){
        System.out.println("Eres mayor de edad, puedes votar ");
         }else{
        System.out.println("No eres mayor de edad, no puedes votar ");
        }
}
     }
//            > < 
