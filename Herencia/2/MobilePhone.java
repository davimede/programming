package empresa;

public class MobilePhone {
    private String numero;
    private int bateria;

    // Constructor con dos parámetros
    public MobilePhone(String numero, int bateria) {
        this.numero = numero;
        this.bateria = bateria;
    }

    // Métodos getter y setter
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    // Método use() que disminuye la batería
    public void use() {
        if (bateria > 0) {
            bateria--;
        }
    }
}
