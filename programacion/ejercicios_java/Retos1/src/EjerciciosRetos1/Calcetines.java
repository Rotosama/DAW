package EjerciciosRetos1;

import java.util.Scanner;

public class Calcetines {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        StringBuilder result = new StringBuilder(); // Para almacenar todos los resultados
        String answer;
        System.out.println("Escribe la secuencia de colores de los calcetines, para parar, escribe '.'");

        do {
            // Leer entrada y eliminar espacios innecesarios
            answer = read.nextLine().trim();

            int blackCount = 0, greyCount = 0; // Reiniciar contadores

            // Recorre la entrada y cuenta calcetines
            for (int i = 0; i < answer.length(); i++) {
                char sock = answer.charAt(i);
                if (sock == 'N' || sock == 'n') {
                    blackCount++;
                } else if (sock == 'G' || sock == 'g') {
                    greyCount++;
                }
            }

            // Determina el resultado para el caso actual
            if (blackCount % 2 == 0 && greyCount % 2 == 0) {
                result.append("EMPAREJADOS\n");
            } else if (blackCount % 2 != 0 && greyCount % 2 == 0) {
                result.append("NEGRO SOLITARIO\n");
            } else if (blackCount % 2 == 0 && greyCount % 2 != 0) {
                result.append("GRIS SOLITARIO\n");
            } else {
                result.append("PAREJA MIXTA\n");
            }

        } while (!answer.equals(".")); // Repite mientras no se ingrese "."

        // Muestra todos los resultados acumulados al final
        System.out.print(result.toString());

        read.close(); // Cierra el Scanner al final
    }
}
