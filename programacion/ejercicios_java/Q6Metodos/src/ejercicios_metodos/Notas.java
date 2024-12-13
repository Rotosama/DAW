package ejercicios_metodos;

import java.util.Scanner;

/**
 * <p>Programa que lee una calificación numérica entre 0 y 10 de cada alumno del aula,se acabará cuando a la pregunta
 * ¿Otro alumno si/no? se le conteste que no.</p>
 *
 * <p>Debes escribir un método para solicitar la nota (validándola) el método debe devolver una nota válida.</p>
 *
 * <p>Otro método al que se le pase una nota numérica y devuelva una calificación alfabética:</p>
 * <pre>
 *      de 0 a <3 Muy Deficiente.
 *      de 3 a <5 Insuficiente.
 *      de 5 a <6 Suficiente.
 *      de 6 a <7 Bien.
 *      de 7 a <9 Notable
 *      de 9 a 10 Sobresaliente
 * </pre>
 *
 * @author Ignacio Ruiz
 */
public class Notas {
    public static void main(String[] args) {
        String answer = "";
        Scanner read = new Scanner(System.in);
        do {
            alphabeticGrade();
            do {
                System.out.println("Otro alumno? si/no");
                answer = read.nextLine();
                if (!answer.equalsIgnoreCase("si") && (!answer.equalsIgnoreCase("no"))) {
                    System.out.println("Elige si o no");
                }
            } while (!answer.equalsIgnoreCase("si") && !answer.equalsIgnoreCase("no"));
        } while (answer.equalsIgnoreCase("si"));

    }

    /**
     * Método que valida una nota entre 0 y 10
     *
     * @return <code>grade</code> como float
     */

    public static float validateNote() {
        float grade;
        Scanner read = new Scanner(System.in);
        do {
            System.out.println("Escribe una nota:");
            grade = read.nextFloat();
            if (grade < 0 || grade > 10) {
                System.out.println("Introduce una nota válida entre 0 y 10.");
            }
        } while (grade < 0 || grade > 10);
        return grade;
    }

    /**
     * Método que alfabetiza una nota númerica y la imprime.
     * <code>stringGrade</code>
     */
    public static void alphabeticGrade() {
        String stringGrade;
        float grade = validateNote();

        if (grade < 3) {
            stringGrade = "Muy deficiente.";
        } else if (grade < 5) {
            stringGrade = "Insuficiente";
        } else if (grade < 6) {
            stringGrade = "Suficiente.";
        } else if (grade < 7) {
            stringGrade = "Bien.";
        } else if (grade < 9) {
            stringGrade = "Notable.";
        } else {
            stringGrade = "Sobresaliente.";
        }

        System.out.println(stringGrade);
    }
}
