import java.util.ArrayList;
import java.util.List;

public class GraphRepresentation {
    
    private static final char[] LABELS = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L'};
    private final int numVertices;
    private final int[][] adjMatrix;
    private final List<List<Integer>> adjList;

    public GraphRepresentation(int numVertices) {
        this.numVertices = numVertices;
        this.adjMatrix = new int[numVertices][numVertices];
        this.adjList = new ArrayList<>();
        
        for (int i = 0; i < numVertices; i++) {
            this.adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;

        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public void printAdjacencyMatrix() {
        System.out.println("--- ADJACENCY MATRIX ---");
        System.out.print("  ");
        for (char label : LABELS) {
            System.out.print(label + " ");
        }
        System.out.println();

        for (int i = 0; i < numVertices; i++) {
            System.out.print(LABELS[i] + " ");
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void printAdjacencyList() {
        System.out.println("--- ADJACENCY LIST ---");
        for (int i = 0; i < numVertices; i++) {
            System.out.print(LABELS[i] + " -> ");
            for (int neighbor : adjList.get(i)) {
                System.out.print(LABELS[neighbor] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int numVertices = 11;
        GraphRepresentation graph = new GraphRepresentation(numVertices);

        int A=0, B=1, C=2, D=3, E=4, F=5, G=6, H=7, J=8, K=9, L=10;

        graph.addEdge(A, B);
        graph.addEdge(A, H);
        graph.addEdge(B, C);
        graph.addEdge(B, D);
        graph.addEdge(B, K);
        graph.addEdge(C, J);
        graph.addEdge(D, H);
        graph.addEdge(D, K);
        graph.addEdge(D, F);
        graph.addEdge(D, E);
        graph.addEdge(E, G);
        graph.addEdge(F, J);
        graph.addEdge(G, J);
        graph.addEdge(H, L);
        graph.addEdge(J, K);

        graph.printAdjacencyMatrix();
        graph.printAdjacencyList();
    }
}