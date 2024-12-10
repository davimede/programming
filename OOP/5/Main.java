public class PruebaRecta {
    public static void main(String[] args) {
        // Crear dos puntos para la recta 1
        Punto puntoA1 = new Punto(1, 2);
        Punto puntoB1 = new Punto(5, 2);
        Recta recta1 = new Recta(10, puntoA1, puntoB1);

        // Crear dos puntos para la recta 2
        Punto puntoA2 = new Punto(0, 0);
        Punto puntoB2 = new Punto(3, 4);
        Recta recta2 = new Recta(5, puntoA2, puntoB2);

        // Mostrar el estado de ambas rectas
        System.out.println("Estado de la Recta 1:");
        recta1.muestra();
        System.out.println("\nEstado de la Recta 2:");
        recta2.muestra();

        // Comparar cuál de las dos rectas es más larga
        Recta masLarga = recta1.masLargo(recta2);
        System.out.println("\nLa recta más larga es:");
        masLarga.muestra();
    }
}
