package ejercicios_metodos;

import java.util.Scanner;

/**
 * Escribir un programa que simule el lanzamiento de dos dados y muestre por pantalla la frecuencia de los resultados de
 * mil lanzamientos. El programa debe pedir el número de lanzamientos a simular.
 * <p>
 * Escribe un método de devuelva un String con el resultado del lanzamiento.
 * <p>
 * Nota: debes utilizar el método predefinido de Java Math.random() que devuelve un valor aleatorio real entre 0 y 1.
 */
public class Dados {
    public static void main(String[] args) {
        int numRolls;
        String multiple;
        Scanner read = new Scanner(System.in);

        System.out.println("Introduce el número de lanzamientos:");
        numRolls = read.nextInt();
        multiple = multipleRolls(numRolls);
        System.out.println(multiple);

    }

    public static int rollDie() {
        int result;
        result = (int) (Math.random() * 6) + 1;
        return result;
    }

    /**
     * Simula múltiples lanzamientos de dos dados, calcula las frecuencias de las sumas y devuelve una representación en texto.
     *
     * @param numRolls Número de lanzamientos a simular.
     *
     * @return {@code result} String con las frecuencias de las sumas representadas gráficamente.
     */
    public static String multipleRolls(int numRolls) {
        int freq2 = 0, freq3 = 0, freq4 = 0, freq5 = 0, freq6 = 0, freq7 = 0;
        int freq8 = 0, freq9 = 0, freq10 = 0, freq11 = 0, freq12 = 0;
        int die1, die2, sum;
        String result;

        for (int i = 0; i < numRolls; i++) {
            die1 = rollDie();
            die2 = rollDie();
            sum = die1 + die2;
            switch (sum) {
                case 2 -> freq2++;
                case 3 -> freq3++;
                case 4 -> freq4++;
                case 5 -> freq5++;
                case 6 -> freq6++;
                case 7 -> freq7++;
                case 8 -> freq8++;
                case 9 -> freq9++;
                case 10 -> freq10++;
                case 11 -> freq11++;
                case 12 -> freq12++;
            }

        }
        result = "Para " + numRolls + " lanzamientos:\n";
        result += printFrequency(2, freq2);
        result += printFrequency(3, freq3);
        result += printFrequency(4, freq4);
        result += printFrequency(5, freq5);
        result += printFrequency(6, freq6);
        result += printFrequency(7, freq7);
        result += printFrequency(8, freq8);
        result += printFrequency(9, freq9);
        result += printFrequency(10, freq10);
        result += printFrequency(11, freq11);
        result += printFrequency(12, freq12);

        return result;
    }

    /**
     * Devuelve la representación en texto de la frecuencia de una suma.
     *
     * @param sum       La suma de los dados.
     * @param frequency La frecuencia de la suma.
     *
     * @return <code>result</code>String con la representación gráfica de la frecuencia.
     */
    public static String printFrequency(int sum, int frequency) {
        String result = String.format("Suma %2d: ", sum);
        for (int i = 0; i < frequency; i++) {
            result += "·";
        }
        result += String.format(" (%d)%n", frequency);
        return result;
    }

}
