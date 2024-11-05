//Ejercicio común nº 13: Programa de un programa que lee 2 números y muestra el mayor.
package com.iescamp;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner read = new Scanner(System.in);

        System.out.println("Escribe el primer número:");
        num1 = read.nextInt();
        System.out.println("Escribe el segundo número:");
        num2 = read.nextInt();

        if (num1>=num2){
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
}
