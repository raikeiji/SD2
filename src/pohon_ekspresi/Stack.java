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
public class Stack {
    NodeStack top;
    NodeStack next;

    public Stack() {
        top=null;
    }
    
    public void push(TreeNode masuk){
        NodeStack t=new NodeStack(masuk);
        t.next=top;
        top=t;
    }
    
    public NodeStack pop(){
        NodeStack temp=top;
        top=top.next;
        return temp;
    }
    
}
