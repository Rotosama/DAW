import java.util.Scanner;

/**
 * @author Ignacio Ruiz
 */
public class Q6 {
    public static void main(String[] args) {
        Scanner readString = new Scanner(System.in);
        Scanner read = new Scanner(System.in);
        String contrato, nombre;
        contrato = numContrato(readString);
        nombre = nombreCliente(readString);

    }

    public static boolean esPositivo(int num){
        return (num>0);
    }

    public static String numContrato(Scanner readString) {
        String numContrato;
        boolean esValido = false;
        do {
            System.out.println("Introduce el número de contrato:");
            numContrato = readString.nextLine();
            if (numContrato.matches("\\d{4}-\\d{4}")) {
                esValido = true;
            } else {
                System.out.println("ERROR: Formato incorrecto. Debe ser dddd-dddd.");
            }
        } while (!esValido);
        return numContrato;
    }

    public static String nombreCliente(Scanner readString) {
        String nombreCliente;
        System.out.println("Introduce el nombre del cliente:");
        nombreCliente = readString.nextLine();
        return nombreCliente;

    }

    public static int velocidadContratada(Scanner read) {
        int velocidad = 0;
        boolean esValido = false;
        do {
            System.out.println("Introduce la velocidad contratada (50, 100, 200, 500, 1024 Mbps):");
            velocidad = read.nextInt();
            if (velocidad == 50 || velocidad == 100 || velocidad == 200 || velocidad == 500 || velocidad == 1024) {
                esValido = true;
            } else {
                System.out.println("ERROR: Debe seleccionar una velocidad válida.");
            }
        } while (!esValido);
        return velocidad;
    }


    public static int datosConsumidos(Scanner read) {
        int datos;
        System.out.println("Cuantos GB has consumido?:");
        datos= read.nextInt();
        return datos;
    }

    public static void mesesContratado() {
        System.out.println("Introduce el número de meses contratados:");
    }

    public static void calculaTarifaBase() {
    }

    public static void calculaCosteDatos() {
    }

    public static void calculaDescuento() {
    }

    public static void calculaImporteTotal() {
    }


}
