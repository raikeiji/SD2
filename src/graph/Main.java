/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graph;

/**
 *
 * @author rai
 */
public class Main {
    public static void main(String[] args) {
        graph g=new graph();
        g.addVertex("A");
        g.addVertex("B");
        g.addVertex("C");
        g.addVertex("D");
        g.addVertex("E");
        
        g.addEdge("A", "B",4);
        g.addEdge("B", "C",5);
        g.addEdge("C", "A",6);
        g.addEdge("A", "D",3);
        g.addEdge("A", "C",2);
        //BERIKUT MERUPAKAN CARA KERJA TRANVERSAL PADA GRAPH
        int isi[][]=g.getAdjacencyMatrix();
        
        for (int i = 0; i < g.getCountvertex(); i++) {
            for (int j = 0; j < g.getCountvertex(); j++) {
                System.out.print(isi[i][j]+" ");
            }
            System.out.println("\n");
        }
        
        g.show();
    }
}
