import java.util.*;

public class B8 {
    public static void main(String[] args) {

        
        ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= 9; i++) {
            graph.add(new ArrayList<>());
        }

        
        graph.get(8).add(2);
        graph.get(8).add(3);

        graph.get(3).add(1);

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[10];

        int source = 8;

        q.add(source);
        visited[source] = true;

        System.out.print("BFS Traversal: ");

        while (!q.isEmpty()) {
            int node = q.remove();

            System.out.print(node + " ");

            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
    }
}