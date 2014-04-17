package JTree2;

public class Test {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insertNode(42);
        tree.insertNode(21);
        tree.insertNode(38);
        tree.insertNode(27);
        tree.insertNode(71);
        tree.insertNode(82);
        tree.insertNode(55);
        tree.insertNode(63);
        tree.insertNode(6);
        tree.insertNode(2);
        tree.insertNode(40);
        tree.insertNode(12);
        
        System.out.println("In Order");
        tree.inorderTraversal();
        System.out.println("");
        System.out.println("Pre Order");
        tree.preorderTraversal();
        System.out.println("");
        System.out.println("Post Order");
        tree.postorderTraversal();
        System.out.println("");
//        int cari = 12;
//        System.out.println();
//        if(tree.find(cari)== null){
//            System.out.println(cari+" is not found");
//        }else{
//            System.out.println(cari+" is found");
//        }
        System.out.println("");
        System.out.println("Menghapus dengan menggunakan method deeltePred()");
        tree.deletePred(2);
//      detelePred() merupakan method yang menggunakan method Succesor untuk menghapus
        System.out.println("2 telah dihapus");
        System.out.println("In Order");
        tree.inorderTraversal();
        System.out.println("");
        System.out.println("Menghapus dengan menggunakan method deelteSucs()");
        tree.deleteSucs(6);
//      deteleSucs() merupakan method yang menggunakan method Succesor untuk menghapus
        System.out.println("6 telah dihapus");
        System.out.println("In Order");
        tree.inorderTraversal();
        int cari = 12;
        System.out.println();
        if(tree.find(cari)== null){
            System.out.println(cari+" is not found");
        }else{
            System.out.println(cari+" is found");
        }
    }
}
