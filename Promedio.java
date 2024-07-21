package com.mycompany.promedio;
    import java.util.Scanner;
public class Promedio {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa promedio1: ");
        double promedio1 = scanner.nextDouble();
        System.out.print("Ingresa promedio2: " );
        double promedio2 = scanner.nextDouble();
        System.out.println("Ingresa promedio3: ");
        double promedio3 = scanner.nextDouble();
        
        double promediofiinal = promedio1 + promedio2 + promedio3;
        double promediofinal= promediofiinal/ 3;
        System.out.println("el promedio final es de: " + promediofinal);
        scanner.close();
    }
}
