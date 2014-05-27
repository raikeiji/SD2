package PohonSeimbang;


public class Aplikasi {

    public static void main(String[] args) {
        BinaryTree2 t = new BinaryTree2();
        t.insert(13);
        t.insert(7);
        t.insert(5);
        t.insert(10);
        t.insert(15);
        t.insert(3);
        System.out.println("Tree Yang Terbentuk : ");
        t.inOrder(t.getRoot());
        System.out.println("\n");

        t.rotateRight(t.getRoot());
        System.out.println("Tree Setelah Rotasi Kanan");
        System.out.print("Inorder : ");
        t.inOrder(t.getRoot());
        System.out.println("\n");
        System.out.print("Postorder : ");
        t.postOrder(t.getRoot());
        System.out.println("\n");
        System.out.print("Preorder : ");
        t.preOrder(t.getRoot());
        System.out.println();
    }
}