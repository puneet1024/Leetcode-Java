import java.util.LinkedList;

public class SumAllVerticesInUndirectedGraph {
    static class Graph {
        int vertex;
        LinkedList<Integer>[] adjList;

        public Graph(int vertex){
            this.vertex = vertex;
            adjList = new LinkedList[vertex];
            for(int i=0;i<vertex;i++){
                adjList[i] = new LinkedList<>();
            }
        }
        public void addEdge(int source, int destination){

            //undirected graph so add source in destination and vice versa
            adjList[source].add(destination);
            adjList[destination].add(source);
        }
        public int sumEdges() {
            int sum=0;

            for(int i=0;i<vertex;i++){

            }
            return sum;
        }
    }
}
