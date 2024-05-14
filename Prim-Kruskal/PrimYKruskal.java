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
        // Impirmir matriz de adyacencia
        // for (int i = 0; i < matriz.length; i++) {
        //     for (int j = 0; j < matriz[i].length; j++) {
        //         System.out.print(matriz[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // Prueba de Kruskal
        pruebaKruskal(matriz);
        // Prueba de Prim
        pruebaPrim(matriz);
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
