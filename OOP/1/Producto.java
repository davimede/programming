public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    // Constructor
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Método para imprimir la información del producto
    public void escribirProducto() {
        System.out.println(nombre + ", precio " + precio + ", cantidad " + cantidad);
    }

    // Getters (opcional si se requieren para otros usos)
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
}
