package com.mycompany.Trabajos;
    import java.util.Scanner;

public class Rectangulo 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la base del rectangulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingresa la altura del rectangulo: " );
        double altura = scanner.nextDouble();
        double area = base * altura;
        System.out.println("El area del rectangulo es: " + area);
        scanner.close();
    }
}