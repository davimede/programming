import java.util.ArrayList;

public class Cinema {
    private String name;
    private ArrayList<Movie> movies;
    private Movie[] busyRooms;

    // Constructor
    public Cinema(String name, int numberOfRooms) {
        this.name = name;
        this.movies = new ArrayList<>();
        this.busyRooms = new Movie[numberOfRooms];
    }

    // Método roomOfMovie
    public int roomOfMovie(String title, int duration, int year) {
        for (int i = 0; i < busyRooms.length; i++) {
            if (busyRooms[i] != null && busyRooms[i].isEqual(new Movie(title, duration, year))) {
                return i + 1;  // Sala encontrada (considerando 1-indexing)
            }
        }
        return -1;  // Si no se encuentra la película
    }

    // Método addMovie (con disponibilidad de salas)
    public void addMovie(Movie movie) {
        if (movies.contains(movie)) {
            System.out.println("La película ya está en el cine.");
            return;
        }

        // Buscar una sala libre
        for (int i = 0; i < busyRooms.length; i++) {
            if (busyRooms[i] == null) {
                busyRooms[i] = movie;
                movies.add(movie);
                System.out.println("Película " + movie.getTitle() + " agregada a la Sala " + (i + 1));
                return;
            }
        }
        System.out.println("No hay salas disponibles.");
    }

    // Método addMovie (con sala específica)
    public void addMovie(Movie movie, int roomNumber) {
        if (roomNumber < 1 || roomNumber > busyRooms.length) {
            System.out.println("Número de sala no válido.");
            return;
        }
        if (busyRooms[roomNumber - 1] != null) {
            System.out.println("La sala " + roomNumber + " ya está ocupada.");
            return;
        }
        if (movies.contains(movie)) {
            System.out.println("La película ya está en el cine.");
            return;
        }

        busyRooms[roomNumber - 1] = movie;
        movies.add(movie);
        System.out.println("Película " + movie.getTitle() + " agregada a la Sala " + roomNumber);
    }

    // Método removeMovie
    public void removeMovie(String titleStart) {
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getTitle().startsWith(titleStart)) {
                Movie movie = movies.get(i);
                for (int j = 0; j < busyRooms.length; j++) {
                    if (busyRooms[j] != null && busyRooms[j].isEqual(movie)) {
                        busyRooms[j] = null;
                        break;
                    }
                }
                movies.remove(i);
                i--; // Ajustar índice después de la eliminación
            }
        }
    }

    // Método freeRooms
    public ArrayList<Integer> freeRooms() {
        ArrayList<Integer> freeRooms = new ArrayList<>();
        for (int i = 0; i < busyRooms.length; i++) {
            if (busyRooms[i] == null) {
                freeRooms.add(i + 1);
            }
        }
        return freeRooms;
    }

    // Método changeRoom
    public void changeRoom(Movie movie) {
        for (int i = 0; i < busyRooms.length; i++) {
            if (busyRooms[i] != null && busyRooms[i].isEqual(movie)) {
                System.out.println("La película " + movie.getTitle() + " está en la Sala " + (i + 1));
                ArrayList<Integer> freeRooms = freeRooms();
                if (freeRooms.size() > 0) {
                    System.out.println("Elige una nueva sala: " + freeRooms);
                    // Asumiendo que el usuario proporciona una sala válida
                    // Este ejemplo no incluye interacción con el usuario por la complejidad
                    // en el entorno de consola
                    busyRooms[i] = null;
                    busyRooms[freeRooms.get(0) - 1] = movie;
                    System.out.println("Película movida a la Sala " + freeRooms.get(0));
                    return;
                } else {
                    System.out.println("No hay salas libres.");
                    return;
                }
            }
        }
        System.out.println("La película no está en el cine.");
    }

    // Método resetCinema
    public void resetCinema() {
        for (int i = 0; i < busyRooms.length; i++) {
            busyRooms[i] = null;
        }
        movies.clear();
        System.out.println("El cine ha sido reiniciado.");
    }

    // Método moviesShorterThan (con minutos)
    public ArrayList<String> moviesShorterThan(int minutes) {
        ArrayList<String> shortMovies = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getDuration() < minutes) {
                shortMovies.add(movie.getTitle());
            }
        }
        return shortMovies;
    }

    // Método moviesShorterThan (con horas y minutos)
    public ArrayList<String> moviesShorterThan(int hours, int minutes) {
        int totalMinutes = hours * 60 + minutes;
        return moviesShorterThan(totalMinutes);
    }

    // Método toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Cine " + name + "\n");
        for (int i = 0; i < busyRooms.length; i++) {
            if (busyRooms[i] != null) {
                sb.append(busyRooms[i].toString() + " - Sala " + (i + 1) + "\n");
            }
        }
        return sb.toString();
    }
}
