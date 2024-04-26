import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class GraphMA {
    private int vertices;
    private int[][] adjacencyMatrix;

    public GraphMA(int vertices) {
        this.vertices = vertices;
        this.adjacencyMatrix = new int[vertices][vertices];
    }

    public void addEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 1;
        // adjacencyMatrix[destination][source] = 1; // For undirected graphsk
    }

   // Implementa método para BFS y DFS usando una matriz de adyacencia

   public void BFS(GraphMA grafo, int startNode) {
        // Se crea una cola para almacenar los nodos por visitar
        Queue<Integer> queue = new LinkedList<>();
        // Se marca el nodo inicial como visitado y se agrega a la cola
        List<Integer> visited = new ArrayList<>();
        visited.add(startNode);
        queue.add(startNode);
        while (!queue.isEmpty()) {
            // Se extrae el primer nodo agregado a la cola
            int actualNode = queue.poll();
            // Se exploran los vecinos no visitados del nodo actual
            for (int i = 0; i < grafo.vertices; i++) {
                if (grafo.adjacencyMatrix[actualNode][i] == 1 && !visited.contains(i)) {
                    // Se marca el vecino como visitado y se agrega a la cola
                    visited.add(i);
                    queue.add(i);
                }
            }
        }
        // Se imprime el recorrido en amplitud
        System.out.println("Recorrido en amplitud: " + visited);
    }

    public void DFS(GraphMA grafo, int startNode) {
        // Se crea una pila para almacenar los nodos por visitar
        Stack<Integer> stack = new Stack<>();
        // Se marca el nodo inicial como visitado y se agrega a la pila
        List<Integer> visited = new ArrayList<>();
        stack.push(startNode);
        while (!stack.isEmpty()) {
            // Se extrae el ultimo nodo agregado a la pila
            int actualNode = stack.pop();
            if (!visited.contains(actualNode)) {
                // Marcar el nodo como visitado
                visited.add(actualNode);
                // Explorar los vecinos del nodo actual
                for (int i = 0; i < grafo.vertices; i++) {
                    if (grafo.adjacencyMatrix[actualNode][i] == 1 && !visited.contains(i)) {
                        stack.push(i);
                    }
                }
            }
        }
        // Se imprime el recorrido en profundidad
        System.out.println("Recorrido en profundidad: " + visited);
    }
    
}
