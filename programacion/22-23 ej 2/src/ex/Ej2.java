package ex;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        int hour, minute, dayInNumber = 0;
        String country = "", day, resp = "";
        Scanner readNum = new Scanner(System.in);
        Scanner readString = new Scanner(System.in);

        do {
            System.out.println("Introduce la hora:");
            hour = readNum.nextInt();
            System.out.println("Introduce minutos:");
            minute = readNum.nextInt();
            do {
                System.out.println("Introduce el país de Origen");
                country = readString.nextLine();
                if ((!country.equalsIgnoreCase("españa")) && (!country.equalsIgnoreCase("japon"))){
                    System.out.println("EERROR");
                }
            } while ((!country.equalsIgnoreCase("españa")) && (!country.equalsIgnoreCase("japon")));

            System.out.println("Que dia de la semana es?");
            day = readString.nextLine();

            switch (day) {
                case "lunes":
                    dayInNumber = 1;
                case "martes":
                    dayInNumber = 2;
                case "miercoles":
                    dayInNumber = 3;
                case "jueves":
                    dayInNumber = 4;
                case "viernes":
                    dayInNumber = 5;
                case "sabado":
                    dayInNumber = 6;
                case "domingo":
                    dayInNumber = 7;
            }

            if (country.equalsIgnoreCase("España")) {
                hour += 8;
                if (hour > 24) {
                    hour = hour - 24;
                    dayInNumber++;
                    if (dayInNumber > 7) {
                        dayInNumber = 1;
                    }
                }
                System.out.println("Japon"+ hour + );

            } else if (country.equalsIgnoreCase("Japon")) {
                hour -= 8;
                if (hour < 0) {
                    hour = hour + 24;
                    dayInNumber--;
                    if (dayInNumber < 1) {
                        dayInNumber = 7;
                    }
                }
            }
            switch (dayInNumber) {
                case 1:
                    day="Lunes";
            }

            System.out.println("Quieres ver otra hora?");
            resp = readString.nextLine();
        } while (resp.equalsIgnoreCase("si"));
    }
}
