package graph_datastructure;

import java.util.Set;
import org.jgrapht.*;
import org.jgrapht.graph.*;

public class GraphRepresentation {

    public static void main(String[] args) {
        DirectedGraph<Integer, DefaultEdge> graph = new DefaultDirectedGraph<Integer, DefaultEdge>(DefaultEdge.class);
        System.out.println("Insert operation.\n");
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        Set<DefaultEdge> set = graph.edgeSet();
        for (DefaultEdge e : set) {
            System.out.println(e);
        }
        System.out.println("Search operation\t"+graph.containsEdge(0, 1));
        System.out.println("Remove operation\t"+graph.removeEdge(0, 1));
        System.out.println("After Delete.\n");
        System.out.println(graph);
        
        

    }

}
