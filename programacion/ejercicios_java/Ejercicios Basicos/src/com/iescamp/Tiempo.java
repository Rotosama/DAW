//Escribe un programa que solicite al usuario una cantidad en segundos y la convierta en a días,
//horas, minutos y segundos.

package com.iescamp;

import java.util.Scanner;

public class Tiempo {
    public static void main(String[] args) {
        int segundos, dias, horas, minutos;
        Scanner in = new Scanner(System.in);

        System.out.println("Escribe una cantidad de segundos:");
        segundos = in.nextInt();

        //Operaciones
        dias = segundos / 86400;
        segundos %= 86400;

        horas = segundos / 3600;
        segundos %= 3600;

        minutos = segundos / 60;
        segundos %= 60;

        System.out.println("Días: " + dias);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);

    }
}
