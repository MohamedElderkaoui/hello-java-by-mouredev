package basic.c03_strings;

/*
Clase 3 - Strings, Condicionales y Arrays (17/04/2025)
Vídeo: https://www.twitch.tv/videos/2436086584
*/

public class StringsExercises {

    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        String cadena1 = "Hola";
        String cadena2 = "Mundo";
        String resultado = cadena1 + " " + cadena2;
        System.out.println("Resultado de la concatenación: " + resultado); // Imprime el resultado de la concatenación.
        // Puedes usar el método concat() también.
       /* Ejemplo: */resultado = cadena1.concat(" ").concat(cadena2);

        // 2. Muestra la longitud de una cadena de texto.
        String cadena = "Hola Mundo";
        int longitud = cadena.length();
        System.out.println("Longitud de la cadena: " + longitud);

        // 3. Muestra el primer y último carácter de un string.
        String texto = "Hola Mundo";
        char primerCaracter = texto.charAt(0);
        char ultimoCaracter = texto.charAt(texto.length() - 1);
        System.out.println("Primer carácter: " + primerCaracter);
        System.out.println("Último carácter: " + ultimoCaracter);

        // 4. Convierte a mayúsculas y minúsculas un string.
        String textoMayusculas = texto.toUpperCase();
        String textoMinusculas = texto.toLowerCase();
        System.out.println("Texto en mayúsculas: " + textoMayusculas);
        System.out.println("Texto en minúsculas: " + textoMinusculas);

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        String frase = "Hola, soy Brais Moure";
        String palabra = "Brais";
        boolean contienePalabra = frase.contains(palabra);
        System.out.println("La frase contiene la palabra " + palabra + ": " + contienePalabra);

        // 6. Formatea un string con un entero.
        int numero = 42;
        String resultadoFormateado = String.format("El resultado es: %d", numero);
        System.out.println(resultadoFormateado);

        // 7. Elimina los espacios en blanco al principio y final de un string.
        String textoConEspacios = "   Hola Mundo   ";
        String textoSinEspacios = textoConEspacios.trim();
        System.out.println("Texto con espacios: " + textoConEspacios);
        System.out.println("Texto sin espacios: " + textoSinEspacios);

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        String textoConGuiones = texto.replace(" ", "-");
        System.out.println("Texto con guiones: " + textoConGuiones);

        // 9. Comprueba si dos strings son iguales.
        String cadenaA = "Hola";
        String cadenaB = "Hola";

        boolean sonIguales = cadenaA.equals(cadenaB);
        System.out.println("Las cadenas son iguales: " + sonIguales);

        // 10. Comprueba si dos strings tienen la misma longitud.
        String cadenaC = "Hola";
        String cadenaD = "Mundo";

        boolean tienenLaMismaLongitud = cadenaC.length() == cadenaD.length();
        System.out.println("Las cadenas tienen la misma longitud: " + tienenLaMismaLongitud);   

        // 11. Convierte un string a un array de caracteres.
        String frase2 = "Hola Mundo";
        char[] caracteres = frase2.toCharArray();
        System.out.println("Array de caracteres: " + java.util.Arrays.toString(caracteres));
    }
}
