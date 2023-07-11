import java.util.*;

public class Main {
    public static void main(String arg[]) {
        int V = 5;
        int source = 0;
        List<List<Node>> adj = new ArrayList<List<Node>>();

        // Initialize list for every node
        for (int i = 0; i < V; i++) {
            List<Node> item = new ArrayList<Node>();
            adj.add(item);
        }

        adj.get(0).add(new Node(1, 9));
        adj.get(0).add(new Node(2, 6));
        adj.get(0).add(new Node(3, 5));
        adj.get(0).add(new Node(4, 3));

        adj.get(2).add(new Node(1, 2));
        adj.get(2).add(new Node(3, 4));

        adj.get(3).add(new Node(4, 2));

        adj.get(4).add(new Node(2, 1));

        Dijkstra dpq = new Dijkstra(V);
        dpq.dijkstra(adj, source);

        System.out.println("The shorted path from node :");
        for (int i = 0; i < dpq.dist.length; i++)
            System.out.println(source + " to " + i + " is " + dpq.dist[i]);
    }
}