package JTree;
public class TreeNode {
    private int data;
    private TreeNode leftNode, rightNode;
    private TreeNode parent;
    
    public TreeNode(int data) {
        this.data=data;
        this.leftNode=rightNode=null;
    }

    public TreeNode(int data, TreeNode parent){
        this.data = data;
        this.leftNode = null;
        this.rightNode = null;
        this.parent = parent;
    }
    
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
    
    public void insert(int x){
        if (x<data) {
            if (leftNode==null) {
                leftNode=new TreeNode(x);
            }
            else{
                leftNode.insert(x);
            }
        }
        else{
            if (rightNode==null) {
                rightNode=new TreeNode(x);
            }
            else{
                rightNode.insert(x);
            }
        }
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }
    
    
}
