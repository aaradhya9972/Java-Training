public class GraphMatrix {
    private int[][] adjacencyMatrix;
    private int numVertices;

    // Constructor
    public GraphMatrix(int numVertices) {
        this.numVertices = numVertices;
        // Automatically initializes all elements to 0
        this.adjacencyMatrix = new int[numVertices][numVertices];
    }

    // Method to add an edge
    public void addEdge(int source, int destination) {
        // Set 1 for the connection
        adjacencyMatrix[source][destination] = 1;
        
        // For an undirected graph, symmetric connection is required
        adjacencyMatrix[destination][source] = 1;
    }

    // Method to remove an edge
    public void removeEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 0;
        adjacencyMatrix[destination][source] = 0;
    }

    // Method to print the matrix
    public void printGraph() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a graph with 4 vertices (0 to 3)
        GraphMatrix graph = new GraphMatrix(4);

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        // Print the structural matrix
        graph.printGraph();
    }
}