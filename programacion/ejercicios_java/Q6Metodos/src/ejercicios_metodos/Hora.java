package ejercicios_metodos;

import java.util.Scanner;

/**
 * Programa que pide como datos de entrada la hora, los minutos y los segundos.
 * <p>
 * Haz métodos para pedir estos valores (por separado) y que los valide.
 * <p>
 * Otro método que calcule la hora, minutos y segundos que serán, transcurrido un segundo y devuelva un String.
 * <p>
 * En el programa principal se mostrarán los 10 segundos siguientes a la hora introducida.
 */
public class Hora {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int hours = getValidHours(read);
        int minutes = getValidMinutes(read);
        int seconds = getValidSeconds(read);
        String nextTime;

        for (int i = 0; i < 10; i++) {
            nextTime = oneSecondLater(hours, minutes, seconds);
            System.out.println(nextTime);
            int firstColon = nextTime.indexOf(':'); // Encuentra la primera posición de ':'
            int secondColon = nextTime.lastIndexOf(':'); // Encuentra la última posición de ':'

            // Extraer las horas, minutos y segundos como substrings
            hours = Integer.parseInt(nextTime.substring(0, firstColon)); // Desde el inicio hasta la primera ':'
            minutes = Integer.parseInt(nextTime.substring(firstColon + 1, secondColon)); // Entre los dos ':'
            seconds = Integer.parseInt(nextTime.substring(secondColon + 1)); // Desde el último ':' hasta el final
        }
    }

    public static int getValidHours(Scanner read) {
        int hours;
        do {
            System.out.println("Introduce las horas:");
            hours = read.nextInt();
            if (hours < 0 || hours > 23) {
                System.out.println("introduce una hora entre las 00 y las 24");
            }
        } while (hours < 0 || hours > 23);
        return hours;
    }

    public static int getValidMinutes(Scanner read) {
        int minutes;
        do {
            System.out.println("Introduce los minutos:");
            minutes = read.nextInt();
            if (minutes < 0 || minutes > 59) {
                System.out.println("Introduce los minutos entre 00 y 59");
            }
        } while (minutes < 0 || minutes > 59);
        return minutes;
    }

    public static int getValidSeconds(Scanner read) {
        int seconds;
        do {
            System.out.println("Introduce los segundos:");
            seconds = read.nextInt();
            if (seconds < 0 || seconds > 59) {
                System.out.println("Introduce los segundos entre 00 y 59");
            }
        } while (seconds < 0 || seconds > 59);
        return seconds;
    }

    public static String oneSecondLater(int hours, int minutes, int seconds) {
        String result;
        seconds++;

        if (seconds == 60) {
            seconds = 0;
            minutes++;
        }
        if (minutes == 60) {
            minutes = 0;
            hours++;
        }
        if (hours == 24) {
            hours = 0;
        }
        result = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        return result;
    }
}
