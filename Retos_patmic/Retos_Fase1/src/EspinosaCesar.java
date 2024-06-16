
import java.util.Scanner;

public class EspinosaCesar {
    static Scanner scanner;
    String[] conjuntoPalabras = {
        "delira", "lidera",
        "ballena", "llenaba",
        "alondra", "ladrona",
        "españa", "apañes",
        "enrique", "quieren"
    };

    public void ceC01(String frase) {
        System.out.println("\nCADENA 01");
        int contVocales = 0;
        for (int i = 0; i < frase.length(); i++) {
            char caracter = Character.toLowerCase(frase.charAt(i));
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contVocales++;
            }
        }
        System.out.println("La frase: " + frase + "  tiene " + contVocales + " vocales");
    }

    public void ceC02(String frase) {
        System.out.println("\nCADENA 02");
        int contLetras = 0;
        for (int i = 0; i < frase.length(); i++) { // Contar los caracteres ingresados
            char caracter = Character.toLowerCase(frase.charAt(i)); // Convertir a minusculas
            if (caracter != 'a' && caracter != 'e' && caracter != 'i' && caracter != 'o' && caracter != 'u'
                    && caracter != ' ') {
                contLetras++;
            }
        }
        System.out.println("La frase: " + frase + " tiene " + contLetras + " letras");
    }

    public void ceC03(String frase, String vocal) {
        System.out.println("\nCADENA 03");
        // Convertir vocal a minúscula para hacer la búsqueda insensible a
        // mayúsculas/minúsculas
        vocal = vocal.toLowerCase();
        // Eliminar la vocal de la frase utilizando replace
        String nuevaFrase = frase.replaceAll("(?i)" + vocal, " ");
        System.out.println("Frase original: " + frase);
        System.out.println("Frase sin la vocal '" + vocal + "': " + nuevaFrase);
    }

    public void ceC04(String frase, String letra) {
        System.out.println("\nCADENA 04");
        // Eliminar la letra de la frase utilizando replace
        String nuevaFrase = frase.replaceAll("(?i)" + letra, " ");
        System.out.println("Frase original: " + frase);
        System.out.println("Frase sin la letra '" + letra + "': " + nuevaFrase);
    }

    public void ceC05(String frase) {
        System.out.println("\nCADENA 05");
        StringBuilder builder = new StringBuilder(frase);
        // Invertir la frase
        String fraseInvertida = builder.reverse().toString();

        // Recorrer la frase invertida para convertir las vocales a mayúsculas
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < fraseInvertida.length(); i++) {
            char caracter = fraseInvertida.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                resultado.append(Character.toUpperCase(caracter));
            } else {
                resultado.append(caracter);
            }
        }

        System.out.println("Frase original: " + frase);
        System.out.println("Frase invertida con vocales en mayúsculas: " + resultado.toString());
    }

    public void ceC06(String frase) {
        System.out.println("\nCADENA 06");

        StringBuilder resultado = new StringBuilder();

        for (int i = frase.length() - 1; i >= 0; i--) {
            char caracter = frase.charAt(i);
            if (Character.isLetter(caracter)) {
                resultado.append(esVocal(caracter) ? Character.toLowerCase(caracter) : Character.toUpperCase(caracter));
            } else {
                resultado.append(caracter);
            }
        }

        System.out.println("Frase original: " + frase);
        System.out.println("Frase invertida con consonantes en mayúsculas y vocales en minúsculas: " + resultado.toString());
    }

    private boolean esVocal(char c) {
        char vocal = Character.toLowerCase(c);
        return vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u';
    }

    public void ceC07(String frase) {
        System.out.println("\nCADENA 07");
        String fraseMayusculasSinJ = frase.toUpperCase().replaceAll("J", "");
        System.out.println("Frase en mayúsculas sin la letra 'J': " + fraseMayusculasSinJ);
    }

    public void ceC08(String conjuntoPalabras[]) {
        System.out.println("\nCADENA 08");

        // Seleccionar una palabra aleatoria del conjunto
        int indice = (int) (Math.random() * conjuntoPalabras.length);
        String palabra = conjuntoPalabras[indice];

        // Mostrar la palabra y solicitar el anagrama
        System.out.println("Palabra: " + palabra);
        System.out.println("Ingrese el anagrama de la palabra:");

        String anagramaCorrecto = conjuntoPalabras[indice + 1]; // Obtener el anagrama correcto
        int intentos = 0;
        boolean acertado = false;

        while (intentos < 3) {
            String respuesta = scanner.nextLine().trim().toLowerCase();

            if (respuesta.equals(anagramaCorrecto)) {
                System.out.println("¡Correcto! El anagrama de la palabra es '" + anagramaCorrecto + "'.");
                acertado = true;
                break;
            } else {
                System.out.println("Respuesta incorrecta. Inténtelo nuevamente.");
                intentos++;
            }
        }

        if (!acertado) {
            System.out.println("Lo siento, no has adivinado el anagrama después de 3 intentos.");
            System.out.println("El anagrama correcto era: '" + anagramaCorrecto + "'.");
        }
    }
   
}

