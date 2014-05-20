/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DFS;

/**
 *
 * @author rai
 */
public class graph {

    private int maxVertex = 10;
    private vertex vertexList[];
    private int adjacencyMatrix[][];
    private int countvertex;

    public graph() {
        vertexList = new vertex[maxVertex];
        adjacencyMatrix = new int[maxVertex][maxVertex];
        countvertex = 0;
        for (int i = 0; i < vertexList.length; i++) {
            for (int j = 0; j < vertexList.length; j++) {
                adjacencyMatrix[i][j] = 0;
            }
        }
    }

    public void depthfirstsearch(){
        /* begin at vertex 0
         * int bantu;
         * stack stack=new stack();
         * stack.push(0);
         * while(!statck.isEmpty())
         * bantu=stack.pop();
         * if(vetexlist[bant].wasvisited==false{
         * sout(vertexlist[bantu].label+" ")
         * vertexlist[bantu].wasvisited=true;
         * }
         * for(int i=nVerts -1;i>=0;i--){
         * if(adjMaz[bantu][i]==1&&vertexlist[i].wasVisited==false){
         * stack.push(i);
         * }
         * }
         */
       
        
    }
    
    public void addVertex(String label) {
        vertexList[countvertex] = new vertex(label);
        countvertex++;
    }

    public void addEdge(String label1, String label2, int label3) {
        adjacencyMatrix[asearch(label1)][asearch(label2)] = label3;
        adjacencyMatrix[asearch(label2)][asearch(label1)] = label3;
    }

    public int asearch(String label) {
        for (int i = 0; i < maxVertex; i++) {
            if (label.compareTo(vertexList[i].getLabel()) == 0) {
                return i;
            }
        }
        return -1;
    }

    public void show() {
        for (int i = 0; i < countvertex; i++) {
            System.out.println("vertexs:" + vertexList[i].getLabel());
        }
        System.out.println("");
        for (int i = 0; i < countvertex; i++) {
            for (int j = 0; j < countvertex; j++) {
//                System.out.print(adjacencyMatrix[i][j] + " ");
                System.out.println(vertexList[i].getLabel() + " Terhubung dengan " + vertexList[j].getLabel() + " Dengan beban " + adjacencyMatrix[i][j]);
            }

            System.out.println(" ");
        }
    }

    public int getMaxVertex() {
        return maxVertex;
    }

    public void setMaxVertex(int maxVertex) {
        this.maxVertex = maxVertex;
    }

    public vertex[] getVertexList() {
        return vertexList;
    }

    public void setVertexList(vertex[] vertexList) {
        this.vertexList = vertexList;
    }

    public int[][] getAdjacencyMatrix() {
        return adjacencyMatrix;
    }

    public void setAdjacencyMatrix(int[][] adjacencyMatrix) {
        this.adjacencyMatrix = adjacencyMatrix;
    }

    public int getCountvertex() {
        return countvertex;
    }

    public void setCountvertex(int countvertex) {
        this.countvertex = countvertex;
    }

}
