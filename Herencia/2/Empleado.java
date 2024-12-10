package empresa;

public class Empleado extends Persona {
    private int dinero;
    private MobilePhone mobilePhone;

    // Constructor que recibe el teléfono móvil
    public Empleado(String nombre, String dni, int altura, int peso, MobilePhone mobilePhone) {
        super(nombre, dni, altura, peso);
        this.dinero = 0; // Inicializamos el dinero a 0
        this.mobilePhone = mobilePhone;
    }

    // Métodos para ganar y gastar dinero
    public void earnMoney(int amount) {
        this.dinero += amount;
    }

    public void spendMoney(int amount) {
        this.dinero -= amount;
    }

    // Método de trabajo, que hace que el empleado use el móvil y gane dinero
    public void work() {
        mobilePhone.use();
        this.dinero += 10;
    }

    // Redefinición de toString
    @Override
    public String toString() {
        return super.toString() + ", Dinero: " + dinero + ", Batería del móvil: " + mobilePhone.getBateria();
    }
}
