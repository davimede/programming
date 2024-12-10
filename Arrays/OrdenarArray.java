import java.util.Arrays;

public class OrdenarArray {
    public static void main(String[] args) {
        // Crear un array de números desordenado
        int[] numeros = {5, 2, 9, 1, 5, 6};
        
        // Ordenar el array usando Arrays.sort()
        Arrays.sort(numeros);
        
        // Mostrar el array ordenado
        System.out.println("Array ordenado:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
