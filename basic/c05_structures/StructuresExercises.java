package basic.c05_structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
public class StructuresExercises {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.

        String[] array = new String[5];
        System.out.println(array.length);


        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        String[] array2 = {"uno", "dos", "tres", "cuatro", "cinco"};
        System.out.println(array2[0]); // Imprime el valor antes de modificarlo.
        array2[0] = "nuevo valor";
        System.out.println(array2[0]); // Imprime el valor despues de modificarlo.


        // 3. Crea un ArrayList vacío.

         ArrayList<String> arrayList = new ArrayList<>(); // Descomentar para crear un ArrayList vacío.

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        arrayList.add("valor1");
        arrayList.add("valor2");
        arrayList.add("valor3");
        arrayList.add("valor4");
        arrayList.remove("valor2");

        // 5. Crea un HashSet con 2 valores diferentes.

        // Descomentar para crear un HashSet con 2 valores diferentes.
         HashSet<String> hashSet = new HashSet<>();
         hashSet.add("valor1");
         hashSet.add("valor2");
         System.out.println(hashSet.size()); // Imprime el tamaño del HashSet.
         System.out.println(hashSet.contains("valor1")); // Imprime true si contiene el valor "valor1".
         System.out.println(hashSet.contains("valor3")); // Imprime false si no contiene el valor "valor3".
         System.out.println(hashSet); // Imprime el HashSet.          


        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        hashSet.add("valor1"); // Añade un valor repetido.
        hashSet.add("valor3"); // Añade un valor sin repetir.
        System.out.println(hashSet.size()); // Imprime el tamaño del HashSet después de añadir los valores.
        System.out.println(hashSet); // Imprime el HashSet después de añadir los valores.


        // 7. Elimina uno de los elementos del HashSet.
        hashSet.remove("valor1"); // Elimina un elemento del HashSet.
        System.out.println(hashSet.size()); // Imprime el tamaño del HashSet después de eliminar el elemento.

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        // Descomentar para crear un HashMap con contactos.
        HashMap<String, Integer> contactos = new HashMap<>(); // Descomentar para crear un HashMap con contactos.
        contactos.put("Brais", 666666666);
        contactos.put("Moure", 666666667);
        contactos.put("MoureDev", 666666668);

        // 9. Modifica uno de los contactos y elimina otro.
        contactos.put("Brais", 777777777); // Modifica el número de teléfono de Brais.
        contactos.remove("Moure"); // Elimina el contacto de Moure.

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        String[] array3 = {"uno", "dos", "tres", "cuatro", "cinco"}; // Descomentar para crear un Array.
        ArrayList<String> arrayList2 = new ArrayList<>(); // Descomentar para crear un ArrayList vacío.
        HashSet<String> hashSet2 = new HashSet<>(); // Descomentar para crear un HashSet vacío.
        HashMap<String, String> contactos2 = new HashMap<>(); // Descomentar para crear un HashMap vacío.
        for (String valor : array3) { // Descomentar para recorrer el Array.
            arrayList2.add(valor); // Descomentar para añadir el valor al ArrayList.
            hashSet2.add(valor); // Descomentar para añadir el valor al HashSet.
            contactos2.put(valor, valor); // Descomentar para añadir el valor al HashMap con clave y valor iguales.
        }
        System.out.println(arrayList2); // Imprime el ArrayList.
        System.out.println(hashSet2); // Imprime el HashSet.
        System.out.println(contactos2); // Imprime el HashMap.

       
    }
}
