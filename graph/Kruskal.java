import java.util.*;

class Edge {
    int src, dest, weight;

    Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}

class Kruskal {

    // Find the parent of a vertex
    static int find(int[] parent, int vertex) {
        if (parent[vertex] == vertex)
            return vertex;

        return parent[vertex] = find(parent, parent[vertex]);
    }

    // Union two sets
    static void union(int[] parent, int[] rank, int u, int v) {
        int rootU = find(parent, u);
        int rootV = find(parent, v);

        if (rootU == rootV)
            return;

        if (rank[rootU] < rank[rootV]) {
            parent[rootU] = rootV;
        } else if (rank[rootU] > rank[rootV]) {
            parent[rootV] = rootU;
        } else {
            parent[rootV] = rootU;
            rank[rootU]++;
        }
    }

    static void kruskalMST(int V, ArrayList<Edge> edges) {

        // Sort edges by weight
        edges.sort(Comparator.comparingInt(e -> e.weight));

        int[] parent = new int[V];
        int[] rank = new int[V];

        // Initially, every vertex is its own parent
        for (int i = 0; i < V; i++) {
            parent[i] = i;
            rank[i] = 0;
        }

        int totalCost = 0;
        int edgesUsed = 0;

        System.out.println("Edges in Minimum Spanning Tree:");

        for (Edge edge : edges) {

            int rootU = find(parent, edge.src);
            int rootV = find(parent, edge.dest);

            // If roots are different, adding edge won't create a cycle
            if (rootU != rootV) {

                System.out.println(
                        edge.src + " -- " + edge.dest +
                                " = " + edge.weight);

                totalCost += edge.weight;
                edgesUsed++;

                union(parent, rank, rootU, rootV);

                // MST contains V - 1 edges
                if (edgesUsed == V - 1)
                    break;
            }
        }

        System.out.println("Minimum Cost = " + totalCost);
    }

    public static void main(String[] args) {

        int V = 4;

        ArrayList<Edge> edges = new ArrayList<>();

        edges.add(new Edge(0, 1, 1));
        edges.add(new Edge(0, 2, 4));
        edges.add(new Edge(1, 2, 2));
        edges.add(new Edge(1, 3, 5));
        edges.add(new Edge(2, 3, 3));

        kruskalMST(V, edges);
    }
}