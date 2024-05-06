class GraphMA {
    private int vertices;
    private int[][] adjacencyMatrix;

    public GraphMA(int vertices) {
        this.vertices = vertices;
        this.adjacencyMatrix = new int[vertices][vertices];
    }

    public void addEdge(int source, int destination, boolean directed) {
        if (directed) {
            adjacencyMatrix[source][destination] = 1;
        } else {
            adjacencyMatrix[source][destination] = 1;
            adjacencyMatrix[destination][source] = 1;
        }
    }

    /*
     * Escribir una función que reciba como parámetro la matriz de adyacencia de un
     * grafo y devuelva
     * el número de caminos de longitud k que hay entre cualquier par de vértices.
     * Para resolver el
     * problema basta con calcular la matriz
     */

    public int[][] numCaminos(int[][] matriz, int k) {
        int[][] resultado = new int[vertices][vertices];
        // Inicializar la matriz resultado con la matriz de adyacencia
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                resultado[i][j] = matriz[i][j];
            }
        }

        // Elevar la matriz de adyacencia a la k
        for (int count = 2; count <= k; count++) {
            resultado = multiply(resultado, matriz);
        }
        return resultado;
    }

    private int[][] multiply(int[][] matriz1, int[][] matriz2) {
        int[][] resultado = new int[vertices][vertices];

        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                for (int k = 0; k < vertices; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        return resultado;
    }

    public int[][] getAdjacencyMatrix() {
        return adjacencyMatrix;
    }

    public void printMatrix(int[][] matriz) {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
