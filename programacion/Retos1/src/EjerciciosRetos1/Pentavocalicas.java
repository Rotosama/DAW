//Entrada
//La entrada comienza con un número que indica la cantidad de casos de prueba que vienen a conti-
//nuación. Cada caso consiste en una palabra de no más de 30 letras de la a a la z (todas minúsculas, sin
//tilde y excluída la letra ñ).
//Salida
//Para cada caso de prueba, el programa escribirá SI si la palabra es pentavocálica y NO en caso
//contrario.
package EjerciciosRetos1;

import java.util.Scanner;

public class Pentavocalicas {
    public static void main(String[] args) {
        int number;
        String word, result = "";
        String foundVowels;
        String vowels = "aeiou";
        Scanner readNum = new Scanner(System.in);
        Scanner readStr = new Scanner(System.in);

        System.out.println("Introduce un número y seguidamente esa cantidad de palabras(sin tilde, ni Ñ):");
        number = readNum.nextInt();
        for (int i = 0; i < number; i++) {
            word = readStr.nextLine().toLowerCase();
            if (word.length() > 30) {
                result += "ERROR: 30 caracteres máximo!";
            } else if (word.contains("ñ")) {
                result += "ERROR: contiene Ñ!";
            } else if (word.contains("á") || word.contains("é") || word.contains("í")
                        || word.contains("ó") || word.contains("ú")) {
                result+="ERROR: contiene tildes!";
            } else {
                foundVowels = "";
                for (int j = 0; j < word.length(); j++) {
                    for (int k = 0; k < vowels.length(); k++) {
                        if (vowels.charAt(k) == (word.charAt(j)) && !foundVowels.contains(String.valueOf(word.charAt(j)))) {
                            foundVowels += word.charAt(j);
                        }
                    }
                }
                if (foundVowels.length() == 5) {
                    result += "SI";
                } else {
                    result += "NO";
                }
            }
            result += "\n";
        }
        System.out.println(result);
    }
}
