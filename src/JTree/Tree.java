/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JTree;

/**
 *
 * @author rai
 */
public class Tree {
    
    private TreeNode root;
    
    private TreeNode Succescor, Predeccesor;
    
    public Tree() {
    }
    
    public Tree(TreeNode root) {
        this.root = root;
    }
    
    public TreeNode getRoot() {
        return root;
    }
    
    public void setRoot(TreeNode root) {
        this.root = root;
    }
    
    public void preOrderHelper(TreeNode localroot) {
        if (localroot != null) {
            System.out.print(localroot.getData() + " ");
            preOrderHelper(localroot.getLeftNode());
            preOrderHelper(localroot.getRightNode());
        }
    }
    
    public void inOrderHelper(TreeNode localroot) {
        if (localroot != null) {
            inOrderHelper(localroot.getLeftNode());
            System.out.print(localroot.getData() + " ");
            inOrderHelper(localroot.getRightNode());
        }
    }
    
    public void postOrderHelper(TreeNode localroot) {
        if (localroot != null) {
            postOrderHelper(localroot.getLeftNode());
            postOrderHelper(localroot.getRightNode());
            System.out.print(localroot.getData() + " ");
        }
    }
    
    public void preOrderTraversal() {
        preOrderHelper(root);
    }
    
    public void inOrderTraversal() {
        inOrderHelper(root);
    }
    
    public void postOrderTraversal() {
        postOrderHelper(root);
    }
    
    public TreeNode find(int x) {
        TreeNode bantu;
        bantu = root;
        while (bantu != null) {
            if (bantu.getData() == x) {
                return bantu;
            } else {
                if (bantu.getData() > x) {
                    bantu = bantu.getLeftNode();
                } else {
                    bantu = bantu.getRightNode();
                }
            }
        }
        return null;
    }
    
    public void add(int x) {
        if (root == null) {
            root = new TreeNode(x);
        } else {
            root.insert(x);
        }
    }

    public TreeNode getSuccescor() {
        return Succescor;
    }

    public void setSuccescor(TreeNode Succescor) {
        Succescor=Succescor.getRightNode();
        while(Succescor.getLeftNode()!=null){
            Succescor=Succescor.getLeftNode();
        }
    }

    public TreeNode getPredeccesor() {
        return Predeccesor;
    }

    public void setPredeccesor(TreeNode Predeccesor) {
        Predeccesor=Predeccesor.getLeftNode();
        while(Predeccesor.getRightNode()!=null){
            Predeccesor=Predeccesor.getRightNode();
        }
    }
    
    public void eraseTwoChild(int x){
        TreeNode bantu=find(x);
        setPredeccesor(bantu);
        bantu.setData(getPredeccesor().getData());
        
        if (getPredeccesor().getParent()!=bantu) {
            
        }
    }
    
    public TreeNode remove(int x){
        TreeNode bantu=find(x);
       
        if (bantu==null) {
            return null;
        }
        else{
            if (bantu.getData()==root.getData()) {
                if (bantu.getLeftNode()==null && bantu.getRightNode()==null) {
                    root=null;
                }
                else if(bantu.getRightNode()==null){
                    root=bantu.getLeftNode();
                }
                else if(bantu.getLeftNode()==null){
                    root=bantu.getRightNode();
                }
            }
            else{
                TreeNode parent=bantu.getParent(); 
                if (x<parent.getData()) {
                    if (bantu.getLeftNode()==null && bantu.getRightNode()==null) {
                        parent.setLeftNode(null);
                    }
                    else if(bantu.getRightNode()==null){
                        parent.setLeftNode(bantu.getLeftNode());
                    }
                    else if(bantu.getLeftNode()==null){
                        parent.setLeftNode(bantu.getRightNode());
                    }
                }
                else{
                    if (bantu.getLeftNode()==null && bantu.getRightNode()==null) {
                        parent.setRightNode(null);
                    }
                    else if(bantu.getRightNode()==null){
                        parent.setRightNode(bantu.getLeftNode());
                    }
                    else if(bantu.getLeftNode()==null){
                        parent.setRightNode(bantu.getRightNode());
                    }
                }
            }
        }
        return bantu;
    }
}
