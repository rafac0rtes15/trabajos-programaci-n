
import java.util.Scanner;
public class Actividad3_3 {
    public static void main(String[] args) throws Exception {
        int calif;
        Scanner a= new Scanner(System.in);
        System.out.println("Ingrese la calificación que obtuvo del 100%:");
        calif= a.nextInt();
        if(calif>=90 && calif<=100){
            System.out.print("Su calificación corresponde a una A");
        }else if(calif>=80 && calif<=89){
            System.out.print("Su calificación corresponde a una B");
        }else if(calif>=70 && calif<=79){
            System.out.print("Su calificación corresponde a una C");
        }else if(calif>=60 && calif<=69){
            System.out.print("Su calificación corresponde a una D");
        }else if(calif<60){
            System.out.print("Su calificación corresponde a una F");
        }else{
            System.out.print("Favor de ingresar una calificacion valida (en un porcentaje de 100%)");
        }
    }
}
