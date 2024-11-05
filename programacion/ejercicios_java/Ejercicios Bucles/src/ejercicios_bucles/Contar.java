//Pediremos al usuario un numero, y contaremos desde el uno hasta el numero que nos haya
//introducido

package ejercicios_bucles;

import java.util.Scanner;

public class Contar {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int number;

        System.out.println("¿Hasta que número quieres que cuente?");
        number = read.nextInt();

        for (int i = 1; i <= number;i++) {
            System.out.println(i);
        }
    }
}
