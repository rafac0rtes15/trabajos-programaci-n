import java.util.*;
public class Actividad4_10 {
    public static void main(String[] args) throws Exception {
        Scanner d=new Scanner(System.in);
        int numero;
         int num=1;
         System.out.println("Ingrese un numero entero positivo: ");
            numero=d.nextInt();
        do {
            
            if(num%2!=0){
                System.out.println(num);
                System.out.print("");
            }
            num+=1;
        } while (num<=numero);
        d.close();
    }
}
