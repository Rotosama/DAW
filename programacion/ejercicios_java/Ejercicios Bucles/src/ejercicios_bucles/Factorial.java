package ejercicios_bucles;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number;
        long factorial;

        do {
            System.out.println("Introduce un número para saber su factorial:");
            System.out.println("Si quieres salir introduce -1");
            number = read.nextInt();

            if (number != -1) {
                factorial = 1;
                System.out.print(number + "! = ");
                for (int i = number; i > 0; i--) {
                    System.out.print(i);
                    if (i > 1) {
                        System.out.print(" x ");
                    }
                    factorial *= i;
                }
                System.out.println(" = " + factorial);
            }

        } while (number != -1);
        System.out.println("Fin del programa");
    }
}
