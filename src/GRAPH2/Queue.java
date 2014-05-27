/*
Nama : ENGELBERTUS VIONE
NIM  : 125314112 
*/

package GRAPH2;

import java.util.ArrayList;

public class Queue {

    private ArrayList<LinkedList> antrian;
    private int size;

    public Queue() {
        antrian = new LinkedList();
    }

    public void enqueue(int elemen) {
        antrian.addLast(elemen);
        size++;
    }

    public int dequeue() {
        size--;
        return antrian.removeFirst();
    }

    public boolean isEmpty() {
        return antrian.isEmpty();
    }
}