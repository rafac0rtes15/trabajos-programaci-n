import java.util.Scanner;
/*Verificar edad para votar: Escribe un programa que verifique si una persona es elegible para votar. La edad mínima para votar es de 18 años.*/
public class Actividad3_2{
    public static void main(String[] args) throws Exception {
        Scanner a=new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad:");
        edad=a.nextInt();
        if(edad>=18){
            System.out.print("Usted es elegible para votar ya que su edad es "+ edad);
        }else{
            System.out.print("Usted no es elegible para votar ya que la edad minima es de 18 y usted tiene " + edad);
        }
    }
}
