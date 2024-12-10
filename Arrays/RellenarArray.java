import java.util.Arrays;

public class RellenarArray {
    public static void main(String[] args) {
        // Crear un array de 10 elementos
        int[] numeros = new int[10];
        
        // Rellenar el array con el valor 5 usando el método fill
        Arrays.fill(numeros, 5);
        
        // Mostrar el contenido del array
        System.out.println("Array rellenado con el valor 5:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
