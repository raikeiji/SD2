package Modul2;

public class DListNode {
    private Object data;
    private DListNode next;
    private DListNode prev;

    public DListNode()
    {
        
    }
     public DListNode(Object d)
    {
        setData(d);
        next=null;
        prev=null;
    }
   
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public DListNode getNext() {
        return next;
    }

    public void setNext(DListNode next) {
        this.next = next;
    }

    public DListNode getPrev() {
        return prev;
    }

    public void setPrev(DListNode prev) {
        this.prev = prev;
    }
}
