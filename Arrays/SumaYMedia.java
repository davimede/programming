public class SumaYMedia {
    public static void main(String[] args) {
        // Crear un array de 100 posiciones
        int[] numeros = new int[100];
        
        // Rellenar el array con los números del 1 al 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;  // Los números del 1 al 100
        }
        
        // Calcular la suma de todos los números en el array
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        
        // Calcular la media
        double media = suma / (double) numeros.length;
        
        // Mostrar la suma y la media
        System.out.println("Suma de los números del 1 al 100: " + suma);
        System.out.println("Media de los números del 1 al 100: " + media);
    }
}
