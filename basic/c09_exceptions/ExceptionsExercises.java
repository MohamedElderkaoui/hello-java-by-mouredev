package basic.c09_exceptions;

/*
Clase 8 - Manejo de excepciones, depuración y extras (28/05/2025)
Vídeo: https://www.twitch.tv/videos/2471305243
*/

class TemperatureException extends Exception {
    public TemperatureException(String message) {
        super(message);
    }
}

class LoginFailedException extends Exception {
    public LoginFailedException(String message) {
        super(message);
    }
}

class TemperatureChecker {
    public static void checkTemperature(int temp) throws TemperatureException {
        if (temp < -50 || temp > 50) {
            throw new TemperatureException("Temperatura fuera de rango: " + temp);
        }
    }
}

class LoginSystem {
    private String correctUser = "admin";
    private String correctPass = "1234";

    public void login(String user, String pass) throws LoginFailedException {
        if (!user.equals(correctUser) || !pass.equals(correctPass)) {
            throw new LoginFailedException("Usuario o contraseña incorrectos");
        }
    }
}

public class ExceptionsExercises {

    public static void main(String[] args) {

         // 1. Divide dos números almacenados en dos variables. Maneja la división por cero con try-catch.

        // 2. Crea un array de 3 elementos e intenta acceder al índice 5. Captura el ArrayIndexOutOfBoundsException.

        // 3. Crea una variable String nula e intenta imprimir su longitud. Maneja el NullPointerException.

        // 4. Escribe una función que transforma texto a número. Usa try-catch para manejar entradas no válidas (NumberFormatException).

        // 5. Escribe un programa con un bloque finally que se ejecute siempre, haya o no error.

        // 6. Usa throw para lanzar un IllegalArgumentException si un número introducido es negativo.

        // 7. Crea una clase TemperatureChecker que lanza una excepción personalizada si la temperatura es menor a -50 o mayor a 50.

        // 8. Crea un programa con varios bloques catch: uno para ArithmeticException, otro para ArrayIndexOutOfBoundsException.

        // 9. Crea una función checkPassword(String pass) que lance una excepción si la contraseña es demasiado corta.

        // 10. Implementa una clase LoginSystem que use una excepción personalizada LoginFailedException si el usuario o contraseña son incorrectos.
        ///////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////   ///////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////
        // 1. División con manejo de división por cero
        int a = 10, b = 0;
        try {
            int result = a / b;
            System.out.println("Resultado: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero");
        }

        // 2. ArrayIndexOutOfBoundsException
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango");
        }

        // 3. NullPointerException
        String s = null;
        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Error: String nulo");
        }

        // 4. Transformar texto a número
        String numStr = "abc";
        try {
            int num = Integer.parseInt(numStr);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no válida");
        }

        // 5. Bloque finally
        try {
            int x = 5 / 0;
        } catch (Exception e) {
            System.out.println("Error en try");
        } finally {
            System.out.println("Bloque finally ejecutado");
        }

        // 6. Lanzar IllegalArgumentException si número es negativo
        int n = -1;
        try {
            if (n < 0) {
                throw new IllegalArgumentException("Número negativo");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 7. TemperatureChecker con excepción personalizada
        try {
            TemperatureChecker.checkTemperature(60);
        } catch (TemperatureException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 8. Varios bloques catch
        try {
            int y = 10 / 0;
            int[] arr2 = new int[2];
            System.out.println(arr2[5]);
        } catch (ArithmeticException e) {
            System.out.println("Error aritmético");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error de índice");
        }

        // 9. checkPassword
        try {
            checkPassword("abc");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 10. LoginSystem con excepción personalizada
        LoginSystem login = new LoginSystem();
        try {
            login.login("admin", "wrongpass");
        } catch (LoginFailedException e) {
            System.out.println("Login fallido: " + e.getMessage());
        }
    }

    public static void checkPassword(String pass) throws Exception {
        if (pass.length() < 6) {
            throw new Exception("Contraseña demasiado corta");
        }
    }
}
