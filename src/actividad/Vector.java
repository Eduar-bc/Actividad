package actividad;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Vector {

    public static void main(String[] args) {
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Crea un HashMap para almacenar la frecuencia de cada número
        Map<Integer, Integer> conteo = new HashMap<>();

        // Crea un arreglo para almacenar los 10 números ingresados
        int[] numeros = new int[10];

        // Lee 10 números del usuario y los almacena en el arreglo
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Cuenta la frecuencia de cada número usando el HashMap
        for (int numero : numeros) {
            // Si el número ya está en el mapa, incrementa su conteo; de lo contrario, inicializa el conteo en 1
            conteo.put(numero, conteo.getOrDefault(numero, 0) + 1);
        }

        // Muestra la cantidad de veces que cada número aparece
        for (Map.Entry<Integer, Integer> entry : conteo.entrySet()) {
            System.out.println(entry.getKey() + " está " + entry.getValue() + " veces");
        }

        // Cierra el objeto Scanner al final
        scanner.close();
    }
}
