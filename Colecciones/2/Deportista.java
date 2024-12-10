public class Deportista {
    private String nombre;
    private int edad;
    private Especialidad especialidad;

    // Constructor
    public Deportista(String nombre, int edad, Especialidad especialidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.especialidad = especialidad;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }
}
