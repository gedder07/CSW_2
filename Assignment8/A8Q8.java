import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class A8Q8 {
	int adjacencyMatrix[][];
	int vertices;
	AdjacencyMatrixRepresentation(int vertices){
		this.vertices=vertices;
		adjacencyMatrix=new int[vertices][vertices];
	}
	
	void addEdge(int source,int destination) {
		adjacencyMatrix[source][destination]=1;
		adjacencyMatrix[destination][source]=1;
	}
	
	void removeEdge(int source,int destination) {
		adjacencyMatrix[source][destination]=0;
		adjacencyMatrix[destination][source]=0;
	}
	
	void displayAdjMatrix() {
		for(int i=0;i<vertices;i++) {
			for(int j=0;j<vertices;j++)
				System.out.print(adjacencyMatrix[i][j]+" ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		AdjacencyMatrixRepresentation graph=new AdjacencyMatrixRepresentation(4);
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.displayAdjMatrix();
	}
}
