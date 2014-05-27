package PohonSeimbang;

public class BinaryTree2 {
    private Node root;
    
    public void insert(int value) {
        Node newNode = new Node(value); // make new node
        if(getRoot()==null) { // no node in root
            setRoot(newNode);
            getRoot().setParent(null);        
        }
        else { // root occupied
            Node current = getRoot(); // start at root
             while (current!=null)
             {  
                if(value < current.getiData()) { // go left?
                    if(current.getLeft() == null) { // if end of the line
                        // insert on left
                        current.setLeft(newNode);
                        newNode.setParent(current);
                        current=null;                    
                    }
                    else {
                        current=current.getLeft();
                    }
                } // end if go left
                else { // or go right?
                    if(current.getRight() == null)  { // if end of the line
                        // insert on right
                        current.setRight(newNode);
                        newNode.setParent(current);
                        current=null ;                    
                    }
                    else {
                        current = current.getRight();
                    }
                } // end else go right
            } // end while
        } // end else not
    }// end insert

    public Node find(int key) { // find node with given key
        // (assumes non-empty tree)
        Node current = getRoot(); // start at root 
        while (current!=null) {
            if(key == current.getiData()) {
                return current;
            }        
            else if(key < current.getiData()) {
                    current = current.getLeft();
            } 
            else if(key > current.getiData()) { 
                    current = current.getRight(); 
            } 
        }
        return null;
    }//end find

    public void inOrder(Node localRoot) {
        if(localRoot != null) {
            inOrder(localRoot.getLeft());
            System.out.print(localRoot.getiData() + " ");
            inOrder(localRoot.getRight());
        }
    }

    public void preOrder(Node localRoot) {
        if(localRoot != null){
            System.out.print(localRoot.getiData() + " ");
            preOrder(localRoot.getLeft());
            preOrder(localRoot.getRight());
        }
    }

    public void postOrder(Node localRoot) {
        if(localRoot != null) {
            postOrder(localRoot.getLeft());
            postOrder(localRoot.getRight());
            System.out.print(localRoot.getiData() + " ");
        }
    }
    
    public boolean delete(int key) { // delete node with given key
        // ( non-empty list)
        //current diletakkan pada node yang akan dicari
        Node current = find(key);
        boolean isLeftChild = true;
        
        //menentukan posisi current terhadap parent, 
        //apakah disebelah kiri atau kanannya
        //asumsi awal awal ada disebelah kanan
        if(current.getParent().getRight()!=null) {
            if(current.getParent().getRight().getiData()==current.getiData()) {
                isLeftChild=false;
            }           
        }
        
        // node tidak punya anak
        if(current.getLeft()==null && current.getRight()==null)
        {
            delete0child(current, isLeftChild);
        }
        
        // node punya 1 anak sebelah kiri
        else if(current.getRight()==null) {
            delete1childLeft(current, isLeftChild);
        }
        
        // node punya 1 anak sebelah kanan
        else if(current.getLeft()==null) {
            delete1childRight(current, isLeftChild);
        }
        
        // node punya 2 anak
        else {
            // get successor of node to delete (current)
            Node Successor = getSuccessor(current);
            current.setiData(Successor.getiData());
            if(Successor.getParent() != current) {
                Successor.getParent().setLeft(Successor.getLeft());
            }
            else {
                Successor.getParent().setRight(Successor.getLeft());
            }
        } // end else two children
            return true;
    } // end delete()
    
    public void delete0child(Node current, boolean isLeftChild) {
        if(isLeftChild) {
            current.getParent().setLeft(null);
        }
        else {
            current.getParent().setRight(null);
        }
    }
    
    public void delete1childLeft(Node current, boolean isLeftChild) {
        if(isLeftChild) {
            current.getLeft().setParent(current.getParent());
            current.getParent().setLeft(current.getLeft());
        }
        else {
            current.getLeft().setParent(current.getParent());
            current.getParent().setRight(current.getLeft());
        }
    }
    
    public void delete1childRight(Node current, boolean isLeftChild) {
        if(isLeftChild) {
            current.getRight().setParent(current.getParent());
            current.getParent().setLeft(current.getRight());
        }
        else {
            current.getRight().setParent(current.getParent());
            current.getParent().setRight(current.getRight());
        }
    }
    
    public Node getSuccessor(Node delNode) {
        Node successor = delNode.getRight();
        while(successor.getLeft() != null) {
            successor = successor.getLeft();
        }
        return successor;
    }
    
    public Node getPredecessor(Node delNode) {
        Node predecessor = delNode.getLeft();
        while(predecessor.getRight() != null) {
            predecessor = predecessor.getRight();
        }
        return predecessor;
    }
    
    public void rotateRight(Node current) {
        Node prevRoot = current;
        current = current.getLeft();
        Node rightChild = current.getRight();
        current.setParent(null);
        current.setRight(null);
        
        setRoot(current);
        getRoot().setParent(null);
        
        current.setRight(prevRoot);
        prevRoot.setLeft(rightChild);
    }
    
    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}