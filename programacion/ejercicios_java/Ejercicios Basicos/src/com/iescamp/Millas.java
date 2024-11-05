// Programa que dado un valor en millas nos lo traduce a metros

package com.iescamp;

import java.util.Scanner;

public class Millas {
    public static void main(String[] args) {
        float meters;
        final float milesToMeters = 1609.34f;  // 1 milla = 1609.34 metros
        Scanner in = new Scanner(System.in);

        System.out.println("Escribe el número de millas:");
        float miles = in.nextFloat();
        meters = miles * milesToMeters;

        System.out.println(miles + " millas son " + meters + " metros.");
    }
}
