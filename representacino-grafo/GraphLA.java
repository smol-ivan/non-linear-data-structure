import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class GraphLA {
    private int vertices;
    private List<List<Integer>> adjacencyList;

    public GraphLA(int vertices) {
        this.vertices = vertices;
        this.adjacencyList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
        // adjacencyList.get(destination).add(source); // For undirected graphs
    }

    public void DFS(GraphLA graph, int startNode) {
        // Se crea una pila para almacenar los nodos por visitar
        Stack<Integer> stack = new Stack<>();
        // Se marca el nodo inicial como visitado y se agrega a la pila
        boolean[] visited = new boolean[vertices];
        visited[startNode] = true;
        stack.push(startNode);
        
        System.out.print("Recorrido en profundidad: ");
        // Mientras la pila no esté vacía
        while (!stack.isEmpty()) {
            // Se extrae el ultimo nodo agregado a la pila
            int node = stack.pop();
            System.out.print(node + " ");
            // Explorar los vecinos del nodo actual
            for (int neighbor : graph.adjacencyList.get(node)) {
                // Si el vecino no ha sido visitado, se marca como visitado y se agrega a la pila
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    stack.push(neighbor);
                }
            }
        }
        System.out.println();
    }    

    public void BFS(GraphLA graph, int startNode) {
        // Se crea una cola para almacenar los nodos por visitar
        Queue<Integer> queue = new LinkedList<>();
        // Se marca el nodo inicial como visitado y se agrega a la cola
        boolean[] visited = new boolean[vertices];
        visited[startNode] = true;
        queue.add(startNode);

        System.out.print("Recorrido en amplitud: ");
        // Mientras la cola no esté vacía
        while (!queue.isEmpty()) {
            // Se extrae el primer nodo agregado a la cola
            int node = queue.poll();
            System.out.print(node + " ");
            // Explorar los vecinos no visitados del nodo actual
            for (int neighbor : graph.adjacencyList.get(node)) {
                // Si el vecino no ha sido visitado, se marca como visitado y se agrega a la cola
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }
}
