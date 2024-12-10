public class Recta {
    private int ancho;
    private Punto punto1;
    private Punto punto2;

    // Constructor que toma el ancho y dos puntos
    public Recta(int ancho, Punto punto1, Punto punto2) {
        this.ancho = ancho;
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    // Constructor que toma el ancho y los valores X e Y para los dos puntos
    public Recta(int ancho, int x1, int y1, int x2, int y2) {
        this.ancho = ancho;
        this.punto1 = new Punto(x1, y1);
        this.punto2 = new Punto(x2, y2);
    }

    // Método que devuelve verdadero si la recta es horizontal
    public boolean esHorizontal() {
        return punto1.getY() == punto2.getY();
    }

    // Método que devuelve verdadero si la recta es vertical
    public boolean esVertical() {
        return punto1.getX() == punto2.getX();
    }

    // Método que devuelve el punto más alto de la recta
    public Punto puntoAlto() {
        if (punto1.getY() > punto2.getY()) {
            return punto1;
        } else {
            return punto2;
        }
    }

    // Método que devuelve la longitud de la recta utilizando el teorema de Pitágoras
    public double longitud() {
        int dx = punto2.getX() - punto1.getX();
        int dy = punto2.getY() - punto1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Método que recibe una recta como parámetro y devuelve la más larga de las dos rectas
    public Recta masLargo(Recta otraRecta) {
        if (this.longitud() > otraRecta.longitud()) {
            return this;
        } else {
            return otraRecta;
        }
    }

    // Método para mostrar el estado del objeto (puntos y ancho)
    public void muestra() {
        System.out.println("Recta con puntos: (" + punto1.getX() + ", " + punto1.getY() + ") y (" + punto2.getX() + ", " + punto2.getY() + ")");
        System.out.println("Ancho: " + ancho);
        System.out.println("Es horizontal: " + esHorizontal());
        System.out.println("Es vertical: " + esVertical());
        System.out.println("Punto más alto: (" + puntoAlto().getX() + ", " + puntoAlto().getY() + ")");
        System.out.println("Longitud de la recta: " + longitud());
    }
}
