import java.io.IOException;

/**
 * @author usuario
 */
public class PrimYKruskal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // Crear instancia de LectorDeGrafos
        LectorDeGrafos lector = new LectorDeGrafos();
        // Leer matriz de adyacencia
        String path = "DTP/Range_100/ins_050_1.txt";
        int[][] matriz = lector.leerMatrizDeAdyacencia(path);
        // Prueba de Kruskal
        pruebaKruskal(matriz);
        // Prueba de Prim
        pruebaPrim(matriz);

        // Crear instancia de LectorDeGrafos
        LectorDeGrafos lector1 = new LectorDeGrafos();
        // Leer matriz de adyacencia
        String path1 = "DTP/Range_100/ins_050_2.txt";
        int[][] matriz1 = lector1.leerMatrizDeAdyacencia(path1);
        // Prueba de Kruskal
        pruebaKruskal(matriz1);
        // Prueba de Prim
        pruebaPrim(matriz1);

        // Crear instancia de LectorDeGrafos
        LectorDeGrafos lector2 = new LectorDeGrafos();
        // Leer matriz de adyacencia
        String path2 = "DTP/Range_100/ins_050_3.txt";
        int[][] matriz2 = lector2.leerMatrizDeAdyacencia(path2);
        // Prueba de Kruskal
        pruebaKruskal(matriz2);
        // Prueba de Prim
        pruebaPrim(matriz2);
    }

    private static void pruebaKruskal(int[][] matriz) {
        System.out.println("\n" + "Kruskal" + "\n");
        // Crea instancia de Kruskal
        Kruskal kruskal = new Kruskal();
        // Llama al método designMST
        kruskal.applyKruskal(matriz);

    }

    private static void pruebaPrim(int[][] matriz) {
        System.out.println("\n" + "Prim" + "\n");
        // Crea instancia de MinimumSpanningTreeExample
        MinimumSpanningTreeExample prim = new MinimumSpanningTreeExample(matriz.length);
        // Llama al método designMST
        prim.designMST(matriz);
    }

}
