//Programa que solicita el radio de una circunferencia y muestra la longitud de la circunferencia, el
//área del círculo que se crea y el volumen de la esfera que forma

package com.iescamp;

import java.util.Scanner;

public class Circunferencia {
    public static void main(String[] args) {
        float radio, longitud, area, volumen;
        Scanner in = new Scanner(System.in);

        System.out.println("Escribe el radio de la circunferencia:");
        radio = in.nextFloat();

        //Operaciones
        longitud = (float) (2 * Math.PI * radio);
        area = (float) (Math.PI * Math.pow(radio, 2));
        volumen = (float) ((4 / 3) * Math.PI * Math.pow(radio, 3));

        System.out.println("Longitud --> " + longitud);
        System.out.println("Área --> " + area);
        System.out.println("Volumen --> " +volumen);

    }
}
