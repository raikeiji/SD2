package DFS;

public class StackDinamis {
    private List tumpukan;

    public StackDinamis() {
        tumpukan=new List();
    }

    public void push(int element){
      tumpukan.addFirst(element);
    }
    
    public int pop(){
        return tumpukan.removefirst().getData();
    }
    
    public int size(){
        return tumpukan.getSize();
    }
    
    public boolean isEmpty(){
        return tumpukan.isEmpty();
    }

    @Override
    public String toString() {
        if(tumpukan.isEmpty())return "Stack kosong";
        return tumpukan.toString();
    }  
}
