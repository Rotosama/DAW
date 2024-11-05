//Programa que muestra un menú con las siguientes opciones:
//1. Suma.
//2. Resta.
//3. Multiplicación.
//4. División.
//5. Salir.
//Y permite hacer las operaciones con dos numeros hasta que pulsemos la opción de salir.
package ejercicios_bucles;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num1, num2, option;

        do {
            System.out.println("Que operación quieres hacer :");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            option = read.nextInt();
            if (option < 5) {
                System.out.println("Escribe el primer número:");
                num1 = read.nextInt();
                System.out.println("Escribe el segundo número:");
                num2 = read.nextInt();
                switch (option) {
                    case 1:
                        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                        } else {
                            System.out.println("No se puede dividir por 0");
                        }
                        break;
                }
            } else if (option == 5) {
                System.out.println("Fin del programa");
            } else {
                System.out.println("Selecciona una opción válida!");
            }
        } while (option != 5);

    }
}
