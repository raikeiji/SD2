/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pohon_ekspresi;

/**
 *
 * @author rai
 */
public class NodeStack {
    TreeNode data;
    NodeStack next;
    
    public NodeStack(TreeNode data) {
        this.data=data;
    }

    public TreeNode getData() {
        return data;
    }

    public void setData(TreeNode data) {
        this.data = data;
    }
    
}
