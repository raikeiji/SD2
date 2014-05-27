package graph;

public class Main {

    public static void main(String[] args) {
        graph g = new graph();
        g.addVertex("A");
        g.addVertex("B");
        g.addVertex("C");
        g.addVertex("D");
        g.addVertex("E");
        g.addVertex("F");

        g.addEdge("A", "B", 10);
        g.addEdge("A", "F", 5);
        g.addEdge("B", "C", 9);
        g.addEdge("B", "E", 4);
        g.addEdge("B", "F", 2);
        g.addEdge("C", "F", 8);
        g.addEdge("E", "F", 11);
        g.addEdge("C", "E", 7);
        g.addEdge("E", "D", 3);
        g.addEdge("C", "D", 6);
        //BERIKUT MERUPAKAN CARA KERJA TRANVERSAL PADA GRAPH
        int isi[][] = g.getAdjacencyMatrix();

        for (int i = 0; i < g.getCountvertex(); i++) {
            for (int j = 0; j < g.getCountvertex(); j++) {
                System.out.print(isi[i][j] + " ");
            }
            System.out.println("\n");
        }
        g.show();
        g.dfs();
    }
}
