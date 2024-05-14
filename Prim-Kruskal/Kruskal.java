import java.util.Arrays;

class Kruskal {

    public void applyKruskal(int[][] graph) {
        int vertices = graph.length;

        // Array to store constructed MST
        int[][] finalResult = new int[vertices][2];
        for (int i = 0; i < vertices; i++) {
            finalResult[i][0] = -1;
            finalResult[i][1] = -1;
        }
        int newEdge = 0;

        // Using sort() method for sorting the edges
        int[][] edges = getEdges(graph);
        Arrays.sort(edges, (a, b) -> a[2] - b[2]);

        // Create an array of the vertices of type Subset for the subsets of vertices
        int[] parent = new int[vertices];
        int[] rank = new int[vertices];

        // Initialize parent and rank arrays
        for (int i = 0; i < vertices; i++) {
            parent[i] = i;
            rank[i] = 0;
        }

        int index = 0;
        while (newEdge < vertices - 1 && index < edges.length) {
            int[] nextEdge = edges[index++];
            int x = find(parent, nextEdge[0]);
            int y = find(parent, nextEdge[1]);

            if (x != y) {
                finalResult[newEdge++] = nextEdge;
                union(parent, rank, x, y);
            }
        }

        printMST(finalResult);
    }

    private int[][] getEdges(int[][] graph) {
        int edges = 0;
        for (int i = 0; i < graph.length; i++) {
            for (int j = i + 1; j < graph[i].length; j++) {
                if (graph[i][j] != 0) {
                    edges++;
                }
            }
        }
        
        int[][] result = new int[edges][3];
        int index = 0;
        for (int i = 0; i < graph.length; i++) {
            for (int j = i + 1; j < graph[i].length; j++) {
                if (graph[i][j] != 0) {
                    result[index][0] = i;
                    result[index][1] = j;
                    result[index][2] = graph[i][j];
                    index++;
                }
            }
        }
        return result;
    }

    private int find(int[] parent, int i) {
        if (parent[i] != i) {
            parent[i] = find(parent, parent[i]);
        }
        return parent[i];
    }

    private void union(int[] parent, int[] rank, int x, int y) {
        int xRoot = find(parent, x);
        int yRoot = find(parent, y);

        if (rank[xRoot] < rank[yRoot]) {
            parent[xRoot] = yRoot;
        } else if (rank[xRoot] > rank[yRoot]) {
            parent[yRoot] = xRoot;
        } else {
            parent[yRoot] = xRoot;
            rank[xRoot]++;
        }
    }

    private void printMST(int[][] finalResult) {
        System.out.println("Edge \t\t Weight");
        for (int i = 0; i < finalResult.length && finalResult[i][0] != -1; i++) {
            System.out.println(finalResult[i][0] + " <-> " + finalResult[i][1] + "\t\t" + finalResult[i][2]);
        }
    }

    public static void main(String[] args) {
        Kruskal algorithm = new Kruskal();
        int[][] graph = {
            {0, 2, 0, 6, 0},
            {2, 0, 3, 8, 5},
            {0, 3, 0, 0, 7},
            {6, 8, 0, 0, 9},
            {0, 5, 7, 9, 0}
        };
        algorithm.applyKruskal(graph);
    }
}
