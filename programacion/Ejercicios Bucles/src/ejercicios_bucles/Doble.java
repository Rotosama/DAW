//Pediremos numeros, y diremos cual es el doble del numero introducido.Pararemos cuando el
//numero introducido sea cero.

package ejercicios_bucles;

import java.util.Scanner;

public class Doble {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = 0;

        do {
            System.out.println("Escribe un número:");
            number = read.nextInt();
            if (number != 0) {
                System.out.println("El doble de " + number + " es: " + (number * 2));
            }
        } while (number != 0);  // El bucle sigue hasta que el número sea cero

        System.out.println("El programa ha terminado.");
    }
}
