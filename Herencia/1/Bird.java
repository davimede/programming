public class Bird {
    private char sexo;
    private int edad;
    private static int contadorDeAves = 0;
    private PersonalData nombres; // Nuevo atributo de tipo PersonalData

    // Constructor
    public Bird(char sexo, int edad, String nombrePajaro, String nombrePropietario) {
        this.sexo = sexo;
        this.edad = edad;
        this.nombres = new PersonalData(nombrePajaro, nombrePropietario); // Instanciamos PersonalData
        contadorDeAves++;
    }

    // Métodos Getter y Setter para los atributos
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static int getContadorDeAves() {
        return contadorDeAves;
    }

    public PersonalData getNombres() {
        return nombres;
    }

    public void setNombres(PersonalData nombres) {
        this.nombres = nombres;
    }

    // Método que devuelve el número actual de pájaros
    public static int numeroDeAves() {
        return contadorDeAves;
    }

    // Método que muestra los valores de los 2 atributos
    public void quiensoy() {
        System.out.println("Soy un ave de sexo " + sexo + " y edad " + edad);
    }

    // Método abstracto que se redefinirá en las subclases
    public void cantar() {
        System.out.println("Soy un ave cantando...");
    }
}
