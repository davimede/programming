public class Main {
    public static void main(String[] args) {
        // Crear un objeto Multiplicador con el número 5
        Multiplicador multiplicador = new Multiplicador(5);
        
        // Probar el método multiplica con varios valores
        int resultado1 = multiplicador.multiplica(3); // 5 * 3 = 15
        int resultado2 = multiplicador.multiplica(10); // 5 * 10 = 50
        
        // Imprimir los resultados
        System.out.println("5 multiplicado por 3 es: " + resultado1);
        System.out.println("5 multiplicado por 10 es: " + resultado2);
    }
}
