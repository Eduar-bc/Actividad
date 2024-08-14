package actividad;

import java.util.Scanner;

public class VectorMulti {

    public static void main(String[] args) {
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Crea una matriz para almacenar las notas de 5 estudiantes, cada uno con 3 notas y 1 promedio
        double[][] notas = new double[5][4];

        // Lee las notas de 5 estudiantes
        for (int i = 0; i < 5; i++) {
            System.out.println("Estudiante " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese la nota " + (j + 1) + ": ");
                // Lee la nota del estudiante y la almacena en la matriz
                notas[i][j] = scanner.nextDouble();
            }
        }

        // Calcula el promedio de las 3 notas para cada estudiante
        for (int i = 0; i < 5; i++) {
            double temp = 0.0; // Variable temporal para almacenar la suma de las notas
            for (int j = 0; j < 3; j++) {
                temp += notas[i][j]; // Suma las 3 notas
            }
            temp /= 3; // Calcula el promedio
            notas[i][3] = temp; // Almacena el promedio en la última columna de la matriz
        }

        // Muestra las notas y los promedios de los estudiantes
        System.out.println("\nNotas de los estudiantes:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Estudiante " + (i + 1) + ": ");
            for (int j = 0; j < 4; j++) {
                // Imprime las notas y el promedio de cada estudiante
                System.out.print(notas[i][j] + " ");
            }
            System.out.println(); // Salta a la siguiente línea después de mostrar las notas de un estudiante
        }
        System.out.println("La cuarta nota de cada estudiante es el promedio");

        // Cierra el objeto Scanner al final
        scanner.close();
    }
}
