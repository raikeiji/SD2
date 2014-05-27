package GRAPH2;

/*
Nama : ENGELBERTUS VIONE
NIM  : 125314112 
*/
public class Graph {

    private int maxVertex = 10;
    private Vertex[] vertexList;
    private int[][] adjacencyMatrix;
    private int countVertex = 0;

    public Graph() {
        vertexList = new Vertex[maxVertex];
        adjacencyMatrix = new int[maxVertex][maxVertex];
        for (int i = 0; i < maxVertex; i++) {
            for (int j = 0; j < maxVertex; j++) {
                adjacencyMatrix[i][j] = 0;
            }
        }
    }

    public void addVertex(char lab) {
        vertexList[countVertex] = new Vertex(lab);
        countVertex++;
    }

    public void addEdge(int start, int end, int c) {
        adjacencyMatrix[start][end] = 1;
        adjacencyMatrix[end][start] = 1;
    }

    public void addEdge(char start, char end, int c) {
        adjacencyMatrix[indexVertex(start)][indexVertex(end)] = c;
        adjacencyMatrix[indexVertex(end)][indexVertex(start)] = c;
    }

    private int indexVertex(char label) {
        for (int i = 0; i < vertexList.length; i++) {
            if (vertexList[i].getLabel() == label) {
                return i;
            }
        }
        return -1;
    }

    public void show() {
        for (int i = 0; i < countVertex; i++) {
            System.out.println("Vertek : " + vertexList[i].getLabel());
        }

        System.out.println("");

        for (int i = 0; i < countVertex; i++) {
            for (int j = 0; j < countVertex; j++) {
                System.out.println(vertexList[i].getLabel()
                        + " terhubung ke " + vertexList[j].getLabel()
                        + " dengan beban " + adjacencyMatrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void dfs() {
        Stack st = new Stack();
        int bantu;
        st.push(0);
        while (!st.isEmpty()) {
            bantu = st.pop();
            if (vertexList[bantu].flagVisited == false) {
                System.out.println(vertexList[bantu].label + " ");
                vertexList[bantu].flagVisited = true;
            }
            for (int i = countVertex - 1; i > 0; i--) {
                if (adjacencyMatrix[bantu][i] >= 1 && vertexList[i].flagVisited == false) {
                    st.push(i);
                }
            }
        }
    }

    public void BFS() {
        int bantu;
        Queue q = new Queue();
        q.enqueue(0);
        while (!q.isEmpty()) {
            bantu = q.dequeue();
            if (vertexList[bantu].isFlagVisited() == false) {
                System.out.print(vertexList[bantu].getLabel() + " ");
                vertexList[bantu].setFlagVisited(true);
            }
            for (int i = 0; i < countVertex; i++) {
                if ((adjacencyMatrix[bantu][i] >= 1) && (vertexList[i].flagVisited == false)) {
                    q.enqueue(i);
                }
            }
        }
    }

    public int[][] getAdjacencyMatrix() {
        return adjacencyMatrix;
    }

    public int getCountVertex() {
        return countVertex;
    }
    
    
}
