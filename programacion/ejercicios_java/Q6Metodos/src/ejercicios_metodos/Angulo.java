package ejercicios_metodos;

import java.util.Scanner;

/**
 * Programa que calcula el seno, coseno y tangente de un ángulo dado.
 *
 * @author nachoruiz
 */

public class Angulo {
    public static void main(String[] args) {
        float angle, sine, cosine, tangent;
        Scanner read = new Scanner(System.in);

        System.out.println("Escribe un ángulo:");
        angle = read.nextFloat();
        
        sine = sine(angle);
        cosine = cosine(angle);
        tangent = tangent(angle);

        System.out.printf("El seno de %.2f es: %.2f\n", angle, sine);
        System.out.printf("El coseno de %.2f es: %.2f\n", angle, cosine);
        System.out.printf("La tangente de %.2f es: %.2f\n", angle, tangent);
    }

    /**
     * Método para calcular seno de un ángulo.
     *
     * @param angle Ángulo del cual queremos saber el seno
     * @return imprime el seno del ángulo
     * @apiNote para hacer Math.sin(), se transforma previamente a radianes.
     */
    public static float sine(float angle) {
        float sine;
        float radians = (float) Math.toRadians(angle);
        sine = (float) Math.sin(radians);
        return sine;
    }

    /**
     * Método para calcular coseno de un ángulo.
     *
     * @param angle Ángulo del cual queremos saber el coseno
     * @return imprime el coseno del ángulo
     * @apiNote para hacer Math.cos(), se transforma previamente a radianes.
     */
    public static float cosine(float angle) {
        float cosine;
        float radians = (float) Math.toRadians(angle);
        cosine = (float) Math.cos(radians);
        return cosine;
    }

    /**
     * Método para calcular la tan gente de un ángulo.
     *
     * @param angle Ángulo del cual queremos saber la tangente.
     * @return imprime la tangente del ángulo.
     * @apiNote para hacer Math.tan(), se transforma previamente a radianes.
     */
    public static float tangent(float angle) {
        float tangent;
        float radians = (float) Math.toRadians(angle);
        tangent = (float) Math.tan(radians);
        return tangent;
    }
}
