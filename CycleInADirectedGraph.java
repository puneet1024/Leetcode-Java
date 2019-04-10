import java.util.LinkedList;
import java.util.List;

public class CycleInADirectedGraph {
    static class Graph{
        int vertex;
        List<Integer>[] adjacencyList;   //an array of LinkedList

        public Graph(int vertex){
            this.vertex = vertex;
            adjacencyList = new LinkedList[vertex];
            for(int i=0;i<vertex;i++){
                adjacencyList[i] = new LinkedList<>();
            }
        }

        public void addEdge(int source, int destination){

            //add forward edge
            adjacencyList[source].add(0,destination);

//            //add reverse edge
//            adjacencyList[destination].add(0,source);
        }
        public boolean isCycle() {
            boolean cycle = false;

            //maintain a visited array
            boolean[] visited = new boolean[vertex];

            //do DFS from each vertex
            for(int i=0;i<vertex;i++){
                if(!visited[i]){
                    if(helperCycle(i,visited,-1))
                        return true;
                }
            }
            return cycle;
        }

        private boolean helperCycle(int vertex, boolean[] visited, int parent){
            //add this vertex to visited

            visited[vertex] = true;

            //visit all neighbors except the direct parent
            for(int i=0;i<adjacencyList[vertex].size();i++){
                int currVertex = adjacencyList[vertex].get(i);
                if(currVertex != parent){
                    if(visited[currVertex])
                        return true;
                } else{
                    if(helperCycle(currVertex,visited,vertex))
                        return true;
                }
            }
            return false;
        }
    }
    public static void main(String[] args) {
        int vertices = 6;
        CycleInADirectedGraph.Graph graph = new CycleInADirectedGraph.Graph(vertices);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(2, 5);
        boolean result = graph.isCycle();
        System.out.println("is Cycle present: " + result);
    }
}
