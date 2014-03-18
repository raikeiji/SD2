/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JTree;

import java.rmi.activation.Activatable;

/**
 *
 * @author rai
 */
public class TreeNode {
    private int data;
    private TreeNode leftNode, rightNode;

    public TreeNode(int data) {
        this.data=data;
        this.leftNode=rightNode=null;
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
}
