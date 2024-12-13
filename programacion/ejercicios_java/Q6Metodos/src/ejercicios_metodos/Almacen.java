package ejercicios_metodos;

import java.util.Scanner;

/**
 * Programa para calcular y verificar el dígito de autoverificación de productos en un almacén.
 */
public class Almacen {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num, verificationDigit;
        boolean isValid;

        do {
            System.out.println("Introduce el número del producto (0 para salir):");
            num = read.nextInt();
            if (isPositiveInt(num)) {
                verificationDigit = setVerificationNumber(num / 10); // Calculamos el dígito basado en el número base
                isValid = checkNumbers(num, verificationDigit); // Verificamos si el dígito es correcto

                if (isValid) {
                    System.out.println("El número de producto es válido.");
                } else {
                    System.out.println("El número de producto NO es válido.");
                }
            } else {
                System.out.println("Escribe un número positivo");
            }

        } while (num != 0);
    }

    /**
     * Calcula el dígito de autoverificación de un número.
     *
     * @param num Número base (sin incluir el dígito de verificación).
     *
     * @return Dígito de autoverificación calculado.
     */
    public static int setVerificationNumber(int num) {
        String numStringged = String.valueOf(num);
        int sum = 0;

        // Paso 1: Sumar las posiciones impares multiplicadas por 2
        for (int i = numStringged.length() - 1; i >= 0; i -= 2) {
            int digit = Integer.parseInt(String.valueOf(numStringged.charAt(i))) * 2;
            // Si el número es mayor a 9, sumar los dígitos
            if (digit > 9) {
                sum += digit / 10 + digit % 10; // Descomponer el número
            } else {
                sum += digit;
            }
        }

        // Paso 2: Sumar las posiciones pares sin multiplicar
        for (int i = numStringged.length() - 2; i >= 0; i -= 2) {
            sum += Integer.parseInt(String.valueOf(numStringged.charAt(i)));
        }

        // Paso 3: Calcular el dígito de autoverificación
        int nextMultipleOfTen = (int) Math.ceil(sum / 10.0) * 10;
        return nextMultipleOfTen - sum;
    }

    /**
     * Verifica si el dígito de verificación de un número es correcto.
     *
     * @param num             Número completo del producto (incluye el dígito de verificación).
     * @param calculatedDigit Dígito de verificación calculado.
     *
     * @return {@code true} si el dígito de verificación es correcto, {@code false} en caso contrario.
     */
    public static boolean checkNumbers(int num, int calculatedDigit) {
        int baseNum = num / 10; // Número base sin el dígito de verificación
        int actualDigit = num % 10; // Dígito de verificación real

        // Compara el dígito calculado con el dígito real
        return calculatedDigit == actualDigit;
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
