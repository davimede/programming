import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class ArrayListOperations {

    public static void main(String[] args) {
        // Crear una instancia del ArrayList
        ArrayList<Integer> lista = new ArrayList<>();

        // Cargar el ArrayList con los 10 primeros divisores de un número n
        cargarDivisores(lista, 36);  // Cambia 36 por el número que desees
        mostrarLista(lista);
        
        // Borrar el contenido del ArrayList
        lista.clear();

        // Cargar el ArrayList con 20 números aleatorios entre -100 y 100
        cargarNumerosAleatorios(lista, -100, 100, 20);
        mostrarLista(lista);

        // Borrar el contenido del ArrayList nuevamente
        lista.clear();

        // Cargar el ArrayList con 20 números aleatorios entre -20 y 20 sin duplicados
        cargarNumerosAleatoriosSinDuplicados(lista, -20, 20, 20);
        mostrarLista(lista);
    }

    // Método para cargar los primeros 10 divisores de un número n
    public static void cargarDivisores(ArrayList<Integer> lista, int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                lista.add(i);
            }
            if (lista.size() == 10) {
                break;  // Limitar a los primeros 10 divisores
            }
        }
    }

    // Método para mostrar el contenido de un ArrayList
    public static void mostrarLista(ArrayList<Integer> lista) {
        System.out.println("Contenido del ArrayList:");
        for (int num : lista) {
            System.out.print(num + " ");
        }
        System.out.println();  // Salto de línea
    }

    // Método para cargar un ArrayList con números aleatorios entre un rango y una cantidad específica
    public static void cargarNumerosAleatorios(ArrayList<Integer> lista, int min, int max, int cantidad) {
        Random rand = new Random();
        for (int i = 0; i < cantidad; i++) {
            lista.add(rand.nextInt((max - min) + 1) + min);
        }
    }

    // Método para cargar un ArrayList con números aleatorios sin duplicados
    public static void cargarNumerosAleatoriosSinDuplicados(ArrayList<Integer> lista, int min, int max, int cantidad) {
        Random rand = new Random();
        HashSet<Integer> set = new HashSet<>();
        
        // Asegurarse de que no haya duplicados
        while (set.size() < cantidad) {
            int numero = rand.nextInt((max - min) + 1) + min;
            set.add(numero);
        }
        
        // Convertir el HashSet a ArrayList
        lista.addAll(set);
    }
}
