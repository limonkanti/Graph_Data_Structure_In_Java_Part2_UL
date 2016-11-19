package graph_datastructure;

import java.util.Enumeration;
import java.util.Set;
import javafx.scene.DepthTest;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.*;
import org.jgrapht.traverse.BreadthFirstIterator;
import org.jgrapht.traverse.GraphIterator;

public class GraphBFS {

    public static void main(String[] args)
    {
        DirectedGraph<Integer, DefaultEdge> graph= new DefaultDirectedGraph<Integer, DefaultEdge>(DefaultEdge.class);
        graph.addVertex(40);
        graph.addVertex(10);
        graph.addVertex(20);
        graph.addVertex(30);
        graph.addVertex(60);
        graph.addVertex(50);
        graph.addVertex(70);

        graph.addEdge(40, 20);
        graph.addEdge(40, 10);
        graph.addEdge(10, 30);

        graph.addEdge(20, 10);
        graph.addEdge(20, 30);
        graph.addEdge(20, 60);
        graph.addEdge(20, 50);
        graph.addEdge(50, 70);
        /* Set<DefaultEdge> edges = graph.edgeSet();
         for (DefaultEdge e : edges) {
         System.out.println(e);     
         }

         boolean search=graph.containsVertex(40);
         System.out.println(search);
         boolean remove=graph.removeVertex(10);
        
         System.out.println(graph);*/
        GraphIterator<Integer, DefaultEdge> iterator= new BreadthFirstIterator<Integer, DefaultEdge>(graph);
        while (iterator.hasNext()) 
        {
            
            System.out.println(iterator.next());
        }

    }

}
