package ejercicios_metodos;

import java.util.Scanner;

/**
 * Programa que calcular el porcentaje de descuento que nos han hecho al comprar algo.
 * Se debe solicitar la cantidad de tarifa y lo que realmente pagamos.
 *
 * @author nachoruiz
 */
public class Descuento {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float originalPrice, pricePaid, discount;

        System.out.println("¿Cuál es el precio original del producto?");
        originalPrice = read.nextFloat();
        System.out.println("¿Cuánto has pagado por el producto?");
        pricePaid = read.nextFloat();

        discount = calculateDiscount(originalPrice, pricePaid);
        System.out.printf("El descuento aplicado es de: %.2f%%", discount);
    }

    /**
     * Método para calcular el porcentaje de descuento
     *
     * @param original Precio original del producto
     * @param price    Precio pagado por el producto
     *
     * @return Porcentaje de descuento
     */
    public static float calculateDiscount(float original, float price) {
        return ((original - price) / original) * 100;
    }
}
