//Entrada
//El programa deber´a leer, de la entrada est´andar, m´ultiples casos de prueba. Cada uno describe la
//colecci´on de calcetines de Ian con una sucesi´on de letras “N” o “G” para indicar el color (negro o gris).
//Un punto (“.”) marca el final de cada caso, y tambi´en de la entrada.
//Salida
//Por cada caso de prueba el programa escribir´a “EMPAREJADOS” si todos los calcetines tienen su pareja,
//“NEGRO SOLITARIO” o “GRIS SOLITARIO” si queda sin pareja uno del color correspondiente, o “PAREJA
//MIXTA” si sobra uno de cada color.

package EjerciciosRetos1;

import java.util.Scanner;


public class Calcetines {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String answer = "";

        System.out.println("Escribe la secuencia de colores de los calcetines, para parar, escribe '.'");

        do {
            do {
                answer = read.nextLine();
            } while (answer.equals("."));
            answer = read.nextLine();
        } while (answer.equals("."));
    }
}
