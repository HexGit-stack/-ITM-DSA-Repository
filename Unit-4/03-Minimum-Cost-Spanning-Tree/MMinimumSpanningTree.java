import java.util.Arrays;

class Edge implements Comparable<Edge> {
    int source;
    int destination;
    int weight;

    Edge(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public int compareTo(Edge other) {
        return this.weight - other.weight;
    }
}

public class MinimumSpanningTree {

    static int find(int[] parent, int vertex) {
        if (parent[vertex] != vertex) {
            parent[vertex] = find(parent, parent[vertex]);
        }
        return parent[vertex];
    }

    static void union(int[] parent, int[] rank, int x, int y) {
        int rootX = find(parent, x);
        int rootY = find(parent, y);

        if (rootX == rootY) {
            return;
        }

        if (rank[rootX] < rank[rootY]) {
            parent[rootX] = rootY;
        } else if (rank[rootX] > rank[rootY]) {
            parent[rootY] = rootX;
        } else {
            parent[rootY] = rootX;
            rank[rootX]++;
        }
    }

    static void kruskal(int vertices, Edge[] edges) {
        Arrays.sort(edges);

        int[] parent = new int[vertices];
        int[] rank = new int[vertices];

        for (int i = 0; i < vertices; i++) {
            parent[i] = i;
        }

        int cost = 0;
        int count = 0;

        System.out.println("Kruskal's Algorithm:");
        System.out.println("Selected Edges:");

        for (Edge edge : edges) {
            int x = find(parent, edge.source);
            int y = find(parent, edge.destination);

            if (x != y) {
                union(parent, rank, x, y);
                System.out.println(edge.source + " - " +
                    edge.destination + " : " + edge.weight);

                cost += edge.weight;
                count++;

                if (count == vertices - 1) {
                    break;
                }
            }
        }

        if (count != vertices - 1) {
            System.out.println("Minimum Spanning Tree does not exist");
        } else {
            System.out.println("Minimum Cost: " + cost);
        }
    }

    static void prim(int[][] graph) {
        int vertices = graph.length;
        int[] key = new int[vertices];
        boolean[] visited = new boolean[vertices];

        Arrays.fill(key, Integer.MAX_VALUE);
        key[0] = 0;

        int cost = 0;

        for (int count = 0; count < vertices; count++) {
            int min = Integer.MAX_VALUE;
            int u = -1;

            for (int i = 0; i < vertices; i++) {
                if (!visited[i] && key[i] < min) {
                    min = key[i];
                    u = i;
                }
            }

            if (u == -1) {
                System.out.println("Minimum Spanning Tree does not exist");
                return;
            }

            visited[u] = true;
            cost += key[u];

            for (int v = 0; v < vertices; v++) {
                if (graph[u][v] > 0 && !visited[v] &&
                    graph[u][v] < key[v]) {
                    key[v] = graph[u][v];
                }
            }
        }

        System.out.println("Prim's Algorithm:");
        System.out.println("Minimum Cost: " + cost);
    }

    public static void main(String[] args) {
        int vertices = 5;

        Edge[] edges = {
            new Edge(0, 1, 2),
            new Edge(0, 3, 6),
            new Edge(1, 2, 3),
            new Edge(1, 3, 8),
            new Edge(1, 4, 5),
            new Edge(2, 4, 7),
            new Edge(3, 4, 6)
        };

        int[][] graph = {
            {0, 2, 0, 6, 0},
            {2, 0, 3, 8, 5},
            {0, 3, 0, 0, 7},
            {6, 8, 0, 0, 6},
            {0, 5, 7, 6, 0}
        };

        kruskal(vertices, edges);
        System.out.println();
        prim(graph);
    }
}
