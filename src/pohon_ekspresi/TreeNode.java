package pohon_ekspresi;

import JTree2.*;

public class TreeNode {

    private char data;
    private TreeNode leftNode;
    private TreeNode rightNode;
    private TreeNode parent;

    public TreeNode() {
    }

    public TreeNode(char data) {
        this.data = data;
        this.leftNode = null;
        this.rightNode = null;
    }

    public TreeNode(char data, TreeNode parent){
        this.data = data;
        this.leftNode = null;
        this.rightNode = null;
        this.parent = parent;
    }

    public TreeNode(char data, TreeNode leftNode, TreeNode rightNode) {
        this.data = data;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        
    }
    
    public void insert(char key){
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
    
    public char getData() {
        return data;
    }

    public void setData(char data) {
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
