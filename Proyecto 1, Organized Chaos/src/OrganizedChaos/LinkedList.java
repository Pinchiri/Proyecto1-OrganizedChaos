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
    /**
     * 
     * @param node 
     */
    public LinkedList(Nodo<T> node) {
        this.head = this.tail = node;
        size++;
    }
    
    /**
     * 
     * @return Booleano; "true" si la lista está vacía, "false" si posee al menos un elemento
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Inserta un elemento al principio de la Lista
     * @param element (Elemento a agregar)
     * @return Nodo que se agregó
     */
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

    /**
     * Inserta un elemento al final de la Lista
     * @param element (Elemento a agregar)
     * @return Nodo que se agregó
     */
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

    /**
     * Inserta un elemento en el índice indicado de la Lista
     * @param index (Índice en el que se quiere agregar)
     * @param element (Elemento a agregar)
     * @return Nodo que se agregó
     */
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

    /**
     * Elimina el primer elemento de la Lista
     * @return Nodo eliminado
     */
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

    /**
     * Elimina el último elemento de la Lista
     * @return Nodo eliminado
     */
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

    /**
     * Elimina el elemento de la Lista que se encuentra en el índice indicado
     * @param index (Índice del elemento que se desea eliminar)
     * @return Nodo eliminado
     */
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

    /**
     * Imprime la lista
     */
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

    /**
     * Obtiene el elemento de la Lista que se encuentra en el índice indicado
     * @param index (Índice del elemento que se desea obtener)
     * @return 
     */
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

    /**
     * Busca el nodo central de una Lista
     * @param head (Cabeza de una lista)
     * @param tail (Cola de una lista
     * @return Nodo central
     */
    public Nodo middleNode(Nodo head, Nodo tail) {
        Nodo slow = head;
        Nodo fast = head;

        while (fast != tail && fast.getNext() != tail) {
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }
        return slow;
    }

    /**
     * Une dos listas dadas en orden ascendente
     * @param l1 
     * @param l2
     * @return Lista ordenada ascendentemente
     */
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

    /**
     * Ordena una lista utilizando mergeSort ascendentemente
     * @param head
     * @param tail
     * @return 
     */
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
 
    public Nodo getTail() {
        return tail;
    }

    public void setTail(Nodo<T> tail) {
        this.tail = tail;
    }
}
