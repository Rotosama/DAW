//El usuario "piensa" un número del 1 al 100 y el ordenador lo adivina. (el usuario debe indicarle al
//ordenador si es mayor, menor o igual):
package ejercicios_bucles;

import java.util.Scanner;

public class Adivina {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String symbol = "";
        int number = 50, min = 1, max = 100;

        System.out.println("Piensa un número del 1 al 100...");
        System.out.println("Debes indicar si es mayor (>), menor (<) o si es tu número (=)");

        do {
            System.out.println("¿Es el número " + number + "?");
            symbol = read.next();

            if (symbol.equals(">")) {
                min = number + 1;
            } else if (symbol.equals("<")) {
                max = number - 1;
            }
            // Calculamos el siguiente número en el medio del rango
            number = (min + max) / 2;
        } while (!symbol.equals("="));  // El ciclo continúa hasta que el número es el correcto

        System.out.println("¡He adivinado tu número!");
        System.out.println("!Es el " + number +"!");
    }
}
