package com.iescamp;

import java.util.Scanner;

public class Ej26 {
    public static void main(String[] args) {
        int birthYear, birthMonth, birthDay, actualYear, actualMonth, actualDay, age;
        Scanner read = new Scanner(System.in);

        System.out.println("Primero pediremos la fecha de nacimiento:");
        System.out.println("En que año naciste?");
        birthYear = read.nextInt();
        System.out.println("En que mes naciste?");
        birthMonth = read.nextInt();
        System.out.println("en que dia naciste?");
        birthDay = read.nextInt();
        System.out.println("Ahora introduce la fecha actual, en que año estamos?");
        actualYear = read.nextInt();
        System.out.println("En que mes?");
        actualMonth = read.nextInt();
        System.out.println("Que dia?");
        actualDay = read.nextInt();

        age = actualYear - birthYear;




    }
}
