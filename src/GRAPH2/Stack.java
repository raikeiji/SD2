package GRAPH2;

/*
Nama : ENGELBERTUS VIONE
NIM  : 125314112 
*/
public class Stack {
    private final int SIZE = 20;
    private int[] st;
    private int top;

    public Stack() {
        st = new int[SIZE];
        top = -1;
    }
    
    public void push(int j) {
        st[++top] = j;
    }
    
    public int pop() {
        return st[top--];
    }
    
    public int peek() {
        return st[top];
    }
    
    public boolean isEmpty() {
        return (top == -1);
    }
}
