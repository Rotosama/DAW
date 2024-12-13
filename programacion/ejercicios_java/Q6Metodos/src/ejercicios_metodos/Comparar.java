package ejercicios_metodos;

import java.util.Scanner;

/**
 * Escribe un programa que sirva para probar un metodo que reciba dos números y que devuelva
 * 0 si son iguales,
 * 1 si el primeroes mayor que el segundo y
 * ‐1 si el segundo es mayor que el primero.
 *
 * @author nachoruiz
 */
public class Comparar {

    public static void main(String[] args) {
        int num1, num2, result;
        Scanner read = new Scanner(System.in);

        System.out.println("Escribe el primer número:");
        num1 = read.nextInt();
        System.out.println("Escribe el segundo número:");
        num2 = read.nextInt();
        result = compareNumbers(num1, num2);
        System.out.println("Resultado = " + result);
    }

    /**
     * Metodo para comparar dos números
     *
     * @param num1 Primer número a comparar.
     * @param num2 Segundo número a comparar.
     * @return response = 0 -> Son iguales,
     * response = 1 -> num1 > num2
     * response = -1 -> num2 > num1
     */

    public static int compareNumbers(int num1, int num2) {
        int response = 0;

        if (num1 > num2) {
            response = 1;
        }
        if (num1 < num2) {
            response = -1;
        }
        return response;
    }
}
