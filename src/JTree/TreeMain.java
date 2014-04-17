package JTree;

public class TreeMain {
    public static void main(String[] args) {
        Tree t=new Tree();
        t.insertNode(34);
        t.insertNode(23);
        t.insertNode(7);
        t.insertNode(98);
        t.insertNode(45);
        t.insertNode(67);
        t.insertNode(32);
        t.insertNode(8);
        t.insertNode(90);
        t.insertNode(56);
        t.inOrderTraversal();
        System.out.println("");
//        t.postOrderTraversal();
//        System.out.println("");
//        t.preOrderTraversal();
//        System.out.println("");
        
//        TreeNode hasil=t.find(23);
//        if (hasil!=null) {
//            System.out.println("Node ditemukan");
//        }
//        else System.out.println("Node tidak ditemukan");
//        
//        hasil=t.find(9);
//        if (hasil!=nsysull) {
//            System.out.println("Node ditemukan");
//        }
//        else System.out.println("Node tidak ditemukan");
        
        int data=32;
        t.delete(data);
        t.inOrderTraversal();
    }
}
