
/* Calcular la Media de Números Positivos: Escribe un programa que solicite al usuario ingresar números
 positivos uno por uno. La entrada del programa debe terminar cuando el usuario ingrese un número 
 negativo. Al final, el programa debe calcular y mostrar la media de los números positivos ingresados.*/
import java.util.Scanner;
public class Actividad4_8 {
    public static void main(String[] args) throws Exception {
        Scanner teclado=new Scanner(System.in);
        int numero;
        int suma=0, contador=0;
        float media=0;
        System.out.println("Ingrese un numero positivo:");
            numero=teclado.nextInt();
        while(numero>0){
            suma+=numero;
            contador+=1;
            System.out.println("Ingrese un numero positivo:");
            numero=teclado.nextInt();
        }
        media=suma/contador;
        System.out.print("La media de los numeros positivos igresados es: "+ media);
        teclado.close();
    }
}
