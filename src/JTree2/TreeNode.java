package JTree2;

public class TreeNode {

    private int data;
    private TreeNode leftNode;
    private TreeNode rightNode;
    private TreeNode parent;

    public TreeNode() {
    }

    public TreeNode(int data) {
        this.data = data;
        this.leftNode = null;
        this.rightNode = null;
    }

    public TreeNode(int data, TreeNode parent){
        this.data = data;
        this.leftNode = null;
        this.rightNode = null;
        this.parent = parent;
    }
    
    public void insert(int key){
        if(key < data){
            if(leftNode == null){
                leftNode = new TreeNode(key,this);
            }else{
                leftNode.insert(key);
            }
        }else{
            if(rightNode == null){
                rightNode = new TreeNode(key,this);
            }else{
                rightNode.insert(key);
            }
        }
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

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }
    
    
}
