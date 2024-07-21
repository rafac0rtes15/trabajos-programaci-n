/*9.  Calculadora Básica con Menú: Escribe un programa que funcione como una calculadora básica. El 
programa debe mostrar un menú con las opciones de sumar, restar, multiplicar y dividir. Después de 
que el usuario seleccione una opción y realice la operación, se le debe preguntar si desea continuar
 o salir. */
import java.util.Scanner;
public class Actividad4_9 {
    public static void main(String[] args) throws Exception {
        int opcion;
        String opcion2;
        String afirmacion="Si";
        double valor1,valor2,resultado;
        Scanner a= new Scanner(System.in);
        
        do{
            System.out.println("Bienvenido a la calculadora, contamos con las siguientes opciones: ");
        System.out.print("1.Suma");
        System.out.print("   2.Resta");
        System.out.print("   3.División");
        System.out.print("   4.Multiplicación");
        System.out.println("");
            System.out.println("¿Qué opción desea seleccionar?");
        opcion =a.nextInt();
        System.out.println("Ingrese el primer valor de la operación:");
        valor1= a.nextInt();
        System.out.println("Ingrese el segundo valor de la operación:");
        valor2= a.nextInt();
        switch (opcion) {
            case 1:
                resultado=valor1+valor2;
                System.out.print("El resultado de la operacion seleccionada es: "+ resultado);
                break;
            case 2:
                resultado=valor1-valor2;
                System.out.print("El resultado de la operacion seleccionada es: "+ resultado);
                break;
            case 3:
                resultado=valor1/valor2;
                System.out.print("El resultado de la operacion seleccionada es: "+ resultado);
                break;
            case 4:
                resultado=valor1*valor2;
                System.out.print("El resultado de la operacion seleccionada es: "+ resultado);
                break;
            default:
            System.out.println("La opcion ingresada no es valida");
                break;
        }
        
        System.out.println("   ¿Desea ejecutar alguna otra opción?(Si/No)");
        opcion2= a.next();
        }while(opcion2.equals(afirmacion));
        System.out.print("Gracias por usar nuestra calculadora, hasta luego!!!");
        a.close();
    }
}
