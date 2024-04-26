import java.util.Random;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        int[] testSizes = {100, 1000, 10000}; // Tamaños de prueba
        Random random = new Random();

        System.out.println("Tiempos de inserción para árboles AVL y Rojo-Negro:");

        for (int size : testSizes) {
            // Construir árbol AVL
            AVLTree<Integer, Integer> avlTree = new AVLTree<>();
            for (int i = 0; i < size; i++) {
                int key = random.nextInt(); // Clave aleatoria
                avlTree.put(key, i); // Valor igual a la clave para simplificar
            }

            // Construir árbol Rojo-Negro
            TreeMap<Integer, Integer> rbTree = new TreeMap<>();
            for (int i = 0; i < size; i++) {
                int key = random.nextInt(); // Clave aleatoria
                rbTree.put(key, i); // Valor igual a la clave para simplificar
            }

            // Generar clave aleatoria para la inserción adicional
            int additionalKey = random.nextInt();

            // Medir el tiempo de inserción adicional en AVL
            long startTime = System.nanoTime();
            avlTree.put(additionalKey, size + 1);
            long avlInsertionTime = System.nanoTime() - startTime;

            // Medir el tiempo de inserción adicional en Rojo-Negro
            startTime = System.nanoTime();
            rbTree.put(additionalKey, size + 1);
            long rbInsertionTime = System.nanoTime() - startTime;

            // Imprimir resultados
            System.out.println("Tamaño del árbol: " + size);
            System.out.println("Tiempo de inserción adicional AVL: " + avlInsertionTime + " nanosegundos");
            System.out.println("Tiempo de inserción adicional Rojo-Negro: " + rbInsertionTime + " nanosegundos");
            System.out.println();
        }
    }
}