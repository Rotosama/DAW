package ejercicios_metodos;

import java.util.Scanner;

/**
 * Programa que muestre el siguiente menú:
 *
 * <pre>
 *     1.- Calcular el factorial de un número.
 *     2.- Hallar si dos números son amigos
 *     3.- Resolver ecuación de 2o grado
 *     4.- Salir del programa
 * </pre>
 * <p>
 * El usuario podrá elegir cada una de las opciones del menú.
 * </p>
 *
 * <p>Si la opción pulsada no es ninguna de las anteriores el programa debe mostrar un mensaje informando de tal error.</p>
 *
 * <p>Para cada opción el programa mostrará en pantalla la solución y esperará a que se pulse una tecla.
 * Una vez pulsada volverá a mostrar el menú anterior.</p>
 *
 * @author Ignacio Ruiz
 */
public class Menu {
    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        Scanner read = new Scanner(System.in);
        Scanner readString = new Scanner(System.in);
        int selection;
        do {
            System.out.println("1.- Calcular el factorial de un número.");
            System.out.println("2.- Hallar si dos número son amigos.");
            System.out.println("3.- Resolver una ecuación de segundo grado.");
            System.out.println("4.- Salir del programa.");
            selection = read.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("1.- Calcular el factorial de un número.");
                    break;
                case 2:
                    System.out.println("2.- Hallar si dos número son amigos.");
                    break;

                case 3:
                    System.out.println("3.- Resolver una ecuación de segundo grado.");
                    break;

                case 4:
                    System.out.println("4.- Salir del programa.");
                    break;
                default:
                    System.out.println(selection+ " No es una opción válida!");
            }
            readString.nextLine();
        } while (selection != 4);
    }

}
