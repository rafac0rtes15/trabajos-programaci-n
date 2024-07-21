/*Generar Secuencia de Cuadrados:  Escribe un programa que solicite al usuario
 ingresar un número entero positivo. Luego, el programa debe imprimir los 
 cuadrados de todos los números desde 1 hasta ese número. Usa un bucle Do While 
 para calcular y mostrar los cuadrados. */
import java.util.*;
public class Actividad4_11 {
    public static void main(String[] args) throws Exception {
        Scanner d= new Scanner(System.in);
        int numero;
         int num=1;
         System.out.println("Ingrese un numero entero positivo: ");
            numero=d.nextInt();
        do {
            System.out.println("El cuadrado de "+num+ "="+num*num);
            System.err.print("");
            num+=1;
        } while (num<=numero);
        d.close();
    }
}
