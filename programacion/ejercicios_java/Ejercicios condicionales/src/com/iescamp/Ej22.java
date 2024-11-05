//Ejercicio común nº 22: En un determinado comercio se realiza un descuento dependiendo del precio de cada producto. Si el precio es inferior a 6 euros, no se hace descuento; si es mayor o igual a 6 euros y menor que 60 euros, se hace un 5 % de descuento; y si es mayor o igual a 60 euros, se hace un 10 % de descuento. Programa que lee el precio de un producto y nos calcula y escribe su precio final.

package com.iescamp;

import java.util.Scanner;

public class Ej22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float precio;

        System.out.println("Introduce el precio del producto: ");
        precio = teclado.nextFloat();
        float precioFinal = precio;

        if (precio < 6) {
            System.out.println("Su producto no ha tenido descuento");
        }

        if (precio >= 6 && precio < 60) {
            precioFinal = precio * 0.95f;       // 5% de descuento
        } else if (precio >= 60) {
            precioFinal = precio * 0.90f;  // 10% de descuento
        }

        System.out.println("El precio final del producto es: " + precioFinal + " euros");
    }
}
