package ejercicios_metodos;

import java.util.Scanner;

/**
 * Programa que dado un valor en millas nos lo traduce a metros.
 *
 * @author Ignacio Ruiz
 */
public class Millas {
    public static void main(String[] args) {
        float miles, meters;
        Scanner read = new Scanner(System.in);

        System.out.println("Escribe el número de millas:");
        miles = read.nextFloat();
        meters = milesToMeters(miles);
        System.out.println(miles + " millas son " + meters + " metros.");
    }

    /**
     * Convierte una distancia en millas a metros.
     *
     * @param miles Distancia en millas que se desea convertir.
     * @return meters Distancia equivalente en metros.
     */
    public static float milesToMeters(float miles) {
        float meters;
        meters = miles * 1609.34f;
        return meters;
    }
}
