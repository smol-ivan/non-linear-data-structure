public class Main {
    public static void main(String[] args) {
        GraphMA grafoMA = new GraphMA(3);
        grafoMA.addEdge(0, 1, false);
        grafoMA.addEdge(1, 2, false);
        grafoMA.addEdge(2, 0, false);

        // Matriz de adyacencia
        System.out.println("Matriz de adyacencia");
        grafoMA.printMatrix(grafoMA.getAdjacencyMatrix());
        System.out.println("Matriz de caminos de longitud");
        // Matriz de caminos k
        grafoMA.printMatrix(grafoMA.numCaminos(grafoMA.getAdjacencyMatrix(), 5));
    }
}
