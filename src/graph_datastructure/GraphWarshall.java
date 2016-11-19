
package graph_datastructure;

import java.util.List;
import org.jgrapht.DirectedGraph;
import org.jgrapht.alg.*;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;


public class GraphWarshall 
{
    public static void main(String[] args) {
        DirectedGraph<Integer, DefaultEdge> graph = new DefaultDirectedGraph<>(DefaultEdge.class);

        graph.addVertex(7);
        graph.addVertex(4);
        graph.addVertex(-9);
        graph.addVertex(3);
        graph.addVertex(2);
        graph.addVertex(5);
      //  System.out.println("Search verteics:\t" + graph.containsVertex(7));

        graph.addEdge(7, 4);
        graph.addEdge(7, -9);
        graph.addEdge(-9, 3);
        graph.addEdge(3, 2);
        graph.addEdge(3, 5);
        // System.out.println(graph.getAllEdges(7, 2));
   //     List<DefaultEdge> path = DijkstraShortestPath.findPathBetween(graph, 7, 2);
      //  System.out.println(path); // prints [(7 : 9), (9 : 3), (3 : 2)]
  //      List<DefaultEdge> path1 = BellmanFordShortestPath.findPathBetween(graph, 7, 2);
  //      System.out.println(path1); // prints [(7 : 9), (9 : 3), (3 : 2)]

    // List<DefaultEdge> bellmanford =FloydWarshallShortestPaths.class
       //  System.out.println(bellmanford);
     

    }
    
}
