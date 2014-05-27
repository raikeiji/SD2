///*
//Nama : ENGELBERTUS VIONE
//NIM  : 125314112 
//*/
//
//package GRAPH2;
//
//public class LinkedList {
//
//    private ListNode head;
//    private int size;
//
//    public LinkedList() {
//        head = new ListNode();
//        head.next = head;
//        head.prev = head;
//        size = 0;
//    }
//
//    private ListNode addBefore(int elemen, ListNode bantu) {
//        ListNode baru = new ListNode(elemen);
//        baru.next = bantu;
//        baru.prev = bantu.prev;
//        bantu.prev = baru;
//        baru.prev.next = baru;
//        size++;
//        return bantu;
//    }
//
//    private int remove(ListNode hapus) {
//        if (!isEmpty()) {
//            hapus.prev.next = hapus.next;
//            hapus.next.prev = hapus.prev;
//            hapus.next = null;
//            hapus.prev = null;
//            size--;
//        }
//        return hapus.elemen;
//    }
//
//    public int removeFirst() {
//        return remove(head.next);
//    }
//
//    public int removeLast() {
//        return remove(head.prev);
//    }
//
//    public void addFirst(int elemen) {
//        addBefore(elemen, head.next);
//    }
//
//    public void addLast(int elemen) {
//        addBefore(elemen, head);
//    }
//
//    public int size() {
//        return size;
//    }
//
//    public boolean isEmpty() {
//        if (size == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public ListNode search(int elemen) {
//        ListNode bantu = head.next;
//        while (bantu != head) {
//            if (elemen == bantu.elemen) {
//                return bantu;
//            }
//            bantu = bantu.next;
//        }
//        return null;
//    }
//
//    public boolean searchRemove(int elemen) {
//        ListNode result = search(elemen);
//        if (result != null) {
//            remove(result);
//            return true;
//        }
//        return false;
//    }
//
//    @Override
//    public String toString() {
//        ListNode bantu = head.next;
//        String elemen = "";
//        while (bantu != head) {
//            elemen = elemen + bantu.elemen + " ";
//            bantu = bantu.next;
//        }
//        System.out.println();
//        return elemen;
//    }
//}