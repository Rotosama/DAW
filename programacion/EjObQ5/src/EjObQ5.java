//Programa para resolver ecuaciones de segundo grado:

//Pediremos al usuario los valores de a, b y c.

//Antes de comenzar a resolver la ecuación, hay que calcular el discriminante:
//(b² - 4*a*c) o (b*b - 4*a*c)
//Para calcular la raíz cuadrada en Java, utilizamos la clase Math de la siguiente forma:
//               Math.sqrt(d) calcula y devuelve la raíz cuadrada de d
//
//              Math.pow(b,2) calcula y devuelve el cuadrado de b
//Se pueden presentar tres casos distintos:

//·Si discriminante > 0.0 las dos raíces son reales y distintas, una sumando la raíz y otra restando:
//      Mostraremos el resultado: "x1=valor y x2=valor"
//·Si discriminante = 0.0 las dos raíces son reales e iguales, y valen:
//      Mostraremos el mensaje: "Raíces iguales x1=x2=valor"
//·Finalmente, si discriminante < 0.0 las dos raíces son complejas.
//      Nosotros mostraremos el mensaje -> "Raíces complejas"

//IGNACIO RUIZ GARCIA

import java.util.Scanner;

public class EjObQ5 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Scanner readString = new Scanner(System.in);
        float a, b, c, x1, x2;
        float discriminante;
        String hayMasEcuaciones = "";

        System.out.println("Vamos a resolver una ecuación de segundo grado, por favor introduce los datos:");
        do {
            System.out.println("Cuanto vale 'a'?");
            a = read.nextFloat();
            System.out.println("Cuanto vale 'b'?");
            b = read.nextFloat();
            System.out.println("Cuanto vale 'c'?");
            c = read.nextFloat();
            //Compruebo que a != 0 ya que no sería una ecuación de segundo grado, ademas no se puede dividir por 0
            if (a != 0) {
                discriminante = (float) (Math.pow(b, 2) - 4 * a * c);
                //Muestro la ecuación de segundo grado discriminando si los números son positivos o negativos para que quede
                //la ecuación mas "limpia" y no hayan cosas como + -3x
                System.out.print(a + "x² ");
                if (b < 0) {
                    System.out.print(b + "x ");
                } else {
                    System.out.print("+" + b + "x ");
                }
                if (c < 0) {
                    System.out.print(c);
                } else {
                    System.out.print("+" + c);
                }
                System.out.println(" = 0");
                System.out.println("RESULTADO:");
                //Compruebo cuantas soluciones tiene la ecuación a través del discriminante
                if (discriminante > 0) {
                    x1 = (float) (-b + Math.sqrt(discriminante)) / (2 * a);
                    x2 = (float) (-b - Math.sqrt(discriminante)) / (2 * a);
                    System.out.println("x1 = " + x1);
                    System.out.println("x2 = " + x2);
                }

                if (discriminante == 0) {
                    //si b = 0, lo filtro para no tener la solución de -0.0
                    if (b == 0) {
                        x1 = 0;
                    } else {
                        x1 = -b / 2 * a;
                    }
                    System.out.println("Raices iguales, x1 = x2 = " + x1);
                }

                if (discriminante < 0) {
                    System.out.println("Raices complejas");
                }
                do {
                    System.out.println("¿Deseas resolver otra ecuación de 2º grado s/n ?");
                    hayMasEcuaciones = readString.nextLine();
                } while (!hayMasEcuaciones.equalsIgnoreCase("s") &&
                        !hayMasEcuaciones.equalsIgnoreCase("n"));
            } else {
                System.out.println("Si a = 0, no es una ecuación de segundo grado");
            }
        } while (!hayMasEcuaciones.equalsIgnoreCase("n"));
    }
}
