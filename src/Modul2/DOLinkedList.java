package Modul2;

public class DOLinkedList {
    private DListNode head;
    private int size;

    public DOLinkedList()
    {
        head = new DListNode();
        head.setNext(head);
        head.setPrev (head);
        size=0;

    }
    public DListNode getHead() {
        return head;
    }

    public void setHead(DListNode head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public void addAfter(Object data,DListNode item)
    {
        DListNode news=new DListNode(data);
        news.setPrev(item);
        news.setNext(item.getNext());
        item.getNext().setPrev(news);
        item.setNext(news);
    }
 
    public void addBefore(Object data,DListNode item)
    {
        DListNode news=new DListNode(data);
        news.setNext(item);
        news.setPrev(item.getPrev());
        item.getPrev().setNext(news);
        item.setPrev(news);
    }
    void addFirst(Object elemen) {
	addBefore(elemen, head.getNext());
    }
    void addLast(Object elemen) {
	addBefore(elemen, head);
    }
    
    DListNode search (Object elemen)
    {
        DListNode pointer=head.getNext();
        while (pointer != head) {
            if(((Comparable)pointer.getData()).compareTo(elemen)==0) {
                return pointer;
            } else {
                pointer = pointer.getNext();
            }
        }
        return null;
//        for (DListNode i = pointer; i != head; i=i.getNext()) {
//            if (i.getData()==elemen) {
//                return ;
//            }
//        }
//        return pointer=null;
    }
    
    DListNode remove(DListNode item)
    {
        DListNode point=item;
        
        point.getPrev().setNext(point.getNext());
        point.getNext().setPrev(point.getPrev());
        return point;
    }
    public DListNode removeFirst() {
	return remove(head.getNext());
    }
    public DListNode removeLast() {
	return remove(head.getPrev());
    }

    @Override
    public String toString()
    {
        String isi="";
        DListNode pointer=head.getNext();
        
        while (pointer != head)
        {
            isi=isi+(pointer.getData()).toString()+" ";
            pointer=pointer.getNext();
        }
        return isi;
    }
    //    public boolean contains(Object data)
//    {
//        boolean check;
//        DListNode temp=head.getNext();
//        while (((Comparable)temp.getData()).compareTo(data)!=0 && temp!=head)
//                temp=temp.getNext();
//        if (((Comparable)temp.getData()).compareTo(data)==0)
//            return true;
//        else
//            return false;
//    }

    
//    
//    public void sisipKanan(Object data, Object sisip){
//        DListNode look=search(data);
//        DListNode cari=new DListNode(look);
//        cari.setNext((DListNode) sisip);
//    }
//            
}
