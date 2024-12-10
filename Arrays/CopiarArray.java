import java.util.Arrays;

public class CopiarArray {
    public static void main(String[] args) {
        // Crear y rellenar un array de números
        int[] original = {1, 2, 3, 4, 5};
        
        // Copiar el array original al nuevo array usando Arrays.copyOf
        int[] copia = Arrays.copyOf(original, original.length);
        
        // Mostrar el contenido de ambos arrays
        System.out.println("Array original:");
        for (int numero : original) {
            System.out.print(numero + " ");
        }

        System.out.println("\nArray copiado:");
        for (int numero : copia) {
            System.out.print(numero + " ");
        }
    }
}
