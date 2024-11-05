//Ejercicio común nº 14: Programa de un programa que lee un número y me dice si es positivo o
//negativo, consideraremos el cero como positivo
package com.iescamp;

import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        int number;
        Scanner read = new Scanner(System.in);

        System.out.println("Escribe un número:");
        number = read.nextInt();

        if (number >= 0) {
            System.out.println("El número " + number + " es positivo");
        }else{
            System.out.println("El número " + number + " es negativo");
        }
    }
}
