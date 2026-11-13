import java.util.Arrays;

public class DijkstraAlgorithm {

    static final int INF = 999999;

    static int minDistance(int[] distance, boolean[] visited) {
        int min = INF;
        int minIndex = -1;

        for (int i = 0; i < distance.length; i++) {
            if (!visited[i] && distance[i] < min) {
                min = distance[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    static void dijkstra(int[][] graph, int source) {
        int vertices = graph.length;
        int[] distance = new int[vertices];
        boolean[] visited = new boolean[vertices];

        Arrays.fill(distance, INF);
        distance[source] = 0;

        for (int count = 0; count < vertices - 1; count++) {
            int u = minDistance(distance, visited);

            if (u == -1) {
                break;
            }

            visited[u] = true;

            for (int v = 0; v < vertices; v++) {
                if (!visited[v] && graph[u][v] > 0 &&
                    distance[u] != INF &&
                    distance[u] + graph[u][v] < distance[v]) {

                    distance[v] = distance[u] + graph[u][v];
                }
            }
        }

        System.out.println("Shortest distances from source vertex " + source + ":");

        for (int i = 0; i < vertices; i++) {
            System.out.println("Vertex " + i + ": " +
                (distance[i] == INF ? "Unreachable" : distance[i]));
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 4, 2, 0, 0},
            {4, 0, 1, 5, 0},
            {2, 1, 0, 8, 10},
            {0, 5, 8, 0, 2},
            {0, 0, 10, 2, 0}
        };

        dijkstra(graph, 0);
    }
}
