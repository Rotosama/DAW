//Ejercicio común nº 15: Programa de un programa que lee dos números y los visualiza en orden
//ascendente

package com.iescamp;

import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner read = new Scanner(System.in);

        System.out.println("Escribe el primer número:");
        num1 = read.nextInt();
        System.out.println("Escribe el segundo número:");
        num2 = read.nextInt();

        if (num1 >= num2) {
            System.out.println(num2 + ", " + num1);
        }else{
            System.out.println(num1 + ", " + num2);
        }
    }
}
