package empresa;

public class Program2 {
    public static void main(String[] args) {
        // Crear un móvil
        MobilePhone mobilePhone = new MobilePhone("123-456-789", 100);

        // Crear un empleado
        Empleado empleado = new Empleado("Juan", "12345678", 175, 75, mobilePhone);

        // Crear una empresa con el propietario
        Empresa empresa = new Empresa("Mi Empresa", 1000, empleado);

        // Mostrar los datos de la empresa antes de trabajar
        System.out.println(empresa);

        // Contratar a un gerente
        Empleado gerente = new Empleado("Carlos", "87654321", 180, 80, mobilePhone);
        empresa.hireManager(gerente);

        // Mostrar los datos de la empresa después de contratar al gerente
        System.out.println("\nDespués de contratar al gerente:");
        System.out.println(empresa);

        // Hacer que la empresa trabaje dos veces
        empresa.work();
        empresa.work();

        // Mostrar los datos de la empresa después de trabajar dos veces
        System.out.println("\nDespués de trabajar dos veces:");
        System.out.println(empresa);
    }
}
