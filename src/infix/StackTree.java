package infix;

public class StackTree {

    private ListTree stackListTree;

    public StackTree() {
        stackListTree = new ListTree("stack");
    }

    public void push(TreeNode data) {
        stackListTree.insertAtFront(data);
    }

    public TreeNode pop() {
        return stackListTree.removeFromFront();
    }

    public boolean isEmpty() {
        return stackListTree.isEmpty();
    }

    public void print() {
        stackListTree.print();
    }
}
