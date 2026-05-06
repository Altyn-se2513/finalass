# Assignment 3: Graphs, BFS, and DFS Performance Analysis

## Project Description
This project implements a Graph data structure using an **Adjacency List**. It includes implementations of two primary traversal algorithms:
*   **BFS (Breadth-First Search)**
*   **DFS (Depth-First Search)**

The goal of the project is to measure and compare the execution time of these algorithms on graphs of various sizes.

## Repository Structure
*   `src/` — Contains all Java source files:
    *   `Vertex.java` — Model for graph vertices.
    *   `Edge.java` — Model for connections between vertices.
    *   `Graph.java` — Main logic for graph construction and traversals.
    *   `Experiment.java` — Logic for performance measurement.
    *   `Main.java` — Application entry point.
*   `docs/screenshots/` — Contains execution result images.

## Experimental Results
Based on the tests conducted, the execution times (in nanoseconds) are as follows:


| Graph Size | BFS Time (ns) | DFS Time (ns) | Winner |
| :--- | :--- | :--- | :--- |
| **Small** (10 nodes) | 2,727,600 | 710,000 | **DFS** |
| **Medium** (30 nodes) | 1,856,500 | 1,567,900 | **DFS** |
| **Large** (100 nodes) | 3,491,200 | 5,282,800 | **BFS** |

## Conclusion
*   For **small and medium** graphs, **DFS** performed faster. This is due to lower overhead compared to BFS, which requires managing a queue.
*   For **large** graphs (100+ nodes), **BFS** showed better efficiency in this implementation.
*   **BFS** is generally better for finding the shortest path in unweighted graphs, while **DFS** is more memory-efficient for deep graphs.

## Execution Screenshot
![Execution Result](docs/screenshots/img.png)
