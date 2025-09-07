import java.util.*;

class Edge implements Comparable<Edge> {
    int dest, weight;

    public Edge(int dest, int weight) {
        this.dest = dest;
        this.weight = weight;
    }

    public int compareTo(Edge other) {
        return this.weight - other.weight; // Sort by weight in ascending order
    }
}

public class PrimsAlgo {
    static int primMST(List<List<Edge>> graph, int V) {
        PriorityQueue<Edge> minHeap = new PriorityQueue<>();
        boolean[] visited = new boolean[V];
        int totalWeight = 0;

        // Start from node 0
        minHeap.add(new Edge(0, 0));

        while (!minHeap.isEmpty()) {
            Edge edge = minHeap.poll();
            int u = edge.dest;

            // Skip if already visited
            if (visited[u]) continue;

            // Mark as visited
            visited[u] = true;
            totalWeight += edge.weight;

            // Add all adjacent edges
            for (Edge adjEdge : graph.get(u)) {
                if (!visited[adjEdge.dest]) {
                    minHeap.add(adjEdge);
                }
            }
        }

        return totalWeight;
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices
        List<List<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // Adding edges (Undirected graph)
        addEdge(graph, 0, 1, 2);
        addEdge(graph, 0, 3, 6);
        addEdge(graph, 1, 2, 3);
        addEdge(graph, 1, 3, 8);
        addEdge(graph, 1, 4, 5);
        addEdge(graph, 2, 4, 7);
        addEdge(graph, 3, 4, 9);

        int mstWeight = primMST(graph, V);
        System.out.println("Minimum Spanning Tree Weight: " + mstWeight);
    }

    static void addEdge(List<List<Edge>> graph, int u, int v, int weight) {
        graph.get(u).add(new Edge(v, weight));
        graph.get(v).add(new Edge(u, weight)); // Undirected graph
    }
}
