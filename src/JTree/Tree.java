package JTree;

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

    public void insertNode(int x) {
        if (root == null) {
            root = new TreeNode(x, null);
        } else {
            root.insert(x);
        }
    }

    public TreeNode getSuccescor(TreeNode hapus) {
        TreeNode Succescor;
        Succescor = hapus.getRightNode();
        while (Succescor.getLeftNode() != null) {
            Succescor = Succescor.getLeftNode();
        }
        return Succescor;
    }

    public TreeNode getPredeccesor(TreeNode hapus) {
        TreeNode Predececcor;
        Predececcor = hapus.getRightNode();
        while (Succescor.getLeftNode() != null) {
            Succescor = Succescor.getLeftNode();
        }
        return Predececcor;
    }

//    public TreeNode remove(int x){
//        TreeNode bantu=find(x);
//       
//        if (bantu==null) {
//            return null;
//        }
//        else{
//            if (bantu.getData()==root.getData()) {
//                if (bantu.getLeftNode()==null && bantu.getRightNode()==null) {
//                    root=null;
//                }
//                else if(bantu.getRightNode()==null){
//                    root=bantu.getLeftNode();
//                }
//                else if(bantu.getLeftNode()==null){
//                    root=bantu.getRightNode();
//                }
//            }
//            else{
//                TreeNode parent=bantu.getParent(); 
//                if (bantu.getData()<parent.getData()) {
//                    if (bantu.getLeftNode()==null && bantu.getRightNode()==null) {
//                        parent.setLeftNode(null);
//                    }
//                    else if(bantu.getRightNode()==null){
//                        parent.setLeftNode(bantu.getLeftNode());
//                    }
//                    else if(bantu.getLeftNode()==null){
//                        parent.setLeftNode(bantu.getRightNode());
//                    }
//                }
//                else{
//                    if (bantu.getLeftNode()==null && bantu.getRightNode()==null) {
//                        parent.setRightNode(null);
//                    }
//                    else if(bantu.getRightNode()==null){
//                        parent.setRightNode(bantu.getLeftNode());
//                    }
//                    else if(bantu.getLeftNode()==null){
//                        parent.setRightNode(bantu.getRightNode());
//                    }
//                }
//            }
//        }
//        return bantu;
//    }
//    public boolean delete(int x){
//        TreeNode bantu=find(x);
//        if (bantu==null) {
//            return false;
//        }
//        else{
//            if (bantu.getData()==root.getData()) {
//                if (bantu.getLeftNode()==null && bantu.getRightNode()==null) {
//                    root=null;
//                }else if (bantu.getRightNode()==null) {
//                    root=bantu.getLeftNode();
//                }else if (bantu.getLeftNode()==null) {
//                    root=bantu.getRightNode();
//                }
//            }
//            else{
//                TreeNode parent=bantu.getParent();
//                if (x<parent.getData()) {
//                    if (bantu.getLeftNode()==null && bantu.getRightNode()==null) {
//                        parent.setLeftNode(null);
//                    }
//                    else if (bantu.getRightNode()==null) {
//                        parent.setLeftNode(bantu.getLeftNode());
//                    }
//                    else if (bantu.getLeftNode()==null) {
//                        parent.setLeftNode(bantu.getRightNode());
//                    }
//                }
//            }
//        }
//        return true;
//    }
    public boolean delete(int hapus) {
        TreeNode bantu = find(hapus);
        if (bantu == null) {
            return false;
        } else {
            if (bantu.getData() == root.getData()) {
                if (bantu.getLeftNode() == null && bantu.getRightNode() == null) {
                    root = null;
                } else if (bantu.getRightNode() == null) {
                    root = bantu.getLeftNode();
                } else if (bantu.getLeftNode() == null) {
                    root = bantu.getRightNode();
                } else {
                    bantu = getPredeccesor(bantu);
                    TreeNode parentPredeccesor = bantu.getParent();
                    bantu.setData(bantu.getData());
                    if (parentPredeccesor != bantu) {
                        parentPredeccesor.setLeftNode(bantu.getLeftNode());
                    }
                }
            } else {
                TreeNode parent = bantu.getParent();
                if (hapus < parent.getData()) {
                    if (bantu.getLeftNode() == null && bantu.getRightNode() == null) {
                        parent.setLeftNode(null);
                    } else if (bantu.getRightNode() == null) {
                        parent.setLeftNode(bantu.getLeftNode());
                    } else if (bantu.getLeftNode() == null) {
                        parent.setLeftNode(bantu.getRightNode());
                    } else {
                        bantu = getPredeccesor(bantu);
                        TreeNode parentPredeccesor = bantu.getParent();
                        bantu.setData(bantu.getData());
                        if (parentPredeccesor != bantu) {
                            parentPredeccesor.setLeftNode(bantu.getLeftNode());
                        }
                    }
                } else {
                    if (bantu.getLeftNode() == null && bantu.getRightNode() == null) {
                        parent.setRightNode(null);
                    } else if (bantu.getRightNode() == null) {
                        parent.setRightNode(bantu.getLeftNode());
                    } else if (bantu.getLeftNode() == null) {
                        parent.setRightNode(bantu.getRightNode());
                    } else {
                        bantu = getPredeccesor(bantu);
                        TreeNode parentPredeccesor = bantu.getParent();
                        bantu.setData(bantu.getData());
                        if (parentPredeccesor != bantu) {
                            parentPredeccesor.setLeftNode(bantu.getLeftNode());
                        }
                    }
                }
            }
        }
        return true;
    }

}
