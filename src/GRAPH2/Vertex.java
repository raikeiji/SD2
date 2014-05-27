package GRAPH2;

/*
Nama : ENGELBERTUS VIONE
NIM  : 125314112 
*/
public class Vertex {
    char label;
    boolean flagVisited;

    public Vertex() {
    }
    
    public Vertex (char label) {
        this.label = label;
        flagVisited = false;
    }

    public boolean isFlagVisited() {
        return flagVisited;
    }

    public void setFlagVisited(boolean flagVisited) {
        this.flagVisited = flagVisited;
    }

    public char getLabel() {
        return label;
    }

    public void setLabel(char label) {
        this.label = label;
    }
}
