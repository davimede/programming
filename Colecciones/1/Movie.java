public class Movie {
    private String title;
    private int duration;  // en minutos
    private int year;

    // Constructor
    public Movie(String title, int duration, int year) {
        this.title = title;
        this.duration = duration;
        this.year = year;
    }

    // Método toString
    @Override
    public String toString() {
        return title + " (" + year + ") - " + duration + " min";
    }

    // Método isEqual
    public boolean isEqual(Movie other) {
        return this.title.equalsIgnoreCase(other.title) &&
               this.year == other.year &&
               Math.abs(this.duration - other.duration) <= 5;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public int getYear() {
        return year;
    }
}
