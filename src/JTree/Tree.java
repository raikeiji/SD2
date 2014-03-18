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
}
