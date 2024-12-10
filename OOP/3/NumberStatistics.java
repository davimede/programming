import java.util.ArrayList;

public class NumberStatistics {
    private ArrayList<Integer> numbers;

    // Constructor
    public NumberStatistics() {
        this.numbers = new ArrayList<>();
    }

    // Método para agregar un número a las estadísticas
    public void addNumber(int number) {
        this.numbers.add(number);
    }

    // Método para obtener la cantidad de números agregados
    public int amountOfNumbers() {
        return this.numbers.size();
    }

    // Método para mostrar el promedio de todos los números agregados
    public void showStatistics() {
        if (this.numbers.isEmpty()) {
            System.out.println("No se han agregado números.");
            return;
        }

        double sum = 0;
        for (int number : this.numbers) {
            sum += number;
        }

        double average = sum / this.numbers.size();
        System.out.println("Promedio de los números: " + average);
    }
}
