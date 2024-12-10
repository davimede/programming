import java.util.Scanner;

public class NotasAlumnos {
    public static void main(String[] args) {
        // Crear los arrays
        double[] notas = new double[10];   // Array para las notas (decimales)
        String[] alumnos = new String[10];  // Array para los nombres de los alumnos
        String[] resultados = new String[10]; // Array para los resultados en palabras

        Scanner scanner = new Scanner(System.in);

        // Insertar los nombres de los alumnos y sus notas
        for (int i = 0; i < 10; i++) {
            // Pedir el nombre del alumno
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            alumnos[i] = scanner.nextLine();
            
            // Pedir la nota asegurándose de que sea válida (entre 0 y 10)
            while (true) {
                System.out.print("Ingrese la nota de " + alumnos[i] + " (entre 0 y 10): ");
                double nota = scanner.nextDouble();
                if (nota >= 0 && nota <= 10) {
                    notas[i] = nota;
                    break;
                } else {
                    System.out.println("Nota inválida. Debe ser entre 0 y 10.");
                }
            }
            scanner.nextLine();  // Limpiar el buffer del scanner después de leer la nota
        }

        // Asignar el resultado en palabras basado en las notas
        for (int i = 0; i < 10; i++) {
            if (notas[i] >= 0 && notas[i] <= 4.99) {
                resultados[i] = "Suspenso";
            } else if (notas[i] >= 5 && notas[i] <= 6.99) {
                resultados[i] = "Bien";
            } else if (notas[i] >= 7 && notas[i] <= 8.99) {
                resultados[i] = "Notable";
            } else if (notas[i] >= 9 && notas[i] <= 10) {
                resultados[i] = "Sobresaliente";
            }
        }

        // Mostrar los resultados
        System.out.println("\nResultados de los alumnos:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Alumno: " + alumnos[i] + ", Nota: " + notas[i] + ", Resultado: " + resultados[i]);
        }

        // Cerrar el scanner
        scanner.close();
    }
}
