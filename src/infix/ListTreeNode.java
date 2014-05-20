package infix;

public class ListTreeNode {

    TreeNode data;
    ListTreeNode nextNode;

    ListTreeNode(TreeNode treeNode) {
        this(treeNode, null);
    }

    ListTreeNode(TreeNode treeNode, ListTreeNode node) {
        data = treeNode;
        nextNode = node;
    }

    public TreeNode getTreeNode() {
        return data;
    }

    public ListTreeNode getNext() {
        return nextNode;
    }
}
