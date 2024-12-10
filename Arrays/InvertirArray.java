public class InvertirArray {
    public static void main(String[] args) {
        // Crear el array original con 5 elementos
        int[] original = {1, 2, 3, 4, 5};
        
        // Crear el array para guardar los valores invertidos
        int[] invertido = new int[original.length];
        
        // Invertir los valores del array original y guardarlos en el array invertido
        for (int i = 0; i < original.length; i++) {
            invertido[i] = original[original.length - 1 - i];
        }
        
        // Mostrar el array invertido
        System.out.print("Array invertido: ");
        for (int i = 0; i < invertido.length; i++) {
            System.out.print(invertido[i] + " ");
        }
    }
}
