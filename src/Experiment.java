public class Experiment {

    public void runTraversals(Graph g, int start, boolean printOrder) {

        // BFS
        long startTime = System.nanoTime();
        if (printOrder) {
            System.out.print("BFS: ");
            g.bfs(start);
            System.out.println();
        } else {
            g.bfs(start);
        }
        long endTime = System.nanoTime();
        System.out.println("BFS time: " + (endTime - startTime) + " ns");

        // DFS
        startTime = System.nanoTime();
        if (printOrder) {
            System.out.print("DFS: ");
            g.dfs(start);
            System.out.println();
        } else {
            g.dfs(start);
        }
        endTime = System.nanoTime();
        System.out.println("DFS time: " + (endTime - startTime) + " ns");
    }
}