//Entrada
//El programa deberá leer de la entrada estándar múltiples casos de prueba. Cada uno contendrá un
//único número 1 ≤ n ≤ 1.000.000 indicando el número de uvas de un racimo.
//La entrada termina con un caso con 0 uvas que no deberá procesarse.
//Salida
//Para cada caso de prueba el programa escribirá el menor número de niveles posible que deberá tener
//un racimo perfecto con n uvas, de modo que tanto sumilleres como enólogos estén contentos con él.

package EjerciciosRetos1;

import java.util.Scanner;

public class RacimosDeUvas {
    public static void main(String[] args) {
        int number, levels, totalGrapes;
        String result = "";

        Scanner read = new Scanner(System.in);
        System.out.println("Introduce el número de uvas del racimo, cuando quieras terminar, introduce 0");

        do {
            number = read.nextInt();
            if ((number < 1 || number > 1000000) && (number != 0)) {
                System.out.println("ERROR: 1 ≤ n ≤ 1.000.000");
            } else if (number != 0) {
                totalGrapes = 0;
                levels = 1;
                while (totalGrapes < number) {
                    totalGrapes += levels;
                    levels++;
                }
                result += (levels - 1);
            }
            result += "\n";
        } while (number != 0);
        System.out.println(result);

    }
}
