import java.util.*;

public class Dijkstra {

    static class Edge {
        int to;
        int weight;

        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    static class Pair {
        int node;
        int distance;

        Pair(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }
    }

    static void dijkstra(int V, ArrayList<ArrayList<Edge>> graph, int source) {

        int[] dist = new int[V];

        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.distance - b.distance);

        dist[source] = 0;

        pq.add(new Pair(source, 0));

        while (!pq.isEmpty()) {

            Pair current = pq.poll();

            int node = current.node;
            int distance = current.distance;

            // Ignore outdated entry
            if (distance > dist[node]) {
                continue;
            }

            for (Edge edge : graph.get(node)) {

                int neighbor = edge.to;
                int weight = edge.weight;

                int newDistance = distance + weight;

                if (newDistance < dist[neighbor]) {

                    dist[neighbor] = newDistance;

                    pq.add(new Pair(neighbor, newDistance));
                }
            }
        }

        System.out.println("Shortest distances from source " + source + ":");

        for (int i = 0; i < V; i++) {
            System.out.println(i + " -> " + dist[i]);
        }
    }

    public static void main(String[] args) {

        int V = 5;

        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges
        graph.get(0).add(new Edge(1, 4));
        graph.get(0).add(new Edge(2, 1));

        graph.get(2).add(new Edge(1, 2));
        graph.get(2).add(new Edge(3, 4));

        graph.get(1).add(new Edge(3, 1));

        graph.get(3).add(new Edge(4, 3));

        dijkstra(V, graph, 0);
    }
}