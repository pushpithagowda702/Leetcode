import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Graph {
    int[][] matrix;
    List<List<Integer>> list;
    public Graph(int nodes) {
        matrix = new int[nodes][nodes];
        list = new ArrayList<>();
        for(int i=0; i<nodes; i++) {
            list.add(new ArrayList<>());
        }
    }

    public void adjMatrix(int[][] edges, boolean isDirected) {
        for(int i=0; i<edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            if(isDirected) {
                matrix[u][v] = 1;
            } else {
                matrix[u][v] = 1;
                matrix[v][u] = 1;
            }
        }
    }

    public void adjList(int[][] edges, boolean isDirected) {
        for(int i=0; i<edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            if(isDirected) {
                list.get(u).add(v);
            } else {
                list.get(u).add(v);
                list.get(v).add(u);
            }
        }
    }

    public void printList() {
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void printMatrix() {
        for(int i=0; i<matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(4);
        int[][] edges = {{0,2}, {0,1}, {1,3}};
        graph.adjMatrix(edges, false);
        graph.printMatrix();
        graph.adjList(edges, true);
        graph.printList();
    }
}
