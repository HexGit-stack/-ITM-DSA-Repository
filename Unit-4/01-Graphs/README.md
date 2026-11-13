# Graphs

## Definition
A Graph is a non-linear data structure consisting of vertices (nodes) and edges (connections). Graphs are used to represent relationships between different objects.

## Basic Terminology
- **Vertex:** An individual node in a graph.
- **Edge:** A connection between two vertices.
- **Directed Graph:** A graph in which edges have a specific direction.
- **Undirected Graph:** A graph in which edges have no direction.
- **Weighted Graph:** A graph in which edges have associated weights.
- **Degree:** Number of edges connected to a vertex.
- **Path:** A sequence of connected vertices.
- **Cycle:** A path that starts and ends at the same vertex.
- **DAG:** A Directed Acyclic Graph is a directed graph with no cycles.

## Graph Representation
1. Adjacency Matrix
2. Adjacency List

## Graph Traversal
1. **BFS (Breadth-First Search):** Visits vertices level by level using a queue.
2. **DFS (Depth-First Search):** Explores as far as possible along a path before backtracking.

## Java Program
GraphImplementation.java

## Sample Output

Adjacency Matrix:
0 1 1 0
1 0 0 1
1 0 0 1
0 1 1 0

BFS Traversal: 0 1 2 3
DFS Traversal: 0 1 3 2


## Time Complexity

| Operation | Time Complexity |
|---|---|
| Adjacency Matrix Creation | O(V²) |
| BFS | O(V²) |
| DFS | O(V²) |

## Language
Java

## Difficulty
Beginner

---
Part of the ITM DSA Repository.
