import java.util.Scanner;
import java.util.LinkedList;

class Graph {
    private int numVertices;
    private LinkedList<Integer>[] adjList;
    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjList = new LinkedList[numVertices];
        for (int i = 0; i < numVertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int dest) {
        adjList[src].add(dest);
    }

    public void readGraph() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of edges: ");
        int numEdges = scanner.nextInt();
        System.out.println("Enter edges (source destination):");
        for (int i = 0; i < numEdges; i++) {
            int src = scanner.nextInt();
            int dest = scanner.nextInt();
            addEdge(src, dest);
        }
        scanner.close();
    }

    private void dfsUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int neighbor : adjList[vertex]) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited);
            }
        }
    }

    public void dfs() {
        boolean[] visited = new boolean[numVertices];
        System.out.println("Depth First Traversal:");
        for (int i = 0; i < numVertices; i++) {
            if (!visited[i]) {
                dfsUtil(i, visited);
            }
        }
        System.out.println();
    }
}

public class A8Q9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int numVertices = scan.nextInt();
        Graph graph = new Graph(numVertices);
        graph.readGraph();
        graph.dfs();
        scan.close();
    }
}
