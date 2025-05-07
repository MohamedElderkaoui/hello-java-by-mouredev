package basic.c06_loops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Clase 5 - Bucles y funciones (06/05/2025)
Vídeo: https://www.twitch.tv/videos/2452053839
*/

public class LoopsExercises {

    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while.
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.

        // Descomentar para crear un ArrayList con valores.
         ArrayList<String> arrayList = new ArrayList<>(
            List.of("uno", "dos", "tres", "cuatro", "cinco")
         );
        int j = 0;
        do {
            System.out.println(arrayList.get(j));
            j++;
        } while (j < arrayList.size());

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        for (int k = 1; k <= 50; k++) {
            if (k % 5 == 0) {
                System.out.println(k);
            }
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.
        int[] numeros = {1, 2, 3, 4, 5};
        int suma = 0;
        for (int k = 0; k < numeros.length; k++) {
            suma += numeros[k];
        }
        System.out.println(suma);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        for (int k = 0; k < numeros.length; k++) {
            System.out.println(numeros[k]);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        HashSet<String> hashSet = new HashSet<>(
            Set.of("uno", "dos", "tres")
        );
        for (String valor : hashSet) {
            System.out.println(valor);
        }

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("uno", 1);
        hashMap.put("dos", 2);
        hashMap.put("tres", 3);
        for (String clave : hashMap.keySet()) {
            System.out.println(clave + ": " + hashMap.get(clave));
        }


        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        for (int k = 10; k >= 1; k--) {
            System.out.println(k);
        }


        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        for (int k = 1; k <= 20; k++) {
            if (k % 3 == 0) {
                continue;
            }
            System.out.println(k);
        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        int[] numerosNegativos = {1, 2, -3, 4, 5};
        for (int k = 0; k < numerosNegativos.length; k++) {
            if (numerosNegativos[k] < 0) {
                break;
            }
            System.out.println(numerosNegativos[k]);
        }

        // 10. Crea un programa que calcule el factorial de un número dado.
        int numero = 5; // Cambia este número para calcular su factorial.
        int factorial = 1;
        for (int k = 1; k <= numero; k++) {
            factorial *= k;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);  
    }
}
