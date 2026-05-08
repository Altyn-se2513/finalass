import java.util.*;

public class Graph {
    private Map<Integer, List<Integer>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addVertex(Vertex v) {
        adjList.putIfAbsent(v.getId(), new ArrayList<>());
    }

    public void addEdge(int from, int to) {
        adjList.putIfAbsent(from, new ArrayList<>());
        adjList.putIfAbsent(to, new ArrayList<>());

        adjList.get(from).add(to);
        adjList.get(to).add(from);
    }


    public void printGraph() {
        for (int key : adjList.keySet()) {
            System.out.print(key + ": ");
            for (int value : adjList.get(key)) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // BFS
    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        // Start traversal from the selected vertex
        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            // Visit all neighbors of the current vertex
            for (int neighbor : adjList.get(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }
    // DFS
    public void dfs(int vertex, Set<Integer> visited) {

        // Mark current vertex as visited
        visited.add(vertex);
        System.out.print(vertex + " ");

        // Recursively visit all unvisited neighbors
        for (int neighbor : adjList.get(vertex)) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, visited);
            }
        }
    }

}