//Programa que solicita 15 números y nos va indicando si son pares o impares. Al finalizar nos
//mostrará cuantos son pares y cuantos impares.

package ejercicios_bucles;

import java.util.Scanner;

public class ParImpar15 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int odd = 0, even = 0, number;
        final int limit = 15;

        for (int i = 0; i < limit; i++) {
            System.out.println("Escribe un número:");
            number = read.nextInt();
            if (number % 2 == 0) {
                System.out.println("Es par");
                odd ++;
            } else {
                System.out.println("Es impar");
                even ++;
            }
        }
        System.out.println("PARES: " + odd);
        System.out.println("IMPARES: " + even);
    }
}
