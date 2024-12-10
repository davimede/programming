public class PersonalData {
    private String nombrePajaro;
    private String nombrePropietario;

    // Constructor
    public PersonalData(String nombrePajaro, String nombrePropietario) {
        this.nombrePajaro = nombrePajaro;
        this.nombrePropietario = nombrePropietario;
    }

    // Métodos Getter y Setter para nombrePajaro
    public String getNombrePajaro() {
        return nombrePajaro;
    }

    public void setNombrePajaro(String nombrePajaro) {
        this.nombrePajaro = nombrePajaro;
    }

    // Métodos Getter y Setter para nombrePropietario
    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }
}
