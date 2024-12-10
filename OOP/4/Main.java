public class PruebaPunto {
    public static void main(String[] args) {
        // Crear objetos Punto en diferentes ubicaciones
        Punto punto1 = new Punto(2, 3);   // Primer cuadrante
        Punto punto2 = new Punto(-4, 5);  // Segundo cuadrante
        Punto punto3 = new Punto(-3, -6); // Tercer cuadrante
        Punto punto4 = new Punto(7, -8);  // Cuarto cuadrante
        Punto punto5 = new Punto(0, 5);   // Sobre el eje Y
        Punto punto6 = new Punto(5, 0);   // Sobre el eje X
        Punto punto7 = new Punto(0, 0);   // En el origen
        
        // Mostrar información de cada punto
        punto1.muestra();
        punto2.muestra();
        punto3.muestra();
        punto4.muestra();
        punto5.muestra();
        punto6.muestra();
        punto7.muestra();
    }
}
