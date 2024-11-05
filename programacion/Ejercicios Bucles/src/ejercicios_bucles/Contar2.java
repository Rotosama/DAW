//Ahora pediremos dos numeros, y contaremos desde el menor hasta el mayor.

package ejercicios_bucles;

import java.util.Scanner;

public class Contar2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num1, num2;

        System.out.println("¿Desde donde quieres que cuente?");
        num1 = read.nextInt();
        System.out.println("¿Hasta donde quieres contar?");
        num2 = read.nextInt();
        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                System.out.println(i);
            }
        } else if (num1 == num2){
            System.out.println("Los número son iguales");
        } else {
            System.out.println("Solo se contar hacia adelante");
        }
    }
}
