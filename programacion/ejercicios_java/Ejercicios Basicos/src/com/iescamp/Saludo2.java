//Programa que muestra, en varias líneas el siguiente mensaje (esta vez el nombre de la persona
//debe solicitarse primero).
package com.iescamp;

import java.util.Scanner;

public class Saludo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("¿Como te llamas?");
        String name = in.nextLine();
        System.out.println("Buenos días");
        System.out.println("Sr/a " + name);
        System.out.println("Que tenga un buen día");
    }
}
