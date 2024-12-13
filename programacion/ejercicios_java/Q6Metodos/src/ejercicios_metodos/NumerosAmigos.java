package ejercicios_metodos;

import java.util.Scanner;

/**
 * Dos números son amigos, si cada uno de ellos es igual a la suma de los divisores del otro. Por ejemplo, 220 y 284
 * son amigos, ya que:
 * <pre>
 *     Suma de divisores de 284: 1 + 2 + 4 + 71 + 142 = 220
 *     Suma de divisores de 220: 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284
 * </pre>
 *
 * <p>Hacer un método que determine si dos números dados como argumentos son amigos o no. A continuación realizar un
 * programa que muestre todas las parejas de números amigos menores o iguales a n, siendo n un número introducido por
 * teclado.</p>
 * <p>El programa debe usar el método amigo previamente definido.</p>
 *
 * @author nachoruiz
 */
public class NumerosAmigos {
    public static void main(String[] args) {
        int num;
        Scanner read = new Scanner(System.in);

        System.out.println("Escribe un número:");
        num = read.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = i + 1; j <= num; j++) { // Evita duplicados verificando j > i
                if (friendlyNumbers(i, j)) {
                    System.out.println(i + " y " + j + " son amigos.");
                }
            }
        }
    }

    /**
     * Método que calcula la suma de los divisores propios de un número.
     *
     * @param num Número del que se quieren calcular los divisores
     *
     * @return Suma de los divisores propios
     */
    public static int sumOfDivisors(int num) {
        int sum = 1;
        int limit = (int) Math.sqrt(num);
        int quotient;

        for (int i = 2; i <= limit; i++) {
            if (num % i == 0) {
                sum += i;
                quotient = num / i;
                if (quotient != i) {
                    sum += quotient;
                }
            }
        }
        return sum;
    }

    /**
     * Método que verifica si dos números son amigos.
     *
     * @param num1 Primer número
     * @param num2 Segundo número
     *
     * @return true si los números son amigos, false en caso contrario
     */

    public static boolean friendlyNumbers(int num1, int num2) {
        boolean areFriendly = false;
        int num1Summation, num2Summation;

        num1Summation = sumOfDivisors(num1);
        num2Summation = sumOfDivisors(num2);
        if (num1Summation == num2 && num2Summation == num1) {
            areFriendly = true;
        }
        return areFriendly;
    }
}
