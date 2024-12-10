import java.util.Scanner;

public class ArrayConValores {
    public static void main(String[] args) {
        // Crear un array de 10 posiciones
        int[] numeros = new int[10];
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese los valores
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el valor para la posición " + i + ": ");
            numeros[i] = scanner.nextInt();  // Leer un número entero y almacenarlo en el array
        }
        
        // Mostrar el índice y el valor de cada posición del array
        System.out.println("\nÍndice y valores del array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }

        // Cerrar el scanner
        scanner.close();
    }
}
