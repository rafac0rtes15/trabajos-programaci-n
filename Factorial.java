package com.mycompany.factorial;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("De que numero quieres saber su factorial? : ");
        int numero = scanner.nextInt();

        long factorial = calcularF(numero);

        System.out.println("El factorial de " + numero + " es: " + factorial);

        scanner.close();
    }
    public static long calcularF(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Solo se aceptan numeros positivos c:");
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
