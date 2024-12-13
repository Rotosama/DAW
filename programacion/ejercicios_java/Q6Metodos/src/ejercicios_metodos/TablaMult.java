package ejercicios_metodos;

import java.util.Scanner;

/**
 * Programa que escribe la tabla de multiplicar de un número introducido
 * por teclado. El programa debe tener un método que recibe como parámetro un número entero
 * y muestra la tabla de multiplicar de dicho número.
 *
 * @author Ignacio Ruiz
 */

public class TablaMult {
    public static void main(String[] args) {
        int num;
        Scanner read = new Scanner(System.in);

        System.out.println("Que tabla de multiplicar quieres saber?");
        num = read.nextInt();
        multiply(num);
    }

    /**
     * Genera y muestra en consola la tabla de multiplicar de un número dado.
     *
     * @param num El número para el cual se generará la tabla de multiplicar.
     */
    public static void multiply(int num) {
        System.out.println("La tabla del " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}
