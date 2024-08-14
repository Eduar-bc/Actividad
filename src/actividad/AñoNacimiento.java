package actividad;

import java.time.LocalDate;
import java.util.Scanner;

public class AñoNacimiento {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Obtiene la fecha actual del sistema en cada iteración
            LocalDate fechaActual = LocalDate.now();
            int actualAño = fechaActual.getYear();

            System.out.print("Ingrese el año de nacimiento (o 0 para salir): ");
            int añoNacimiento = scanner.nextInt();

            // Termina el ciclo si se ingresa el valor centinela 0
            if (añoNacimiento == 0) {
                break;
            }

            // Verifica si el año de nacimiento es válido
            if (añoNacimiento > actualAño) {
                System.out.println("El año de nacimiento ingresado es mayor que el año actual. Inténtelo de nuevo.");
                continue; // Pide otro año de nacimiento
            }
            // Calcula la edad actual del usuario
            int años = actualAño - añoNacimiento;

            // Verifica si el usuario tiene 18 años o más
            if (años >= 18) {
                System.out.println("Usted puede votar");
            } else {
                System.out.println("Usted no puede votar");
            }
        }
        // Cierra el objeto Scanner al final
        scanner.close();
    }
}
