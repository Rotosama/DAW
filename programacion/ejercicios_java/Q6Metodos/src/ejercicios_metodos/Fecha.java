package ejercicios_metodos;

import java.util.Scanner;

/**
 * Proqrama que lee una fecha con el siguiente formato (dd-mm-aaaa) y nos dice si es correcta o no.
 * El programa debe tener dos métodos, uno para saber si un año es bisiesto o no lo és,
 * y otro al que le pasamos los datos necesarios y nos devuelve un boolean indicando si es correcta o no.
 *
 * @author nachoruiz
 */
public class Fecha {
    public static void main(String[] args) {
        boolean isCorrectDate, isLeapYear;
        String date;
        Scanner read = new Scanner(System.in);

        System.out.println("Escribe una fecha con el siguiente formato dd-mm-aaaa:");
        date = read.nextLine();
        isLeapYear = leapYear(date);
        isCorrectDate = CorrectDate(date, isLeapYear);

        if (isCorrectDate) {
            if (isLeapYear) {
                System.out.println("La fecha es correcta, además es un año bisiesto!");
            } else {
                System.out.println("La fecha es correcta!");
            }
        } else {
            System.out.println("La fecha NO es correcta");
        }
    }

    /**
     * Metodo para determinar si una fecha es correcta y con formato dd-mm-aaaa.
     *
     * @param date     Fecha introducida para la comprobación.
     * @param leapYear Describe si es año bisiesto o no.
     * @return isValidDate Devuelve true si es una fecha válida.
     */
    public static boolean CorrectDate(String date, boolean leapYear) {
        int day, month, year, maxDays = 0;
        boolean isValidDate = true;

        if (!date.matches("\\d{2}-\\d{2}-\\d{4}")) {
            System.out.println("El formato introducido no es válido, prueba con dd-mm-aaaa");
            isValidDate = false;
        } else {
            day = Integer.parseInt(date.substring(0, 2));
            month = Integer.parseInt(date.substring(3, 5));
            year = Integer.parseInt(date.substring(6));

            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> maxDays = 31;
                case 4, 6, 9, 11 -> maxDays = 30;
                case 2 -> maxDays = leapYear ? 29 : 28;
                default -> {
                    System.out.println("El mes introducido no es válido.");
                    isValidDate = false;  // Marcamos la fecha como inválida
                }
            }
            // Comprobamos que el día y el año sean válidos
            if (year < 1) {
                System.out.println("El año introducido no es válido.");
                isValidDate = false;  // Marcamos la fecha como inválida
            }

            if (day < 1 || day > maxDays) {
                System.out.println("El día introducido no es válido para el mes especificado.");
                isValidDate = false;  // Marcamos la fecha como inválida
            }
        }
        return isValidDate;
    }

    /**
     * Metodo para saber si es un año bisisesto
     *
     * @param date Fecha introducida
     * @return Devuelve true si es año bisiesto
     */
    public static boolean leapYear(String date) {
        boolean isLeapYear = false;
        int year;
        year = Integer.parseInt(date.substring(6));

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            isLeapYear = true;
        }
        return isLeapYear;
    }
}
