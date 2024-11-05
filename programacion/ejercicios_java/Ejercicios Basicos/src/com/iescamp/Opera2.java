//Programa que lee dos números reales de tipo float y muestra la suma, resta, multiplicación,
//división, resto de la división, incremento y decremento unario.

package com.iescamp;

import java.util.Scanner;

public class Opera2 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            float addition, subtraction, multiplication, division, remainder, originalNum1, originalNum2, increaseNum1, increaseNum2, decreaseNum1, decreaseNum2;

            System.out.println("Escribe el primer número: ");
            float num1 = in.nextInt();
            System.out.println("Escribe el segundo número: ");
            float num2 = in.nextInt();

            // Copiamos los valores originales de num1 y num2 para el decremento después
            originalNum1 = num1;
            originalNum2 = num2;

            // Operaciones aritméticas
            addition = num1 + num2;
            subtraction = num1 - num2;
            multiplication = num1 * num2;
            division = num1 / num2;
            remainder = num1 % num2;

            // Incremento unario
            increaseNum1 = ++num1;
            increaseNum2 = ++num2;

            // Decremento unario (sobre los valores originales)
            decreaseNum1 = --originalNum1;
            decreaseNum2 = --originalNum2;

            // Imprimir los resultados
            System.out.println("SUMA: " + addition);
            System.out.println("RESTA: " + subtraction);
            System.out.println("MULTIPLICACION: " + multiplication);
            System.out.println("DIVISION ENTERA: " + division);
            System.out.println("RESTO: " + remainder);
            System.out.println("INCREMENTO DEL PRIMER NUMERO: " + increaseNum1);
            System.out.println("INCREMENTO DEL SEGUNDO NUMERO: " + increaseNum2);
            System.out.println("DECREMENTO DEL PRIMER NUMERO: " + decreaseNum1);
            System.out.println("DECREMENTO DEL SEGUNDO NUMERO: " + decreaseNum2);
        }
    }
