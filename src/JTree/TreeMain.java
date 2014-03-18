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
public class TreeMain {
    public static void main(String[] args) {
        Tree t=new Tree();
        t.add(34);
        t.add(23);
        t.add(7);
        t.add(98);
        t.add(45);
        t.add(67);
        t.add(32);
        t.add(8);
        t.inOrderTraversal();
        System.out.println("");
        t.postOrderTraversal();
        System.out.println("");
        t.preOrderTraversal();
        System.out.println("");
        
        TreeNode hasil=t.find(23);
        if (hasil!=null) {
            System.out.println("Node ditemukan");
        }
        else System.out.println("Node tidak ditemukan");
        
        hasil=t.find(9);
        if (hasil!=null) {
            System.out.println("Node ditemukan");
        }
        else System.out.println("Node tidak ditemukan");
    }
}
