package GRAPH2;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parta Adi Putra - 125314111
 */
public class GraphMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Graph g = new Graph();
        g.addVertex('A');
        g.addVertex('B');
        g.addVertex('C');
        g.addVertex('D');
        g.addVertex('E');
        g.addVertex('F');

        g.addEdge('A', 'B', 10);
        g.addEdge('A', 'F', 5);
        g.addEdge('B', 'C', 9);
        g.addEdge('B', 'E', 4);
        g.addEdge('B', 'F', 2);
        g.addEdge('C', 'F', 8);
        g.addEdge('E', 'F', 11);
        g.addEdge('C', 'E', 7);
        g.addEdge('E', 'D', 3);
        g.addEdge('C', 'D', 6);

        g.show();

        g.BFS();
    }
}
