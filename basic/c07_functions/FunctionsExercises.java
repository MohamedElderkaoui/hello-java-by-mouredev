package basic.c07_functions;

import java.util.ArrayList;

/*
Clase 5 - Bucles y funciones (06/05/2025)
Vídeo: https://www.twitch.tv/videos/2452053839
*/

public class FunctionsExercises {

    public static void main(String[] args) {

        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".

        welcome();
        
        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.

        String name = "Brais";
        greet(name);

        // 3. Haz un método que reciba dos números enteros y devuelva su resta.

        int x = 10;
        int y = 5;
        System.out.println(subtract(x, y));
        // 4. Crea un método que calcule el cuadrado de un número (n * n).

        int n = 5;
        System.out.println(square(n));

        // 5. Escribe una función que reciba un número y diga si es par o impar.

        int number = 4;
        System.out.println(isEven(number));
        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).

        int age = 18;
        System.out.println(isAdult(age));

        // 7. Implementa una función que reciba una cadena y retorne su longitud.

        String s = "Hello";
        System.out.println(getLength(s));

        //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(average(arr));
        // 9. Escribe un método que reciba un número y retorna su factorial.

        int num = 5;
        System.out.println(factorial(num));

        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.

        ArrayList<String> list = new ArrayList<>();
        list.add("uno");
        list.add("dos");
        list.add("tres");
        list.add("cuatro");
        list.add("cinco");
        printList(list);
    }

        // 1. Función para dar la bienvenida
    public static void welcome() {
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }

    // 2. Función que saluda a una persona por su nombre
    public static void greet(String name) {
        System.out.println("¡Hola, " + name + "!");
    }

    // 3. Método que recibe dos enteros y devuelve su resta
    public static int subtract(int x, int y) {
        return x - y;
    }

    // 4. Método que calcula el cuadrado de un número
    public static int square(int x) {
        return x * x;
    }

    // 5. Función que determina si un número es par
    public static boolean isEven(int x) {
        return x % 2 == 0;
    }

    // 6. Método que verifica si es mayor de edad
    public static boolean isAdult(int age) {
        return age >= 18;
    }

    // 7. Función que retorna la longitud de una cadena
    public static int getLength(String s) {
        return s.length();
    }

    // 8. Método que calcula la media de un array de enteros
    public static double average(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int val : arr) {
            sum += val;
        }
        return sum / arr.length;
    }

    // 9. Método que calcula el factorial de un número
    public static long factorial(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("No se puede calcular el factorial de un número negativo");
        }
        long result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    // 10. Función que recorre un ArrayList de Strings y muestra cada elemento
    public static void printList(ArrayList<String> list) {
        System.out.println("Elementos de la lista:");
        for (String element : list) {
            System.out.println("- " + element);
        }
    }
}
