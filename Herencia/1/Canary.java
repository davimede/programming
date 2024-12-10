public class Canary extends Bird {
    private double tamaño;

    // Constructor que inicializa el sexo, la edad y los datos del pájaro
    public Canary(char sexo, int edad, String nombrePajaro, String nombrePropietario) {
        super(sexo, edad, nombrePajaro, nombrePropietario);
    }

    // Constructor que inicializa el sexo, la edad, el tamaño y los datos del pájaro
    public Canary(char sexo, int edad, String nombrePajaro, String nombrePropietario, double tamaño) {
        super(sexo, edad, nombrePajaro, nombrePropietario);
        this.tamaño = tamaño;
    }

    // Método que muestra un mensaje según el tamaño del canario
    public void altura() {
        if (tamaño > 30) {
            System.out.println("Alto");
        } else if (tamaño >= 15 && tamaño <= 30) {
            System.out.println("Medio");
        } else {
            System.out.println("Pequeño");
        }
    }

    // Redefinición del método cantar
    @Override
    public void cantar() {
        System.out.println("Mi nombre es " + getNombres().getNombrePajaro() + ". Pio-pio, soy un tweety.");
    }
}
