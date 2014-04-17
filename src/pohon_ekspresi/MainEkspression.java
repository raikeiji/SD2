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
public class MainEkspression {
    
    static char operator[] = {'+', '-', '*', '/', '^'};
    static char operand[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
        'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
        'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    
    public static void main(String[] args) {
        char huruf;
        String isi = "AB+";
        String hasil;
        
        Stack tumpuk = new Stack();
        for (int i = 0; i < isi.length(); i++) {
            huruf = isi.charAt(i);
            TreeNode a = new TreeNode(huruf);
            if (isOperator(huruf) == true) {
                TreeNode b = tumpuk.pop().data;
                TreeNode c = tumpuk.pop().data;
                tumpuk.push(new TreeNode(huruf, c, b));
            } else if (isOperand(huruf)) {
                tumpuk.push(a);
            }
        }
        System.out.println("Untuk membaca prefix gunakan method preorder");
        preorderTraversalHelper(tumpuk.top.data);
        System.out.println("\nUntuk membac infix gunakan method inorder");
        inorderTraversalHelper(tumpuk.top.data);
        System.out.println("\nUntuk memaca posfix gunakan method postorder");
        postorderTraversalHelper(tumpuk.top.data);
      }
    
    public static void inorderTraversalHelper(TreeNode localRoot) {
        if (localRoot != null) {
            inorderTraversalHelper(localRoot.getLeftNode());
            System.out.print(localRoot.getData() + " ");
            inorderTraversalHelper(localRoot.getRightNode());
        }
    }

     public static void postorderTraversalHelper(TreeNode localRoot) {
        if (localRoot != null) {
            postorderTraversalHelper(localRoot.getLeftNode());
            postorderTraversalHelper(localRoot.getRightNode());
            System.out.print(localRoot.getData() + " ");
        }
    }
     
    public static void preorderTraversalHelper(TreeNode localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.getData() + " ");
            preorderTraversalHelper(localRoot.getLeftNode());
            preorderTraversalHelper(localRoot.getRightNode());
        }
    }

    public static boolean isOperator(char data) {
        for (int i = 0; i < operator.length; i++) {
            if (data == operator[i]) {
                return true;
            }
            
        }
        return false;
        
    }
    
    public static boolean isOperand(char data) {
        for (int i = 0; i < operand.length; i++) {
            if (data == operand[i]) {
                return true;
            }
        }
        return false;
    }
    
}
