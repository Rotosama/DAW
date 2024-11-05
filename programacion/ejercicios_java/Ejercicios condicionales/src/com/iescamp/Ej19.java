//Ejercicio comun nº 19: Programa que lee tres números cualesquiera y nos indica todas sus relaciones
//de igualdad.

package com.iescamp;

import java.util.Scanner;

public class Ej19 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner read = new Scanner(System.in);

        System.out.println("Escribe el primer número:");
        num1 = read.nextInt();
        System.out.println("Escribe el segundo número:");
        num2 = read.nextInt();
        System.out.println("Escribe el tercer número:");
        num3 = read.nextInt();

        if (num1 == num2 && num1 == num3) {
            System.out.println("Los tres números son iguales.");
        } else if (num1 == num2 && num1 != num3) {
            System.out.println("El primer número (" + num1 + ") es igual al segundo número (" + num2 + "), pero diferente del tercero (" + num3 + ").");
        } else if (num1 == num3 && num1 != num2) {
            System.out.println("El primer número (" + num1 + ") es igual al tercer número (" + num3 + "), pero diferente del segundo (" + num2 + ").");
        } else if (num2 == num3 && num2 != num1) {
            System.out.println("El segundo número (" + num2 + ") es igual al tercer número (" + num3 + "), pero diferente del primero (" + num1 + ").");
        } else {
            System.out.println("Todos los números son diferentes.");
        }


    }
}
