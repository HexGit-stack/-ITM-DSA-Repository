# Minimum Cost Spanning Tree

## Definition
A Minimum Spanning Tree (MST) is a spanning tree of a connected, undirected, weighted graph that connects all vertices with the minimum possible total edge weight without forming cycles.

## Algorithms

### 1. Kruskal's Algorithm
- Sorts all edges by increasing weight.
- Selects the smallest edge that does not form a cycle.
- Continues until all vertices are connected.

### 2. Prim's Algorithm
- Starts from a selected vertex.
- Repeatedly selects the minimum-weight edge connecting the current tree to an unvisited vertex.
- Continues until all vertices are included.

## Java Program
MinimumSpanningTree.java

## Sample Output

Kruskal's Algorithm:
Selected Edges:
0 - 1 : 2
1 - 2 : 3
1 - 4 : 5
3 - 4 : 6
Minimum Cost: 16

Prim's Algorithm:
Minimum Cost: 16


## Time Complexity

| Algorithm | Time Complexity |
|---|---|
| Kruskal's Algorithm | O(E log E) |
| Prim's Algorithm (Adjacency Matrix) | O(V²) |

## Language
Java

## Difficulty
Intermediate

---
Part of the ITM DSA Repository.
