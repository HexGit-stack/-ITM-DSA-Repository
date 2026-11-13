# Shortest Path Algorithms

## Definition
A Shortest Path Algorithm is used to find the minimum-cost path between vertices in a graph. It is useful in navigation systems, network routing and transportation planning.

## Dijkstra's Algorithm
Dijkstra's Algorithm finds the shortest distance from a source vertex to all other vertices in a weighted graph with non-negative edge weights.

## Working Steps
1. Select a source vertex.
2. Set its distance to zero and all other distances to infinity.
3. Select the unvisited vertex with the smallest known distance.
4. Update the distances of its adjacent vertices if a shorter path is found.
5. Repeat until all reachable vertices have been processed.

## Java Program
DijkstraAlgorithm.java

## Sample Output

Shortest distances from source vertex 0:
Vertex 0: 0
Vertex 1: 4
Vertex 2: 3
Vertex 3: 6
Vertex 4: 7


## Time Complexity
| Implementation | Time Complexity |
|---|---|
| Adjacency Matrix | O(V²) |
| Priority Queue with Adjacency List | O((V + E) log V) |

## Language
Java

## Difficulty
Intermediate

---
Part of the ITM DSA Repository.
