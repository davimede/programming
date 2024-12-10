public class Punto {
    private int x;
    private int y;

    // Constructor
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Método para determinar el cuadrante en el que se encuentra el punto
    public String cuadrante() {
        if (x > 0 && y > 0) {
            return "Primer cuadrante";
        } else if (x < 0 && y > 0) {
            return "Segundo cuadrante";
        } else if (x < 0 && y < 0) {
            return "Tercer cuadrante";
        } else if (x > 0 && y < 0) {
            return "Cuarto cuadrante";
        } else if (x == 0 && y != 0) {
            return "Sobre el eje Y";
        } else if (y == 0 && x != 0) {
            return "Sobre el eje X";
        } else {
            return "En el origen";
        }
    }

    // Método para mostrar el estado del objeto (coordenadas del punto y cuadrante)
    public void muestra() {
        System.out.println("Punto en las coordenadas: (" + x + ", " + y + ")");
        System.out.println("Cuadrante: " + cuadrante());
    }
}
