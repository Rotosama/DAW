//Ejercicio común nº 18: Programa que lee una calificación numérica entre 0 y 10 y la transforma en
//calificación alfabética, escribiendo el resultado.

package com.iescamp;

import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {
        float grade;
        Scanner read = new Scanner(System.in);

        System.out.println("Introduce una calificación numérica entre 0 y 10:");
        grade = read.nextFloat();

        if (grade < 0 || grade > 10) {
            System.out.println("Calificación fuera de rango. Introduce una nota válida entre 0 y 10.");
        } else {
            if (grade < 3) {
                System.out.println("Muy Deficiente");
            } else if (grade < 5) {
                System.out.println("Insuficiente");
            } else if (grade < 6) {
                System.out.println("Suficiente");
            } else if (grade < 7) {
                System.out.println("Bien");
            } else if (grade < 9) {
                System.out.println("Notable");
            } else {
                System.out.println("Sobresaliente");
            }
        }
    }
}
