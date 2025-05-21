//Escribe un programa que pida 10 números por teclado y que luego muestre los
//números introducidos junto con las palabras “máximo” y “mínimo” al lado del
//máximo y del mínimo respectivamente.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
       // List<Integer> numeros = Arrays.asList(23, 45, 12, 78, 34, 56, 11, 90, 5, 67);

//agregando números a la lista
        numeros.add(23);
        numeros.add(45);
        numeros.add(12);
        numeros.add(78);
        numeros.add(34);
        numeros.add(56);
        numeros.add(11);
        numeros.add(90);
        numeros.add(5);
        numeros.add(67);

        int maximo = Collections.max(numeros);
        int minimo = Collections.min(numeros);

        System.out.println("\nNúmeros introducidos:");
        for (int numero : numeros) {
            if (numero == maximo) {
                System.out.println(numero + " (máximo)");
            } else if (numero == minimo) {
                System.out.println(numero + " (mínimo)");
            } else {
                System.out.println(numero);
            }
        }


    }
}
