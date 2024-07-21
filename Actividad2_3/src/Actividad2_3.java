/*Calcular Promedio: Desarrolla un programa que calcule el promedio de 3 numeros que el usuario 
haya ingresado */
import java.util.Scanner;
public class Actividad2_3 {
    public static void main(String[] args) throws Exception {
     Scanner a=new Scanner(System.in);
    float peso;
    float estatura, imc=0;

    System.out.println("Ingrese su peso en kilogramos: ");
    peso= a.nextFloat();
    System.out.println("Ingrese su estatura en metros:");
    estatura= a.nextFloat();
    imc=peso/(estatura*estatura);
    System.out.print("su IMC es de:"+ imc);
    a.close();
    }
}
