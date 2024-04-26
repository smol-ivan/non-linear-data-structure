public class Main {
    public static void main(String[] args) {
        // Crear una grafica mediante lista de adyacencia
        // GraphLA graphLA = new GraphLA(5);


        // Crear una grafica mediante matriz de adyacencia
        GraphMA graphMA = new GraphMA(6);
        // Agregar aristas con uniones de una direccion
        graphMA.addEdge(0, 1);
        graphMA.addEdge(0, 2);
        graphMA.addEdge(1, 3);
        graphMA.addEdge(1, 4);
        graphMA.addEdge(2, 4);
        graphMA.addEdge(3, 5);
        // Prueba de recorrido en amplitud
        System.out.println("Prueba con matriz de adyacencia:");
        // Recorrido esperado con nodo inicial 0: [0, 1, 2, 3, 4, 5]
        graphMA.BFS(graphMA, 0);
        // Prueba de recorrido en profundidad
        // Recorrido esperado con nodo inicial 0: [0, 2, 4, 1, 3, 5]
        graphMA.DFS(graphMA, 0);

        // Crear una grafica mediante lista de adyacencia
        GraphLA graphLA = new GraphLA(6);
        // Agregar aristas con uniones de una direccion
        graphLA.addEdge(0, 1);
        graphLA.addEdge(0, 2);
        graphLA.addEdge(1, 3);
        graphLA.addEdge(1, 4);
        graphLA.addEdge(2, 4);
        graphLA.addEdge(3, 5);
        // Prueba de recorrido en amplitud
        System.out.println("Prueba con lista de adyacencia:");
        // Recorrido esperado con nodo inicial 0: [0, 1, 2, 3, 4, 5]
        graphLA.BFS(graphLA, 0);
        // Prueba de recorrido en profundidad
        // Recorrido esperado con nodo inicial 0: [0, 2, 4, 1, 3, 5]
        graphLA.DFS(graphLA, 0);

    }
}
