import java.util.LinkedList;

public class CountNumOfEdgesInUndirectedGraph {
    static class Graph {
        int vertex;
        LinkedList<Integer>[] adjList;

        public Graph(int vertex) {
            this.vertex = vertex;
            adjList = new LinkedList[vertex];
            for (int i = 0; i < vertex; i++) {
                adjList[i] = new LinkedList<>();
            }
        }

        public void addEdge(int source, int destination) {
            adjList[source].add(destination);
            adjList[destination].add(source);
        }

        public int countEdges() {
            int count = 0;

            //traverse all vertex
            for (int i = 0; i <vertex;i++){

                //add all the edge that are linked to the current vertex
                count += adjList[i].size();
            }
            //because each vertex is counted twice, in the adjacency list of each vertex
                return count/2;
        }
    }
    public static void main(String[] args) {
        int vertices = 6;
        Graph graph = new Graph(vertices);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(5, 2);
        int result = graph.countEdges();
        System.out.println("sum of vertices: " + result);
    }
}
