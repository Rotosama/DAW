//Programa que lee una fecha, introduciendo día, mes y año.
//
//Realizar las comprobaciones necesarias para que el día, el mes y el año sean correctos,
//en el caso de no ser una fecha correcta debes dar un mensaje de error y terminar.
//Considerar el mes de febrero como que tiene 28 días (no es necesario controlar si el año es bisiesto)
//El programa debe mostrar la fecha pasados 7 días, con respecto a la fecha introducida.

//IGNACIO RUIZ GARCIA

package com.iescamp;

import java.util.Scanner;

public class Past7Days {
    public static void main(String[] args) {
        int day, month, year, maxDays = 0;
        boolean isValidDate = true;  // Variable para controlar la validez de la fecha
        Scanner read = new Scanner(System.in);

        System.out.println("Introduce el día:");
        day = read.nextInt();
        System.out.println("Introduce el mes:");
        month = read.nextInt();
        System.out.println("Introduce el año:");
        year = read.nextInt();

        // Comprobamos que sea un mes válido y asignamos los días correspondientes
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                maxDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDays = 30;
                break;
            case 2:
                maxDays = 28;
                break;
            default:
                System.out.println("El mes introducido no es válido.");
                isValidDate = false;  // Marcamos la fecha como inválida
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

        // Si la fecha es válida, procedemos a sumar los 7 días
        if (isValidDate) {
            day += 7;
            // Ajustamos día, mes y año si es necesario
            if (day > maxDays) {
                day -= maxDays;
                month++;
                if (month > 12) {
                    month = 1;
                    year++;
                }
            }
            // Mostramos la nueva fecha
            System.out.printf("La fecha pasados 7 días es: %02d/%02d/%04d", day, month, year);
        }
    }
}
