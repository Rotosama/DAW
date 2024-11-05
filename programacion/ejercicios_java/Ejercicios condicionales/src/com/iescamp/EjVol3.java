/*
Los empleados de una fábrica trabajan en dos turnos: diurno y nocturno. Se desea calcular el
salario diario de acuerdo con las siguientes condiciones:
1. el pago por cada hora diurna es de 8 euros
2. el pago de cada hora nocturna es de 15 euros
3. en caso de que sea domingo, el pago por hora se incrementa en 4 euros para el turno
diurno y en 5 euros para el turno nocturno
 */
package com.iescamp;

import java.util.Scanner;

public class EjVol3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float dayHours, nightHours, priceDay = 8F, priceNight = 15F;
        float payment;
        char isSunday;

        System.out.println("Horas trabajadas de dia:");
        dayHours = read.nextFloat();
        System.out.println("Horas trabajadas de noche:");
        nightHours = read.nextFloat();
        System.out.println("Es domingo?");
        isSunday = read.next().charAt(0);

        if (isSunday == 's') {
            priceDay += 4;
            priceNight += 5;
        }
        payment = (dayHours * priceDay) + (nightHours * priceNight);
        System.out.println("Tu paga es de " + payment);




    }
}
