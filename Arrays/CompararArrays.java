import java.util.Arrays;

public class CompararArrays {
    public static void main(String[] args) {
        // Crear dos arrays con los mismos valores
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        
        // Comparar los arrays usando Arrays.equals()
        if (Arrays.equals(array1, array2)) {
            System.out.println("Los arrays son iguales.");
        } else {
            System.out.println("Los arrays no son iguales.");
        }

        // Crear otro array con valores diferentes
        int[] array3 = {5, 4, 3, 2, 1};

        // Comparar el array1 con array3
        if (Arrays.equals(array1, array3)) {
            System.out.println("Los arrays son iguales.");
        } else {
            System.out.println("Los arrays no son iguales.");
        }
    }
}
