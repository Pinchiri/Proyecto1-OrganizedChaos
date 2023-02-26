package OrganizedChaos;

import javax.swing.JOptionPane;

public class Queue<T> {
    private Nodo<T> head, tail;
    private int size;

    //Constructor
    public Queue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    
    //Getters and Setters
    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public Nodo getTail() {
        return tail;
    }

    public void setTail(Nodo tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    public boolean isEmpty(){
        return head == null;
    }
    
    
    public Nodo add(T data){
        Nodo node = new Nodo(data);
        if (isEmpty()) {
            setHead(node);
            setTail(node);
        } else {
            Nodo pointer = getTail();
            pointer.setNext(node);
            setTail(node);
        }
        size++;
        return node;
    }
    
    
    public T dispatch(){
        if (!isEmpty()){
            Nodo pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            if (getHead() == null){
                setTail(null);
            }
            size--;
            return (T) pointer.getData();
        }
        return null;
    }
    
    
    public void remove(){
        if (!isEmpty()){
            Nodo pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            if (getHead() == null){
                setTail(null);
            }
            size--;
        }
    }
    
    
    public void printQueue(){
        Nodo pointer = getHead();
        String sQueue = "";
        
        while (pointer != null) {
            if (pointer == getTail()) {
            sQueue += pointer.getData();
                
            } else {
                sQueue += pointer.getData() + ", ";
                pointer = pointer.getNext();
            }
        }
        JOptionPane.showMessageDialog(null, sQueue);
    }
    
}
