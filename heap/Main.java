public class Main {

    public static void main(String[] args) {
        // Crear arreglo de enteros desordenado.
        // Arreglo de enteros desordenado: 3 1 4 1 5 9 2 6 5 3 5
        int[] datos = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5 };
        System.out.println("Arreglo de enteros desordenado:");
        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i] + " ");
        }
        System.out.println("\n");
        // Construir el montículo máximo a partir del arreglo generado
        // Ordenar el arreglo utilizando HeapSort
        HeapSort.ordenar(datos);
        // Imprimir el arreglo ordenado
        System.out.println("Arreglo de enteros ordenado:");
        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i] + " ");
        }
        // Resultado esperado: 1 1 2 3 3 4 5 5 5 6 9
    }
}