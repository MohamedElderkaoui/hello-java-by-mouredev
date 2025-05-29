package basic.c10_extras;

/*
 Clase 8 - Manejo de excepciones, depuración y extras (28/05/2025)
 Vídeo: https://www.twitch.tv/videos/2471305243
*/
public class ExtrasExercises {
    // 4. Variable global (campo de clase)
    private static String globalMessage = "Este es el mensaje global";

    // 6. Variable static en la clase
    public static int staticCounter = 42;

    public static void main(String[] args) {

        // 1. Crea una variable de tipo String inicializada como null y verifica que no esté vacía antes de usarla.
        String userInput = null;
        if (userInput != null && !userInput.isEmpty()) {
            System.out.println("El input del usuario es: " + userInput);
        } else {
            System.out.println("El input del usuario está vacío o es nulo.");
        }

        // 2. Escribe un programa que lea el nombre y edad del usuario usando Scanner.
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String name = scanner.nextLine();
        System.out.print("Introduce tu edad: ");
        int age = scanner.nextInt();
        System.out.println("Nombre: " + name + ", Edad: " + age);

        // 3. Declara una constante final llamada MAX_SCORE con valor 100 y muéstrala.
        final int MAX_SCORE = 100;
        System.out.println("Puntuación máxima: " + MAX_SCORE);

        // 4. Crea una variable global message y otra local message dentro del método main(). Muestra ambas.
        String localMessage = "Este es el mensaje local dentro de main()";
        System.out.println("Mensaje global: " + globalMessage);
        System.out.println("Mensaje local: " + localMessage);

        // 5. Usa import java.util.Scanner; para leer un número y mostrar si es positivo o negativo.
        System.out.print("Introduce un número: ");
        int number = scanner.nextInt();
        if (number >= 0) {
            System.out.println("El número " + number + " es positivo.");
        } else {
            System.out.println("El número " + number + " es negativo.");
        }

        // 6. Declara una variable static en una clase y accede a ella desde main() sin crear un objeto.
        System.out.println("Contador estático: " + staticCounter);


        // 7. Importa java.util.Random y genera un número aleatorio del 1 al 10.
        java.util.Random random = new java.util.Random();
        int randomNumber = random.nextInt(10) + 1; // Genera un número entre 1 y 10
        System.out.println("Número aleatorio generado: " + randomNumber);


        // 8. Crea una clase con comentarios adecuados explicando cada sección del código.

        // Aquí se define la clase ExtrasExercises que contiene el método main y otros elementos.
        // Este método main es el punto de entrada del programa y contiene ejemplos de uso de variables, constantes, y manejo de excepciones.

        // 9. Define una clase User con una constante APP_NAME, una variable global username y una función que imprima ambas.
        User user = new User("Juan");
        user.printInfo(); // Imprime la información del usuario


        // 10. Haz debug del código implementado haciendo uso de sus diferentes herramientas.
        
    }
}


// 8. Clase con comentarios adecuados
/**
 * La clase User representa un usuario en la aplicación.
 * Contiene una constante APP_NAME, un campo username y métodos
 * para mostrar su información.
 */
class User {
    // 9. Constante APP_NAME
    public static final String APP_NAME = "MiAplicacion";

    // 9. Variable global username
    private String username;

    /**
     * Constructor de User.
     * @param username Nombre de usuario.
     */
    public User(String username) {
        this.username = username;
    }

    /**
     * Imprime APP_NAME y el nombre de usuario.
     */
    public void printInfo() {
        System.out.println("Aplicación: " + APP_NAME + ", Usuario: " + username);
    }
}
