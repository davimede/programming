package empresa;

public class Persona {
    private String nombre;
    private String dni;
    private int altura;
    private int peso;

    // Constructor con 4 parámetros
    public Persona(String nombre, String dni, int altura, int peso) {
        this.nombre = nombre;
        this.dni = dni;
        this.altura = altura;
        this.peso = peso;
    }

    // Constructor con solo el DNI, valores predeterminados para los demás atributos
    public Persona(String dni) {
        this.dni = dni;
        this.nombre = "Desconocido";
        this.altura = 170;
        this.peso = 70;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    // Redefinición de toString
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Peso: " + peso;
    }
}
