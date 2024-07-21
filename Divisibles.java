package com.mycompany.Divisibles;
public class Divisibles {

    public static void main(String[] args) {
        System.out.println("Estos son los numeros divisibles entre el numero 3 y numero 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
