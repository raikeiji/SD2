package graph;

public class vertex {

    String label;
    boolean flagVisited;

    public vertex() {
    }

    public vertex(String label) {
        this.label = label;
        flagVisited = false;
    }

    public boolean isFlagVisited() {
        return flagVisited;
    }

    public void setFlagVisited(boolean flagVisited) {
        this.flagVisited = flagVisited;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
