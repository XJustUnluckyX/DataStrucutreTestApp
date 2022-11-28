package graphgenerator;
import com.ibm.wala.util.graph.Graph;
import com.ibm.wala.util.graph.impl.BasicGraph;
import com.ibm.wala.util.graph.traverse.DFS;

import java.util.Iterator;

public class GraphGenerator {

    public GraphGenerator() {
        this.graph = new BasicGraph<>();
    }

    public void addN(Node n){

        graph.addNode(n);

    }

    public void addE(Node src, Node dst){

        graph.addEdge(src, dst);

    }

    public Graph<Node> getGraph() {
        return graph;
    }


    public boolean is_empty(){

        return graph.getNumberOfNodes() == 0;
    }

    public Node getLastNode(){

        Iterator<Node> iterator = DFS.iterateFinishTime(graph);

        return iterator.next();
    }

    @Override
    public String toString() {

        String out = "GraphGenerator{" +
                "graph=";

        for (Node e: graph) {

            out += e.toString();

            Iterator<Node> iterator = graph.getSuccNodes(e);

            out+= "EdgesOut[ ";

            while(iterator.hasNext()){

                out+= iterator.next().toString() + ", ";
            }

            out+= "]+\n";
        }

         out = out + '}';

        return out;
    }

    private final Graph<Node> graph;

}
