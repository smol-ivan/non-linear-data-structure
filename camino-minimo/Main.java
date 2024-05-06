public class Main {
    public static void main(String[] args) {
        GraphLA graph = new GraphLA(7);
        graph.addEdge(0, 1, false);
        graph.addEdge(0, 2, false);
        graph.addEdge(1, 3, false);
        graph.addEdge(2, 3, false);
        graph.addEdge(3, 4, false);
        graph.addEdge(4, 6, false);
        graph.addEdge(6, 5, false);
        graph.caminoCorto(0, 5);
    }
}