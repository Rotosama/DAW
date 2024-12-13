import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        int age, discount = 0;
        int countMinor, countChild, countTeenagers, countAdult, countOld;
        float totalPrice = 0, price = 0;
        final float basicPrice = 50;
        Scanner readNum = new Scanner(System.in);
        Scanner readString = new Scanner(System.in);
        String answer = "", name, access;
        do {
            countAdult = 0;
            countChild = 0;
            countMinor = 0;
            countOld = 0;
            countTeenagers = 0;
            totalPrice = 0;
            do {
                System.out.println("Escribe tu nombre:");
                name = readString.nextLine();
                do {
                    System.out.println("Escribe tu edad:");
                    age = readNum.nextInt();
                    if (age < 0) {
                        System.out.println("Tiene que ser un numero positivo");
                    }
                } while (age < 0);
                do {
                    System.out.println("Escribe el tipo de pase: (diario / mediodia / nocturno)");
                    access = readString.nextLine();
                    if (!access.equalsIgnoreCase("diario") &&
                            !access.equalsIgnoreCase("mediodia") &&
                            !access.equalsIgnoreCase("nocturno")) {
                        System.out.println("Elige una opción");
                    }
                } while (!access.equalsIgnoreCase("diario") &&
                        !access.equalsIgnoreCase("mediodia") &&
                        !access.equalsIgnoreCase("nocturno"));
                price = 0;
                if (age < 6) {
                    countMinor++;
                } else if (age <= 12) {
                    price = basicPrice - (basicPrice * 0.50f);
                    countChild++;
                } else if (age <= 17) {
                    countTeenagers++;
                    do {
                        System.out.println("Es fin de semana? (si/no)");
                        answer = readString.nextLine();
                        if ((!answer.equalsIgnoreCase("si") && (!answer.equalsIgnoreCase("no")))) {
                            System.out.println("Escribe si o no");
                        }
                    } while ((!answer.equalsIgnoreCase("si") && (!answer.equalsIgnoreCase("no"))));
                    if (answer.equalsIgnoreCase("si")) {
                        price = basicPrice - (basicPrice * 0.10f);
                    } else {
                        price = basicPrice - (basicPrice * 0.20f);
                    }
                } else if (age <= 60) {
                    countAdult++;
                    price = basicPrice;
                } else if (age > 60) {
                    countOld++;
                    price = basicPrice - (basicPrice * 0.30f);
                }

                if (access.equalsIgnoreCase("mediodia")) {
                    price = price - (price * 0.70f);
                } else if (access.equalsIgnoreCase("nocturno")) {
                    price = price - (price * 0.50f);
                }
                totalPrice += price;

                do {
                    System.out.println("¿Quieres añadir otra persona? (si/no)");
                    answer = readString.nextLine();
                    if ((!answer.equalsIgnoreCase("si") && (!answer.equalsIgnoreCase("no")))) {
                        System.out.println("Escribe si o no");
                    }
                } while ((!answer.equalsIgnoreCase("si") && (!answer.equalsIgnoreCase("no"))));
            } while (answer.equalsIgnoreCase("si"));
            System.out.println("RESUMEN DE TU FACTURA:");
            System.out.println("Menores de 6:" + countMinor);
            System.out.println("Entre 6 y 12: " + countChild);
            System.out.println("Entre 13 y 17: " + countTeenagers);
            System.out.println("Entre 18 y 60: " + countAdult);
            System.out.println("Mayores de 60: " + countOld);
            System.out.println("TOTAL");
            System.out.println(totalPrice);

            System.out.println("Quieres añadir otro grupo?");
            answer = readString.nextLine();
            if ((!answer.equalsIgnoreCase("si") && (!answer.equalsIgnoreCase("no")))) {
                System.out.println("Escribe si o no");
            }
        } while (answer.equalsIgnoreCase("si"));
    }
}
