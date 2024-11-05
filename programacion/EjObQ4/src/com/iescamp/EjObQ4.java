//Diseña un algoritmo (ordinograma o pseudocódigo) que permita obtener
//la nota media de un número indeterminado de notas correspondiente a la asignatura de programación.
//
//Antes de comenzar el bucle se desconoce el número de notas (alumnos) a procesar,
//por lo que habrá que utilizar un bucle controlado por centinela, este aspecto te lo dejo a tu elección,
//puedes considerar un valor para finalizar, puedes preguntar de alguna manera al usuario si quiere introducir otra nota, etc.
//Al final del algoritmo será necesario mostrar:
//
//La nota media.
//La cantidad de calificaciones inferiores a 5 (suspensos).
//La cantidad de aprobados, superiores o iguales a 5.
//La cantidad de notables, mayor o igual que 7 y menor que 9.
//La cantidad notas incorrectas introducidas, estas no se tendrán en cuenta para la media.
//VOLUNTARIO: indicar cuál es la nota más repetida, o más frecuente.

//Se debe comprobar que la nota es correcta, es decir >=0 y <=10 (rango válido para una nota)
//
//En caso de ser una nota incorrecta, se dará un aviso al usuario y se pedirá de nuevo

//IGNACIO RUIZ GARCIA

package com.iescamp;

import java.util.Scanner;

public class EjObQ4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float averageGrades, grade, sumGrades = 0;
        int md = 0, ins = 0, suf = 0, bien = 0, not = 0, sobre = 0;
        int countFails = 0, countPassed = 0, countNotables = 0, countInvalid = 0;
        int countGrades = 0, maxCounter = 0;
        String mostFrequentGrade = null;
        char moreGrades = 's';

        System.out.println("*****************************************************************************");
        System.out.println("    Bienvenido a tu controlador para saber la nota media de programación!");
        System.out.println("    Debes introducir las notas de los alumnos comprendidas entre 0 y 10");
        System.out.println("*****************************************************************************");

        /*
        Empezamos el bucle, en caso de que la nota este en el rango, vamos aumentando los contadores para luego sumarlos y
        compararlos. Si la nota no esta en el rango, no acumulo para la media.
        Despues del else clasifico por un lado, para saber lo que pide el ejercicio y por otro para saber cual es la mas frecuente
            0 > 3 MD
            3 < 5 INS
            5 < 6 SUF
            6 < 7 BIEN
            7 < 9 NOTABLE
            9 10 SOBRESALIENTE
         */
        do {
            System.out.println("Introduce la nota:");
            grade = read.nextFloat();
            if (grade < 0 || grade > 10) {
                System.out.println("Por favor, introduce una nota correcta!");
                countInvalid++;
            } else {
                countGrades++;
                sumGrades += grade;
                if (grade < 3) {
                    md++;
                    countFails++;
                } else if (grade < 5) {
                    ins++;
                    countFails++;
                } else if (grade < 6) {
                    countPassed++;
                    suf++;
                } else if (grade < 7) {
                    bien++;
                    countPassed++;
                } else if (grade < 9) {
                    not++;
                    countNotables++;
                    countPassed++;
                } else {
                    sobre++;
                    countPassed++;
                }
                System.out.println("Quiere añadir otra nota S/N ?");
                moreGrades = read.next().charAt(0);
            }
        } while (moreGrades == 's' || moreGrades == 'S');

        //Se comprueba cual es el mayor contador, y en base a eso se le asigna un valor a la variable para mostrarla luego
        if (maxCounter <= md) {
            maxCounter = md;
            mostFrequentGrade = "MUY DEFICIENTE";
        }
        if (maxCounter < ins) {
            maxCounter = ins;
            mostFrequentGrade = "INSUFICIENTE";
        }
        if (maxCounter < suf) {
            maxCounter = suf;
            mostFrequentGrade = "SUFICIENTE";
        }
        if (maxCounter < bien) {
            maxCounter = bien;
            mostFrequentGrade = "BIEN";
        }
        if (maxCounter < not) {
            maxCounter = not;
            mostFrequentGrade = "NOTABLE";
        }
        if (maxCounter < sobre) {
            maxCounter = sobre;
            mostFrequentGrade = "SOBRESALIENTE";
        }
        //Si hay alguna nota, muestra nuestro mensaje
        if (countGrades > 0) {
            averageGrades = sumGrades / countGrades;
            System.out.println("********************************");
            System.out.println("***      INCORRECTAS --> " + countInvalid + "   ***");
            System.out.println("***      SUSPENSOS   --> " + countFails + "   ***");
            System.out.println("***      APROBADOS   --> " + countPassed + "   ***");
            System.out.println("***      NOTABLES    --> " + countNotables + "   ***");
            System.out.println("*** ________________________ ***");
            System.out.printf(" > NOTA MEDIA --> %.2f\n", averageGrades);
            System.out.println(" > FRECUENTE  --> " + mostFrequentGrade);
        } else {
            System.out.println("No se han introducido notas correctas");
        }

    }
}
