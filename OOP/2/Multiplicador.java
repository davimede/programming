public class Multiplicador {
    private int numero;

    // Constructor
    public Multiplicador(int numero) {
        this.numero = numero;
    }

    // Método que multiplica otroNúmero por numero (el valor dado en el constructor)
    public int multiplica(int otroNumero) {
        return this.numero * otroNumero;
    }
}
