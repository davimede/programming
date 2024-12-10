public class Tweety extends Canary {
    private int cantidadPeliculas;

    // Constructor que inicializa todos los atributos
    public Tweety(char sexo, int edad, String nombrePajaro, String nombrePropietario, double tamaño, int cantidadPeliculas) {
        super(sexo, edad, nombrePajaro, nombrePropietario, tamaño);
        this.cantidadPeliculas = cantidadPeliculas;
    }

    // Método principal que realiza las tareas solicitadas
    public static void main(String[] args) {
        // Crear 3 Tweeties e inicializar todos sus datos
        Tweety tweety1 = new Tweety('M', 3, "Piolín1", "Juan", 25.5, 10);
        Tweety tweety2 = new Tweety('F', 2, "Piolín2", "Ana", 20.0, 8);
        Tweety tweety3 = new Tweety('M', 4, "Piolín3", "Carlos", 30.0, 15);

        // Modificar el nombre del pájaro y del propietario en el primer Tweety
        tweety1.getNombres().setNombrePajaro("PiolínNuevo");
        tweety1.getNombres().setNombrePropietario("María");

        // Instanciar un loro
        Parrot parrot = new Parrot('M', 5, "Loro1", "Pedro", 'E', "Verde");

        // Hacer que el loro y los 3 Tweeties canten
        tweety1.cantar();
        tweety2.cantar();
        tweety3.cantar();
        parrot.cantar();

        // Mostrar el nombre del animal y el nombre del propietario en el primer Tweetie
        System.out.println("El primer Tweetie se llama " + tweety1.getNombres().getNombrePajaro() + " y su propietario es " + tweety1.getNombres().getNombrePropietario());

        // Mostrar el número de pájaros
        System.out.println("Número total de pájaros: " + Bird.numeroDeAves());
    }
}
