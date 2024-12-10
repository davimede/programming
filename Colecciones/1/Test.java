public class Test {
    public static void main(String[] args) {
        // Crear el cine
        Cinema cinema = new Cinema("Cine Trueba", 10);

        // Crear películas
        Movie movie1 = new Movie("Django desencadenado", 165, 2012);
        Movie movie2 = new Movie("Les Misérables", 158, 2012);
        Movie movie3 = new Movie("Argo", 120, 2012);
        Movie movie4 = new Movie("The Dark Knight", 152, 2008);

        // Agregar películas
        cinema.addMovie(movie1);
        cinema.addMovie(movie2);
        cinema.addMovie(movie3);

        // Mostrar cine
        System.out.println(cinema);

        // Agregar película a sala específica
        cinema.addMovie(movie4, 5);

        // Mostrar cine
        System.out.println(cinema);

        // Cambiar sala
        cinema.changeRoom(movie1);

        // Mostrar cine
        System.out.println(cinema);

        // Eliminar películas
        cinema.removeMovie("Les");

        // Mostrar cine
        System.out.println(cinema);

        // Resetear cine
        cinema.resetCinema();

        // Mostrar cine
        System.out.println(cinema);
    }
}
