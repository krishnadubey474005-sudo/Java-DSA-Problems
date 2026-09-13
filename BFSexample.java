
    import java.util.*;

public class BFSexample {

    public static void bfs(ArrayList<ArrayList<Integer>> graph, int start) {

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[graph.size()];

        
        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {

            int current = queue.remove(); 
            System.out.print(current + " ");

        
            for (int neighbor : graph.get(current)) {

                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(MyString[] args) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            graph.add(new ArrayList<>());
        }

        
        graph.get(0).add(1);
        graph.get(0).add(2);

        graph.get(1).add(0);
        graph.get(1).add(3);
        graph.get(1).add(4);

        graph.get(2).add(0);

        graph.get(3).add(1);

        graph.get(4).add(1);

        bfs(graph, 0);
    }
}

