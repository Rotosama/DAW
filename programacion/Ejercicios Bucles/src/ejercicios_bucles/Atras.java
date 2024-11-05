//Programa que permite realizar una cuenta atras, desde el numero que introduzca el usuario
//hasta cero. Lo realizará de tres formas distintas.
//• for
//• do-while.
//• while.

package ejercicios_bucles;

import java.util.Scanner;

public class Atras {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number;
        int i, j, k;

        System.out.println("Escribe un número:");
        number = read.nextInt();
        //FOR
        System.out.println("BUCLE FOR:");
        for (i = number; i >= 0; i--) {
            System.out.println(i);
        }
        //WHILE
        System.out.println("BUCLE WHILE:");
        j = number;
        while (j >= 0) {
            System.out.println(j);
            j--;
        }
        // DO WHILE
        System.out.println("BUCLE DO..WHILE:");
        k = number;
        do {
            System.out.println(k);
            k--;
        } while (k >= 0);

    }
}
