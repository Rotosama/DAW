//Ejercicio común nº 16: Programa que lee dos números y nos dice cuál es el mayor o si son iguales

package com.iescamp;

import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner read = new Scanner(System.in);

        System.out.println("Escribe el primer número:");
        num1 = read.nextInt();
        System.out.println("Escribe el segundo número:");
        num2 = read.nextInt();

        if (num1 == num2) {
            System.out.println("¡Los números son iguales!");
        } else if (num1 > num2) {
            System.out.println("El número " + num1 + " es el mayor");
        } else {
            System.out.println("El número " + num2 + " es el mayor");
        }

    }
}
