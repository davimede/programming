package empresa;

public class Empresa {
    private String nombre;
    private int beneficio;
    private Empleado propietario;
    private Empleado gerente;

    // Constructor que recibe todos los atributos excepto el gerente
    public Empresa(String nombre, int beneficio, Empleado propietario) {
        this.nombre = nombre;
        this.beneficio = beneficio;
        this.propietario = propietario;
    }

    // Método para contratar al gerente
    public void hireManager(Empleado gerente) {
        this.gerente = gerente;
    }

    // Método para hacer que los empleados trabajen y aumentar el beneficio
    public void work() {
        propietario.work();
        if (gerente != null) {
            gerente.work();
        }
        this.beneficio += 100;
    }

    // Redefinición de toString para mostrar los datos de la empresa y empleados
    @Override
    public String toString() {
        String gerenteInfo = (gerente != null) ? gerente.toString() : "No hay gerente contratado.";
        return "Empresa: " + nombre + ", Beneficio: " + beneficio + "\n" +
               "Propietario: " + propietario.toString() + "\n" +
               "Gerente: " + gerenteInfo;
    }
}
