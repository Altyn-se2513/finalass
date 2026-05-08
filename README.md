# Assignment 4: Graph Traversal and Representation System

## Project Overview
This project implements a graph-based system using Java. It represents a graph structure using an **Adjacency List** and compares the behavior and performance of two fundamental traversal algorithms:
*   **Breadth-First Search (BFS):** Explores neighbors level-by-level.
*   **Depth-First Search (DFS):** Explores as far as possible along each branch before backtracking.

## Class Descriptions
*   **Vertex:** Represents a node with a unique ID.
*   **Edge:** Represents a connection between a source and a destination vertex.
*   **Graph:** Manages the structure using a `Map<Integer, List<Integer>>` (Adjacency List).
*   **Experiment:** Handles automated testing and time measurement for different graph scales.

## Algorithm Descriptions
### Breadth-First Search (BFS)
* Logic: Uses a Queue to visit vertices in layers.
* Steps:
  1. Start from the selected vertex
  2. Add the vertex to the queue
  3. Mark the vertex as visited
  4. Remove a vertex from the queue
  5. Visit all unvisited neighbors
  6. Add neighbors to the queue
  7. Repeat until the queue becomes empty
* Complexity: O(V + E), where V is vertices and E is edges.
* Use Case: Finding the shortest path in unweighted graphs.

### Depth-First Search (DFS)
* Logic: Uses recursion (system stack) to visit nodes deeply.
* Steps:
  1. Start from the selected vertex
  2. Mark the vertex as visited
  3. Visit the current vertex
  4. Move recursively to an unvisited neighbor
  5. Continue until all vertices are visited
  6. Backtrack when no unvisited neighbors remain
* Complexity: O(V + E)
* Use Case: Topological sorting, detecting cycles, and solving puzzles.


## Experimental Results

=======
| Graph Size        |  BFS Time (ns) | DFS Time (ns) | Faster Algorithm |
|-------------------|----------------:|--------------:|-----------------:|
| Small (10 nodes)  |         2727600 |        710000 |              DFS |
| Medium (30 nodes) |         1856500 |       1567900 |              DFS |
| Large (100 nodes) |         3491200 |       5282800 |              BFS |

### Analysis (Part 2)
1.  **Effect of Size:** As the number of vertices increases, execution time grows linearly, which matches $O(V+E)$.
2.  **Performance:** In my experiment, DFS was faster for smaller graphs due to less overhead, while BFS showed better performance in larger graphs
3.  **Traversal Order:** BFS produced a "wider" search order, while DFS followed a linear path (0-1-2-3...).
4.  **Preference:** BFS is preferred for shortest paths; DFS is preferred when memory is limited or we need to visit every node deeply.
5.  **DFS Limitations:** Can lead to `StackOverflowError` on extremely deep graphs due to recursion limits.

## Screenshots

![Screenshot 1](docs/screenshots/img.png)
![Screenshot 2](docs/screenshots/img_1.png)
![Screenshot 3](docs/screenshots/img_2.png)
<<<<<<< HEAD
![Screenshot 4](docs/screenshots/img_3.png)
=======
![Screenshot 4](docs/screenshots/img_3.png)

## Reflection: During this assignment, I learned how graphs can be represented using an adjacency list. I understood that a graph consists of vertices and edges, and that each vertex can store a list of its neighboring vertices. This helped me understand why an adjacency list is useful for graph traversal. I also learned the difference between BFS and DFS. BFS uses a queue and visits vertices level by level, while DFS uses recursion and explores one path deeply before backtracking. One challenge I faced was organizing Java classes correctly and making sure each public class was placed in its own file.
