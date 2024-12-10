public class PruebaNumberStatistics {
    public static void main(String[] args) {
        // Crear un objeto NumberStatistics
        NumberStatistics stats = new NumberStatistics();
        
        // Agregar números
        stats.addNumber(10);
        stats.addNumber(20);
        stats.addNumber(30);
        
        // Mostrar la cantidad de números agregados
        System.out.println("Cantidad de números agregados: " + stats.amountOfNumbers()); // 3
        
        // Mostrar las estadísticas (promedio)
        stats.showStatistics(); // Promedio: 20.0
        
        // Agregar más números
        stats.addNumber(40);
        stats.addNumber(50);
        
        // Mostrar la cantidad de números agregados nuevamente
        System.out.println("Cantidad de números agregados: " + stats.amountOfNumbers()); // 5
        
        // Mostrar las estadísticas actualizadas (promedio)
        stats.showStatistics(); // Promedio: 30.0
    }
}
