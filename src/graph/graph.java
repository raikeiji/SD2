package graph;

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
        for (int i = 0; i < countvertex; i++) {
            for (int j = 0; j < countvertex; j++) {
                System.out.println(vertexList[i].getLabel() + " Terhubung dengan "
              + vertexList[j].getLabel() + " Dengan beban " + adjacencyMatrix[i][j]);
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

    public void dfs() {
        Stack st = new Stack();
        int bantu;
        st.push(0);
        while (!st.isEmpty()) {
            bantu = st.pop();
            if (vertexList[bantu].flagVisited == false) {
                System.out.print(vertexList[bantu].label + " ");
                vertexList[bantu].flagVisited = true;
            }
            for (int i = countvertex - 1; i > 0; i--) {
                if (adjacencyMatrix[bantu][i] >= 1 && vertexList[i].flagVisited == false) {
                    st.push(i);
                }
            }
        }
    }
}
