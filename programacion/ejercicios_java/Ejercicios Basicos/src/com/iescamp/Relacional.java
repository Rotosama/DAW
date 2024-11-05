//Programa que muestra el resultado de comparar dos números (enteros o reales), si son iguales,
//distintos, mayor, menor,...

package com.iescamp;

import java.util.Scanner;

public class Relacional {
    public static void main(String[] args) {
        int num1,num2;
        Scanner in = new Scanner(System.in);

        System.out.println("Escribe el primer número:");
        num1 = in.nextInt();

        System.out.println("Escribe el segundo número:");
        num2 = in.nextInt();

        // Comparaciones entre los dos números
        if (num1 == num2) {
            System.out.println("Los números son iguales.");
        } else {
            System.out.println("Los números son distintos.");
            if (num1 > num2) {
                System.out.println(num1 + " es mayor que " + num2);
            } else {
                System.out.println(num1 + " es menor que " + num2);
            }
        }
    }
}
