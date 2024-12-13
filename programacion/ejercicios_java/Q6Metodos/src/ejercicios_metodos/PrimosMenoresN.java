package ejercicios_metodos;

import java.util.Scanner;

/**
 * Programa que muestra los números primos menores de un número dado.
 *
 * @author Ignacio Ruiz
 */
public class PrimosMenoresN {
    public static void main(String[] args) {
        int num;
        Scanner read = new Scanner(System.in);

        System.out.println("Introduce un número:");
        num = read.nextInt();
        if (isPositiveInt(num)) {
            showPrimes(num);
        } else {
            System.out.println("Escribe un numero entero positivo.");
        }

    }

    /**
     * Muestra todos los números primos menores al número dado.
     *
     * @param num Número entero positivo que establece el límite.
     */
    private static void showPrimes(int num) {
        boolean first = true;
        for (int i = 0; i < num; i++) {
            if (isPrime(i)) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(i);
                first = false;
            }
        }
        System.out.println(); // Salto de línea al final
    }

    /**
     * Determina si un número es primo.
     *
     * @param num Número entero que se desea verificar.
     *
     * @return {@code true} si el número es primo, {@code false} en caso contrario.
     */
    private static boolean isPrime(int num) {
        boolean isPrime = true;

        if (num != 2) {
            if (num == 1) isPrime = false;
            //revisa si  es multiplo de 2
            if (num % 2 == 0) {
                isPrime = false;
            } else {
                //si no, solo revisa los impares
                for (int i = 3; i * i <= num; i += 2) {
                    if (num % i == 0) {
                        isPrime = false;
                    }
                }
            }
        }
        return isPrime;
    }

    /**
     * Verifica si un número entero es positivo.
     *
     * @param num Número entero a evaluar.
     *
     * @return {@code true} si el número es positivo, {@code false} en caso contrario.
     */
    public static boolean isPositiveInt(int num) {
        return num > 0;
    }

}
