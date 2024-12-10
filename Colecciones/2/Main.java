public class Test {
    public static void main(String[] args) {
        // Crear campeonato
        Campeonato campeonato = new Campeonato();

        // Crear deportistas
        Deportista deportista1 = new Deportista("Ana", 25, Especialidad.CORREDORA);
        Deportista deportista2 = new Deportista("Carlos", 30, Especialidad.CICLISTA);
        Deportista deportista3 = new Deportista("Bea", 28, Especialidad.NADADORA);
        Deportista deportista4 = new Deportista("Luis", 35, Especialidad.CORREDORA);
        Deportista deportista5 = new Deportista("Pedro", 27, Especialidad.CICLISTA);
        Deportista deportista6 = new Deportista("Marta", 22, Especialidad.NADADORA);

        // Añadir deportistas al campeonato
        campeonato.añadirDeportista(deportista1);
        campeonato.añadirDeportista(deportista2);
        campeonato.añadirDeportista(deportista3);
        campeonato.añadirDeportista(deportista4);
        campeonato.añadirDeportista(deportista5);
        campeonato.añadirDeportista(deportista6);

        // Mostrar los deportistas
        System.out.println("Deportistas en el campeonato:");
        campeonato.mostrarDeportistas();

        // Modificar especialidades
        campeonato.modificarEspecialidad(deportista1, Especialidad.CICLISTA);
        campeonato.modificarEspecialidad(deportista3, Especialidad.CORREDORA);

        // Mostrar los deportistas después de las modificaciones
        System.out.println("\nDeportistas después de modificar especialidades:");
        campeonato.mostrarDeportistas();

        // Mostrar los duatletas
        System.out.println("\nDuatletas:");
        campeonato.mostrarDuatletas();

        // Mostrar los triatletas
        System.out.println("\nTriatletas:");
        campeonato.mostrarTriatletas();
    }
}
