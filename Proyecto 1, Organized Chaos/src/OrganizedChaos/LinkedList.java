/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrganizedChaos;

import javax.swing.JOptionPane;

/**
 *
 * @author Rolando Sorrentino
 * @param <T>
 */
public class LinkedList<T> {

    private Nodo<T> head;
    private Nodo<T> tail;
    private int size;

    //Constructor
    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;

    }

    public LinkedList(Nodo<T> node) {
        this.head = this.tail = node;
        size++;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Nodo<T> addFirst(T element) {
        Nodo<T> node = new Nodo(element);

        if (isEmpty()) {
            setHead(node);
            setTail(node);

        } else {
            node.setNext(head);
            setHead(node);

        }
        size++;
        return node;
    }

    public Nodo<T> addLast(T element) {
        Nodo<T> node = new Nodo(element);

        if (isEmpty()) {
            setHead(node);
            setTail(node);
            getHead().setNext(getTail());
            getTail().setNext(null);

        } else {
            getTail().setNext(node);
            setTail(node);

        }
        size++;
        return node;
    }

    public Nodo getTail() {
        return tail;
    }

    public void setTail(Nodo<T> tail) {
        this.tail = tail;
    }

    public Nodo<T> addInIndex(int index, T element) {
        Nodo<T> node = new Nodo(element);

        if (isEmpty()) {
            setHead(node);

        } else {

            if (index > getSize()) {
                JOptionPane.showMessageDialog(null, "The index is out of bounds. The element will be added on the last index.");
                return addLast(element);

            } else {
                Nodo<T> pointer = getHead();
                int counter = 0;
                while (counter < (index - 1) && pointer.getNext() != null) {
                    pointer = pointer.getNext();
                    counter++;

                }
                node.setNext(pointer.getNext());
                pointer.setNext(node);

            }
        }
        size++;
        return node;
    }

    public Nodo<T> deleteFirst() {

        if (!isEmpty()) {
            Nodo<T> pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            size--;

        } else {
            JOptionPane.showMessageDialog(null, "Your list is empty");

        }
        return null;
    }

    public Nodo<T> deleteLast() {

        if (!isEmpty()) {
            Nodo<T> pointer = getHead();

            if (getSize() == 1) {
                setHead(null);

            } else {
                while (pointer.getNext() != null && pointer.getNext().getNext() != null) {
                    pointer = pointer.getNext();
                }
                Nodo<T> nodeReturn = pointer.getNext();
                pointer.setNext(null);
                setTail(pointer);
                size--;
                return nodeReturn;

            }

        } else {
            JOptionPane.showMessageDialog(null, "Your list is empty");

        }

        return null;

    }

    public Nodo<T> deleteInIndex(int index) {
        if (!isEmpty()) {
            Nodo<T> pointer = getHead();
            if (index > getSize()) {
                JOptionPane.showMessageDialog(null, "The index is out of bounds. Instead, the last element will be deleted.");
                return deleteLast();

            } else {
                int counter = 0;
                while (counter < (index - 1) && pointer.getNext() != null) {
                    pointer = pointer.getNext();
                    counter++;

                }
            }
            Nodo<T> aux = pointer.getNext();
            pointer.setNext(aux.getNext());
            aux.setNext(null);
            size--;
        }
        return null;

    }

    public void printList() {

        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "Your list is empty");

        } else {
            String sList = "[ ";

            for (int i = 0; i < getSize(); i++) {

                if (i == getSize() - 1) {
                    sList += getElement(i);
                } else {
                    sList += getElement(i) + ", ";
                }
            }
            sList += " ]";

            JOptionPane.showMessageDialog(null, sList);

        }
    }

    public T getElement(int index) {
        if (isEmpty()) {
            return null;

        } else {
            Nodo<T> pointer = getHead();
            int counter = 0;
            while (counter < index && pointer.getNext() != null) {
                pointer = pointer.getNext();
                counter++;
            }
            return pointer.getData();

        }
    }

    public Nodo middleNode(Nodo head, Nodo tail) {
        Nodo slow = head;
        Nodo fast = head;

        while (fast != tail && fast.getNext() != tail) {
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }
        return slow;
    }

    public LinkedList merge(LinkedList l1, LinkedList l2) {
        Nodo one = l1.getHead();
        Nodo two = l2.getHead();

        LinkedList merged = new LinkedList();

        while (one != null && two != null) {
            if ((int) one.getData() < (int) two.getData()) {
                merged.addLast(one.getData());
                one = one.getNext();

            } else {
                merged.addLast(two.getData());
                two = two.getNext();

            }
        }
        while (one != null) {
            merged.addLast(one.getData());
            one = one.getNext();
        }
        while (two != null) {
            merged.addLast(two.getData());
            two = two.getNext();
        }

        return merged;
    }

    public LinkedList mergeSort(Nodo head, Nodo tail) {
        if (head == tail) {
            LinkedList br = new LinkedList();
            br.addLast(head.getData());
            return br;
        }

        Nodo mid = middleNode(head, tail);

        LinkedList leftSide = mergeSort(head, mid);
        LinkedList rightSide = mergeSort(mid.getNext(), tail);

        LinkedList sorted = merge(leftSide, rightSide);
        return sorted;
        
    }

    public boolean Includes(String name){
        int start = 0;
        Nodo<String> current = getHead();
        while(start < getSize()  && current.getNext() != null){ 
          if(name.equals(current.getData())){
              return true;
          }
          current = current.getNext();
        }
        return false;
    }
    
    
    
    
    //Getters and Setters
    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo<T> head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
