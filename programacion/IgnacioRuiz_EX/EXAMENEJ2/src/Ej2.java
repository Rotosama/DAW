import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        int selection = 0, hours = 0, totalHours = 0, countBike = 0, countKayak = 0, countRope = 0;
        String category = "", answer;
        float price = 0, additionalPrice = 0, total = 0;
        Scanner readNum = new Scanner(System.in);
        Scanner readString = new Scanner(System.in);

        do {
            System.out.println("Elige una opcion:");
            System.out.println("1.BICICLETAS");
            System.out.println("2.KAYAKS");
            System.out.println("3.EQUIPO DE ESCALADA");
            System.out.println("4.FINALIZAR ALQUILER");
            selection = readNum.nextInt();

            switch (selection) {
                case 1:
                    category = "Bicicletas";
                    price = 5;
                    additionalPrice = 2;
                    countBike++;
                    break;
                case 2:
                    category = "Kayaks";
                    price = 8;
                    additionalPrice = 3;
                    countKayak++;
                    break;
                case 3:
                    category = "Equipos de escalada";
                    price = 12;
                    additionalPrice = 4;
                    countRope++;
                    break;
            }

            if (selection != 4) {
                do {
                    do {
                        System.out.println("Cuantas horas vas a usarlo?");
                        hours = readNum.nextInt();

                        System.out.println("Estas seguro de seleccionar " + category + " por " + hours + " horas ? (si/no)");
                        answer = readString.nextLine();
                        if (answer.equalsIgnoreCase("si")) {
                            totalHours += hours;
                            total += price + (additionalPrice * hours);
                        }
                    } while (!answer.equalsIgnoreCase("si"));

                    System.out.println("Quieres seguir alquilando " + category + "? (si/no)");
                    answer = readString.nextLine();
                    if ((!answer.equalsIgnoreCase("si") && (!answer.equalsIgnoreCase("no")))) {
                        System.out.println("Escribe si o no");
                    }
                } while (answer.equalsIgnoreCase("si"));
            }
        } while (selection != 4);
        System.out.println("BICICLETAS --> " + countBike);
        System.out.println("KAYAKS --> " + countKayak);
        System.out.println("EQUIPO DE ESCALADA --> " + countRope);
        System.out.println("PRECIO TOTAL: " + total + " Euros");
    }
}
