package actividad;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese el tamaño del array
        System.out.println("Ingrese el tamaño del Array");
        int tamaño = scanner.nextInt();
        
        // Crear un array de enteros con el tamaño especificado por el usuario
        int[] numeros = new int[tamaño];
        
        // Ciclo para llenar el array con números ingresados por el usuario
        for(int i = 0; i < tamaño; i++){
            System.out.println("Ingrese el numero");
            numeros[i] = scanner.nextInt();
        }
        
        // Inicializar contadores para números positivos, negativos y ceros
        int positivos = 0;
        int negativos = 0;
        int cero = 0;
        
        // Ciclo para recorrer el array y clasificar los números
        for(int numero: numeros){

            if(numero > 0){
                positivos++;  // Incrementar el contador de positivos
            }else if(numero < 0){
                negativos++;  // Incrementar el contador de negativos
            }else{
                cero++;  // Incrementar el contador de ceros
            }  
        }
        
        // Mostrar los resultados
        System.out.println("Los numeros positivos son: " + positivos);
        System.out.println("Los numeros Negativos son: " + negativos);
        System.out.println("Los numeros cero son: " + cero);
    }
}
