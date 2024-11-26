import java.util.Scanner;

/**

 */
public class ej2 {
    public static void main(String[] args) {
        float costoPlato, costoExtra = 0, costoTotal = 0;
        int seleccion, contPlatos = 0;
        String nombrePlato, seguir, categoria = "";
        Scanner scNum = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);

        System.out.println("--- Bienvenido al Menú ---");
        do {
            System.out.println("Selecciona una opcion: \n 1. Entradas \n 2. Platos Principales \n 3. Postres \n 4.Salir");
            seleccion = scNum.nextInt();

            switch (seleccion) {
                case 1:
                    costoExtra = 0.25f;
                    categoria = "Entradas";
                    break;
                case 2:
                    costoExtra = 0.75f;
                    categoria = "Principales";
                    break;
                case 3:
                    costoExtra = 0.80f;
                    categoria = "Postres";
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
            }
            if (seleccion != 4) {
                do {
                    do {
                        System.out.println("Dime el nombre del plato: ");
                        nombrePlato = scString.nextLine();

                        System.out.println("Dime el precio del plato: ");
                        costoPlato = scNum.nextFloat();

                        System.out.println("Estas seguro? (si/no)");
                        seguir = scString.nextLine();

                        if (seguir.equalsIgnoreCase("si")) {
                            contPlatos++;
                            costoTotal += costoPlato + costoExtra;
                        }
                    } while (!seguir.equalsIgnoreCase("si"));

                    System.out.println("¿Deseas añadir un plato a la categoria " + categoria + "? (si/no)");
                    seguir = scString.nextLine();
                } while (seguir.equalsIgnoreCase("si"));
            }
        } while (seleccion != 4);
        System.out.println("Costo total: " + costoTotal);
        System.out.println("Numero de platos: " + contPlatos);
    }
}
