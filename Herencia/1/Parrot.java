public class Parrot extends Bird {
    private char region; // N = Norte, S = Sur, E = Este, W = Oeste
    private String color;

    // Constructor que inicializa todos los atributos
    public Parrot(char sexo, int edad, String nombrePajaro, String nombrePropietario, char region, String color) {
        super(sexo, edad, nombrePajaro, nombrePropietario);
        this.region = region;
        this.color = color;
    }

    // Método que imprime el mensaje dependiendo de la región del loro
    public void dedondesoy() {
        switch (region) {
            case 'N':
                System.out.println("Norte");
                break;
            case 'S':
                System.out.println("Sur");
                break;
            case 'E':
                System.out.println("Este");
                break;
            case 'W':
                System.out.println("Oeste");
                break;
            default:
                System.out.println("Región desconocida");
        }
    }

    // Redefinición del método cantar
    @Override
    public void cantar() {
        System.out.println("Mi nombre es " + getNombres().getNombrePajaro() + ". Piopio loro lindo.");
    }
}
