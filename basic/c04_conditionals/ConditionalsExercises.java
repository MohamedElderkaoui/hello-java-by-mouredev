package basic.c04_conditionals;

/*
Clase 3 - Strings, Condicionales y Arrays (17/04/2025)
Vídeo: https://www.twitch.tv/videos/2436086584
*/

public class ConditionalsExercises {

    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        int edad = 20; // Cambia 20 por la edad del usuario.
        if (edad >= 18) {
            System.out.println("El usuario puede votar.");
        } else {
            System.out.println("El usuario no puede votar.");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        int num1 = 10; // Cambia 10 por el primer número.
        int num2 = 5; // Cambia 5 por el segundo número.
        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else if (num1 < num2) {
            System.out.println(num2 + " es mayor que " + num1);
        } else {
            System.out.println(num1 + " y " + num2 + " son iguales.");
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.
        int numero = -3; // Cambia -3 por el número a verificar.
        if (numero > 0) {
            System.out.println(numero + " es positivo.");
        } else if (numero < 0) {
            System.out.println(numero + " es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        // 4. Crea un programa que diga si un número es par o impar.
        int numeroParImpar = 7; // Cambia 7 por el número a verificar.
        if (numeroParImpar % 2 == 0) {
            System.out.println(numeroParImpar + " es par.");
        } else {
            System.out.println(numeroParImpar + " es impar.");
        }

        // 5. Verifica si un número está en el rango de 1 a 100.
        int numeroRango = 50; // Cambia 50 por el número a verificar.
        if (numeroRango >= 1 && numeroRango <= 100) {
            System.out.println("El número esta en el rango.");
        } else {
            System.out.println("El número no esta en el rango.");
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        int diaSemana = 3; // Cambia 3 por el día de la semana (1=Domingo, 2=Lunes, ..., 7=Sábado).
        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        int nota = 85; // Cambia 85 por la nota a verificar.
        if (nota >= 90) {
            System.out.println("Sobresaliente");
        } else if (nota >= 60) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        int edadCine = 14; // Cambia 14 por la edad del usuario.
        boolean acompañado = true; // Cambia true por false si no va acompañado.
        if (edadCine >= 15 || acompañado) {
            System.out.println("Puedes entrar al cine.");
        } else {
            System.out.println("No puedes entrar al cine.");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.
        char letra = 'a'; // Cambia 'a' por la letra a verificar.
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("La letra es una vocal.");
        } else {
            System.out.println("La letra es una consonante.");
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
        int a = 5; // Cambia 5 por el primer número.
        int b = 10; // Cambia 10 por el segundo número.
        int c = 3; // Cambia 3 por el tercer número.
        if (a > b && a > c) {
            System.out.println(a + " es el mayor.");
        } else if (b > a && b > c) {
            System.out.println(b + " es el mayor.");
        } else if (c > a && c > b) {
            System.out.println(c + " es el mayor.");
        } else {
            System.out.println("Hay números iguales.");
        }

    }
}
