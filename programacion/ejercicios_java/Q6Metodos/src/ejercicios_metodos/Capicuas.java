package ejercicios_metodos;

import java.util.Scanner;

/**
 * Escribe un programa que solicite números enteros positivos e indique si son o no capicúas.
 * <p>
 * El programa solicitará números hasta que se introduzca uno negativo y usará un método para determinar si un número
 * es capicúa.
 * </p>
 *
 * @author Ignacio Ruiz
 */
public class Capicuas {
    public static void main(String[] args) {
        int num;
        Scanner read = new Scanner(System.in);

        do {
            System.out.println("Escribe un número entero positivo:");
            num = read.nextInt();

            if (isPositiveInt(num)) {
                System.out.println("El número " + num + " " + (isCapicua(num) ? "SI es" : "NO es") + " Capicúa.");
            } else {
                System.out.println("Prueba con otro número positivo");
            }

        } while (num >= 0);
    }

    /**
     * Método que comprueba si es un número capicua.
     * <p>Lo covierte a String para poder comparar las cadenas usando la clase StringBuilder con el método reverse()</p>
     *
     * @param num Número a evaluar.
     *
     * @return <code>isCapicua</code> true, si lo es y false si no lo se.
     * @see java.lang.StringBuilder
     */
    private static boolean isCapicua(int num) {
        String value;
        String reverseValue;
        boolean isCapicua;

        value = Integer.toString(num); // Convierte el número a String
        reverseValue = new StringBuilder(value).reverse().toString(); // Invierte el String
        isCapicua = value.equals(reverseValue);

        return isCapicua;
    }

    public static boolean isPositiveInt(int num) {
        return num > 0;
    }
}
