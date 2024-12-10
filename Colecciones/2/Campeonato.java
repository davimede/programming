import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Campeonato {
    private Map<Especialidad, ArrayList<Deportista>> grupos;

    // Constructor
    public Campeonato() {
        grupos = new HashMap<>();
        for (Especialidad especialidad : Especialidad.values()) {
            grupos.put(especialidad, new ArrayList<>());
        }
    }

    // Método para añadir un deportista
    public void añadirDeportista(Deportista deportista) {
        grupos.get(deportista.getEspecialidad()).add(deportista);
    }

    // Método para modificar la especialidad de un deportista
    public void modificarEspecialidad(Deportista deportista, Especialidad nuevaEspecialidad) {
        grupos.get(deportista.getEspecialidad()).remove(deportista); // Elimina del grupo anterior
        deportista.setEspecialidad(nuevaEspecialidad); // Asigna la nueva especialidad
        grupos.get(nuevaEspecialidad).add(deportista); // Añade al nuevo grupo
    }

    // Método para mostrar todos los deportistas de los grupos
    public void mostrarDeportistas() {
        for (Especialidad especialidad : Especialidad.values()) {
            System.out.println(especialidad + ":");
            for (Deportista deportista : grupos.get(especialidad)) {
                System.out.println(deportista);
            }
        }
    }

    // Método para mostrar los duatletas (deportistas que practican dos especialidades)
    public void mostrarDuatletas() {
        boolean encontrados = false;
        for (Deportista deportista : obtenerTodosLosDeportistas()) {
            if (esDuatleta(deportista)) {
                System.out.println(deportista);
                encontrados = true;
            }
        }
        if (!encontrados) {
            System.out.println("No hay duatletas.");
        }
    }

    // Método para mostrar los triatletas (deportistas que practican tres especialidades)
    public void mostrarTriatletas() {
        boolean encontrados = false;
        for (Deportista deportista : obtenerTodosLosDeportistas()) {
            if (esTriatleta(deportista)) {
                System.out.println(deportista);
                encontrados = true;
            }
        }
        if (!encontrados) {
            System.out.println("No hay triatletas.");
        }
    }

    // Método auxiliar para obtener todos los deportistas
    private ArrayList<Deportista> obtenerTodosLosDeportistas() {
        ArrayList<Deportista> todosDeportistas = new ArrayList<>();
        for (Especialidad especialidad : Especialidad.values()) {
            todosDeportistas.addAll(grupos.get(especialidad));
        }
        return todosDeportistas;
    }

    // Método auxiliar para verificar si un deportista es duatleta
    private boolean esDuatleta(Deportista deportista) {
        int contador = 0;
        for (Especialidad especialidad : Especialidad.values()) {
            if (grupos.get(especialidad).contains(deportista)) {
                contador++;
            }
        }
        return contador == 2;
    }

    // Método auxiliar para verificar si un deportista es triatleta
    private boolean esTriatleta(Deportista deportista) {
        int contador = 0;
        for (Especialidad especialidad : Especialidad.values()) {
            if (grupos.get(especialidad).contains(deportista)) {
                contador++;
            }
        }
        return contador == 3;
    }
}
