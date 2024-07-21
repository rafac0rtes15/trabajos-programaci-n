package com.mycompany.Contarletra;
import java.util.Scanner;
public class Contarletra {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner letra =new Scanner(System.in);
        String palabra;
       int contador = 0;
       System.out.print("Ingresa una palabra");
       palabra = letra.nextLine();
       for (int i = 0; i < palabra.length(); i++) {
        if(palabra.charAt(i)=='a'){
            contador +=1;

        }

       }
    System.out.print("El numero de letras a es: "+ contador);

    }

}