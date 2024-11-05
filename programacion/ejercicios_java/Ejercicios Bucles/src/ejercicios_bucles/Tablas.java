//Escribir un programa que me ayude a aprender las tablas de multiplicar.
//Para ello se irá pidiendo la tabla de multiplicar de un número (pedido por teclado con
//anterioridad) y comprobando que los valores introducidos son correctos. Si es así el programa
//escribirá "CORRECTO" y en caso contrario deberá escribir "LO SIENTO, SE HA EQUIVOCADO. LA
//RESPUESTA CORRECTA ES número".
//La última línea mostrará el número de aciertos.
package ejercicios_bucles;

import java.util.Scanner;

public class Tablas {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number, result, correct = 0;

        System.out.println("Vamos a repasar la Tabla de multiplicar del...");
        number = read.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = ...");
            result = read.nextInt();
            if (result == number * i) {
                System.out.println("CORRECTO");
                correct++;
            } else {
                System.out.println("LO SIENTO, SE HA EQUIVOCADO. LA RESPUESTA CORRECTA ES " + (number * i));
            }
        }
        System.out.println("Número de Aciertos: " + correct);
    }
}
