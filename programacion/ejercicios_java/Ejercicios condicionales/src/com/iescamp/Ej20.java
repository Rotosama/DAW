//Ejercicio común nº 20: Programa que recibe como datos de entrada una hora expresada en horas,
//minutos y segundos que nos calcula y escribe la hora, minutos y segundos que serán, transcurrido un
//segundo.

package com.iescamp;

import java.util.Scanner;

public class Ej20 {
    public static void main(String[] args) {
        int hours, minutes, seconds;
        Scanner read = new Scanner(System.in);

        System.out.println("Escribe las horas:");
        hours = read.nextInt();
        System.out.println("Escribe los minutos:");
        minutes = read.nextInt();
        System.out.println("Escribe los segundos:");
        seconds = read.nextInt();

        if (seconds > 59 || minutes > 59 || hours > 23) {
            System.out.println("Escribe una hora real!");
        } else {
            seconds++;
            if (seconds == 60) {
                seconds = 0;
                minutes++;
            }
            if (minutes == 60) {
                minutes = 0;
                hours ++;
            }
            if (hours == 24) {
                hours = 0;
            }

            System.out.println("La hora un segundo después es:");
            System.out.println(String.format("%02d:%02d:%02d", hours, minutes, seconds));
        }

    }
}
