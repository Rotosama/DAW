//Programa que lee un numero entero y positivo y nos indica si es primo o no
package ejercicios_bucles;

import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number;
        boolean isPrime = true;

        System.out.println("Escribe tu número");
        number = read.nextInt();
        if (number <= 0) {
            System.out.println("ERROR: Introduce un número entero positivo");
        } else {
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
            if (isPrime) {
                System.out.println("El número " + number + " SI es primo.");
            } else {
                System.out.println("El número " + number + " NO es primo.");
            }
        }
    }
}
