package JTree_Ekli;

public class Tree {

    private TreeNode root;

    public Tree() {
    }

    public Tree(TreeNode temp) {
        root = temp;
    }

    public void insert(int key) {
        TreeNode bantu;
        if (isEmpty()) {
            root = new TreeNode(key);
        } else {
            bantu = root;
            while (true) {
                if (key < bantu.getData()) { // proses insert cabang kiri
                    if (bantu.getLeftNode() == null) {
                        TreeNode baru = new TreeNode(key);
                        bantu.setLeftNode(baru);
                        return;
                    } else {
                        bantu = bantu.getLeftNode();
                    }
                } else { // proses insert cabang kanan
                    if (bantu.getRightNode() == null) {
                        TreeNode baru = new TreeNode(key);
                        bantu.setRightNode(baru);
                        return;
                    } else {
                        bantu = bantu.getRightNode();
                    }
                }
            }
        }
    }

    public void insertNode(int data) {
        if (root == null) {
            root = new TreeNode(data, null);
        } else {
            root.insert(data);
        }
    }

    public TreeNode find(int cari) {
        TreeNode bantu;
        bantu = root;
        while (bantu != null) {
            if (bantu.getData() == cari) {
                return bantu;
            } else {
                if (bantu.getData() > cari) {
                    bantu = bantu.getLeftNode();
                } else {
                    bantu = bantu.getRightNode();
                }
            }
        }
        return null;
    }

    public TreeNode getPredesesor(TreeNode hapus) {
        TreeNode bantu;
        bantu = hapus.getLeftNode();
        while (bantu.getRightNode() != null) {
            bantu = bantu.getRightNode();
        }
        return bantu;
    }

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
                    bantu = getPredesesor(bantu);
                    TreeNode parentPredesesor = bantu.getParent();
                    bantu.setData(bantu.getData());
                    if (parentPredesesor != bantu) {
                        parentPredesesor.setLeftNode(bantu.getLeftNode());
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
                        bantu = getPredesesor(bantu);
                        TreeNode parentPredesesor = bantu.getParent();
                        bantu.setData(bantu.getData());
                        if (parentPredesesor != bantu) {
                            parentPredesesor.setLeftNode(bantu.getLeftNode());
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
                        bantu = getPredesesor(bantu);
                        TreeNode parentPredesesor = bantu.getParent();
                        bantu.setData(bantu.getData());
                        if (parentPredesesor != bantu) {
                            parentPredesesor.setLeftNode(bantu.getLeftNode());
                        }
                    }
                }
            }
        }
        return true;
    }

    public void preorderTraversalHelper(TreeNode localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.getData() + " ");
            preorderTraversalHelper(localRoot.getLeftNode());
            preorderTraversalHelper(localRoot.getRightNode());
        }
    }

    public void inorderTraversalHelper(TreeNode localRoot) {
        if (localRoot != null) {
            inorderTraversalHelper(localRoot.getLeftNode());
            System.out.print(localRoot.getData() + " ");
            inorderTraversalHelper(localRoot.getRightNode());
        }
    }

    public void postorderTraversalHelper(TreeNode localRoot) {
        if (localRoot != null) {
            postorderTraversalHelper(localRoot.getLeftNode());
            postorderTraversalHelper(localRoot.getRightNode());
            System.out.print(localRoot.getData() + " ");
        }
    }

    public void preorderTraversal() {
        preorderTraversalHelper(root);
    }

    public void inorderTraversal() {
        inorderTraversalHelper(root);
    }

    public void postorderTraversal() {
        postorderTraversalHelper(root);
    }

    public boolean isEmpty() {
        return root == null;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
}
