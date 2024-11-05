//Escribe un programa que defina dos variables enteras para describir las longitudes de los lados
//de un rectángulo. El programa debe pedir, calcular y escribir en la pantalla las longitudes de los
//lados, el perímetro y el área del rectángulo.

package com.iescamp;

import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {
        int base, altura, perimetro, area;
        Scanner in = new Scanner(System.in);

        System.out.println("Escribe la base del rectángulo:");
        base = in.nextInt();
        System.out.println("Escribe la altura del rectángulo:");
        altura = in.nextInt();

        perimetro = 2*(base+altura);
        area = base*altura;

        System.out.println("Un rectángulo con base " + base + " y altura " + altura + " tiene:");
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Área: " + area);
    }
}
