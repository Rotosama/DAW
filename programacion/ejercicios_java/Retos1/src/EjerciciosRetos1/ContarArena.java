//Entrada
//La entrada estará compuesta por distintos números mayores que 0 y que nunca serán mayores
//que 1.000, cada uno en una línea.
//La entrada termina con un 0, que no debe procesarse.
//Salida
//Para cada número se debe escribir, en una línea independiente, su codificación en base 1.
package EjerciciosRetos1;

import java.util.Scanner;

public class ContarArena {
    public static void main(String[] args) {
        int number = 0;
        Scanner read = new Scanner(System.in);
        String result = "";
        System.out.println("Introduce una serie de números, cuando quieras terminar, introduce 0");

        do {
            number = read.nextInt();
            if (number < 0 || number > 1000) {
                System.out.println("El número debe estar entre 0 y 1000");
            } else {
                for (int i = 0; i < number; i++) {
                    result += "1";
                }
                result += "\n";
            }
        } while (number != 0);
        System.out.println(result);
    }
}
