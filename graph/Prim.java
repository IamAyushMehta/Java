import java.util.*;

class Edge {
    int node;
    int weight;

    Edge(int node, int weight) {
        this.node = node;
        this.weight = weight;
    }
}

public class Prim {

    public static int primMST(int V, ArrayList<ArrayList<Edge>> graph) {

        boolean[] visited = new boolean[V];

        PriorityQueue<Edge> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);

        // Start from vertex 0
        pq.add(new Edge(0, 0));

        int mstWeight = 0;

        while (!pq.isEmpty()) {

            Edge current = pq.poll();

            int node = current.node;
            int weight = current.weight;

            // Ignore already visited nodes
            if (visited[node]) {
                continue;
            }

            // Add node to MST
            visited[node] = true;

            // Add edge weight
            mstWeight += weight;

            // Add adjacent edges
            for (Edge edge : graph.get(node)) {

                if (!visited[edge.node]) {
                    pq.add(edge);
                }
            }
        }

        return mstWeight;
    }

    public static void main(String[] args) {

        int V = 4;

        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // A = 0, B = 1, C = 2, D = 3

        addEdge(graph, 0, 1, 4);
        addEdge(graph, 0, 2, 2);
        addEdge(graph, 0, 3, 5);
        addEdge(graph, 1, 3, 3);
        addEdge(graph, 2, 3, 1);

        System.out.println("Minimum MST Weight = "
                + primMST(V, graph));
    }

    static void addEdge(
            ArrayList<ArrayList<Edge>> graph,
            int u,
            int v,
            int weight) {

        graph.get(u).add(new Edge(v, weight));
        graph.get(v).add(new Edge(u, weight));
    }
}
