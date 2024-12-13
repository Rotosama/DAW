package ejercicios_metodos;

import java.util.Scanner;

/**
 * Programa que debe ir pidiendo números al usuario hasta que el usuario introduzca el cero.
 * Para cada numero introducido, hay que decir si es primo o no.
 *
 * @author nachoruiz
 */
public class Primo {
    public static void main(String[] args) {

        int number;
        Scanner read = new Scanner(System.in);

        do {
            System.out.println("Escribe un número para saber si es primo. 0 para salir.");
            number = read.nextInt();
            if (number > 0) {
                if (isPrime(number)) {
                    System.out.println("El " + number + " es primo.");
                } else {
                    System.out.println("El " + number + " NO es primo.");
                }
            } else if (number == 0) {
                System.out.println("¡ Hasta luego !");
            } else {
                System.out.println("ERROR: Introduce un número entero positivo.");
            }
        } while (number != 0);
    }

    /**
     * Metodo para saber si un número es primo o no.
     *
     * @param number El número para analizar.
     * @return isPrime = true si el número es primo.
     */
    public static boolean isPrime(int number) {
        boolean isPrime = true;

        if (number != 2) {
            if (number == 1) isPrime = false;
            //revisa si  es multiplo de 2
            if (number % 2 == 0) {
                isPrime = false;
            } else {
                //si no, solo revisa los impares
                for (int i = 3; i * i <= number; i += 2) {
                    if (number % i == 0) {
                        isPrime = false;
                    }
                }
            }
        }
        return isPrime;
    }
}
