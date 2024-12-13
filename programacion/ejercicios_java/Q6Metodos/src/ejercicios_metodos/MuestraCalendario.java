
package ejercicios_metodos;

import java.util.Scanner;

/**
 * Esta clase permite generar y mostrar un calendario para un mes dado,
 * indicando el número de días del mes y el día de la semana en el que comienza.
 *
 * <p>Ejemplo: si el mes tiene 30 días y comienza en domingo, los datos de entrada serían:
 * <code>showCalendar(30, 7)</code>.</p>
 *
 * <p>La salida tendrá el siguiente formato:</p>
 *
 * <pre>
 * Lunes     Martes    Miércoles Jueves    Viernes   Sábado    Domingo
 *                                                             1
 * 2         3         4         5         6         7         8
 * ...
 * </pre>
 *
 * @author Ignacio Ruiz
 */
public class MuestraCalendario {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int daysInMonth = getValidatedDays(read);
        int startDay = getValidatedStartDay(read);

        showCalendar(daysInMonth, startDay);
    }

    /**
     * Metodo para mostrar un calendario de un mes dado con un formato tabular.
     *
     * <p>Los días de la semana se presentan como columnas, y los días del mes se distribuyen
     * en filas según correspondan. Se garantiza que las columnas están alineadas mediante
     * el uso de ancho fijo.</p>
     *
     * @param days  Número total de días en el mes (1-31).
     * @param start Día de la semana en el que comienza el mes (1 para Lunes, 7 para Domingo).
     * @see java.util.Formatter
     */
    public static void showCalendar(int days, int start) {
        // Encabezado del calendario
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%n",
                "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo");

        for (int i = 1; i < start; i++) {
            System.out.printf("%-10s", ""); // Espacios vacíos
        }

        for (int i = 1; i <= days; i++) {
            System.out.printf("%-10d", i);
            if ((i + start - 1) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    /**
     * Metodo para obtener un número de días del mes válido.
     *
     * @param read Objeto Scanner para leer la entrada del usuario.
     * @return Número de días del mes entre 1 y 31.
     */
    public static int getValidatedDays(Scanner read) {
        int days;
        do {
            System.out.println("Escribe cuántos días tiene el mes (1-31):");
            days = read.nextInt();
            if (days < 1 || days > 31) {
                System.out.println("Por favor, introduce un número entre 1 y 31.");
            }
        } while (days < 1 || days > 31);
        return days;
    }

    /**
     * Metodo para obtener un día de inicio válido.
     *
     * @param read Objeto Scanner para leer la entrada del usuario.
     * @return Día de inicio entre 1 (Lunes) y 7 (Domingo).
     */
    public static int getValidatedStartDay(Scanner read) {
        int start;
        do {
            System.out.println("Escribe en qué día empieza la semana (1 para Lunes, 7 para Domingo):");
            start = read.nextInt();
            if (start < 1 || start > 7) {
                System.out.println("Por favor, introduce un número entre 1 y 7.");
            }
        } while (start < 1 || start > 7);
        return start;
    }
}
