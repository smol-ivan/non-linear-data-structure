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

    public void addEdge(int source, int destination, boolean directed) {
        adjacencyList.get(source).add(destination);
        if (!directed) {
            adjacencyList.get(destination).add(source);
        }
    }

    public void caminoCorto(int source, int destination) {
        boolean[] visitados = new boolean[vertices];
        int[] previos = new int[vertices];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visitados[source] = true;
        previos[source] = -1;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (current == destination) {
                break;
            }
            for (int neighbor : adjacencyList.get(current)) {
                if (!visitados[neighbor]) {
                    queue.add(neighbor);
                    visitados[neighbor] = true;
                    previos[neighbor] = current;
                }
            }
        }
        Stack<Integer> stack = new Stack<>();
        int current = destination;
        while (previos[current] != -1) {
            stack.push(current);
            current = previos[current];
        }
        stack.push(source);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public void DFS(GraphLA graph, int startNode) {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[vertices];
        visited[startNode] = true;
        stack.push(startNode);
        
        System.out.print("Recorrido en profundidad: ");
        while (!stack.isEmpty()) {
            int node = stack.pop();
            System.out.print(node + " ");
            for (int neighbor : graph.adjacencyList.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    stack.push(neighbor);
                }
            }
        }
        System.out.println();
    }

    public void BFS(GraphLA graph, int startNode) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[vertices];
        visited[startNode] = true;
        queue.add(startNode);
        
        System.out.print("Recorrido en amplitud: ");
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            for (int neighbor : graph.adjacencyList.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }
}