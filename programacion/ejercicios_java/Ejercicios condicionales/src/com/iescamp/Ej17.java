//Ejercicio común nº 17: Programa que lee tres números distintos y nos dice cuál es el mayor

package com.iescamp;

import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
        int num1, num2, num3, greatest;
        Scanner read = new Scanner(System.in);

        System.out.println("Escribe el primer número:");
        num1 = read.nextInt();
        System.out.println("Escribe el segundo número:");
        num2 = read.nextInt();
        System.out.println("Escribe el tercer número:");
        num3 = read.nextInt();

        if (num1 >= num2) {
            greatest = num1;
        } else {
            greatest = num2;
        }
        if (num3 > greatest) {
            greatest = num3;
        }
        System.out.println("El número mayor es: " + greatest);
    }
}
