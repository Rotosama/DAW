package ejercicios_metodos;

import java.util.Scanner;

/**
 * Programa que define un método llamado sumaDeDigitos() que recibe como argumento un número entero
 * y devuelve la suma de los dígitos que lo componen.
 * <p>
 * El programa lee un número, calcula la suma de sus dígitos y presenta el resultado en pantalla.
 * </p>
 */
public class SumaDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número entero:");
        try {
            int num = scanner.nextInt();
            int add = sumDigits(num);
            System.out.println("La suma de los dígitos de " + num + " es: " + add);
        } catch (Exception e) {
            System.out.println("Entrada no válida. Por favor, introduce un número entero.");
        }
    }

    /**
     * Calcula la suma de los dígitos de un número entero.
     *
     * @param num Número entero del que se calculará la suma de sus dígitos.
     *
     * @return La suma de los dígitos del número.
     */
    public static int sumDigits(int num) {
        num = Math.abs(num); // Asegura que el número sea positivo para manejar números negativos
        int add = 0;

        while (num > 0) {
            add += num % 10; // Obtiene el último dígito y lo suma
            num /= 10; // Elimina el último dígito
        }

        return add;
    }
}
