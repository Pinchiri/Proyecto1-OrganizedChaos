package OrganizedChaos;

import javax.swing.JOptionPane;

/**
 *
 * @author Rolando Sorrentino
 * @param <T>
 */
public class ListaDoble<T> {

    private Nodo<T> head;
    private Nodo<T> tail;
    private int size;

    public ListaDoble() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public ListaDoble(Nodo<T> node) {
        this.head = this.tail = node;
        this.size = 1;

    }

    public Nodo getTail() {
        return tail;
    }

    public void setTail(Nodo<T> tail) {
        this.tail = tail;
    }

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

    public boolean isEmpty() {
        return head == null;
    }

    public Nodo addFirst(T element) {
        Nodo<T> node = new Nodo(element);
        if (isEmpty()) {
            setHead(node);
            setTail(node);
        } else {
            node.setNext(getHead());
            getHead().setPrevious(node);
            setHead(node);
            Nodo pointer = getHead();
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            setTail(pointer);
        }
        size++;
        return node;
    }

    public Nodo addLast(T element) {
        Nodo<T> node = new Nodo(element);
        if (isEmpty()) {
            setHead(node);
            setTail(node);
        } else {
            Nodo pointer = getHead();
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(node);
            node.setPrevious(pointer);
            setTail(node);
        }
        size++;
        return node;
    }

    public Nodo addInIndex(int index, T element) {
        Nodo<T> node = new Nodo(element);
        if (isEmpty()) {
            setHead(node);
        } else {
            if (index > getSize()) {
                JOptionPane.showMessageDialog(null, "The index is out of bounds. The element will be added on the last index.");
                return addLast(element);
            } else {
                if (index > getSize() / 2) {
                    Nodo pointer = getTail();
                    int cont = 0;
                    while (cont < (getSize() - index) && pointer.getPrevious() != null) {
                        pointer = pointer.getPrevious();
                        cont++;
                    }
                    node.setNext(pointer.getNext());
                    node.setPrevious(pointer);
                    pointer.getNext().setPrevious(node);
                    pointer.setNext(node);
                } else {
                    Nodo pointer = getHead();
                    int cont = 0;
                    while (cont < (index - 1) && pointer.getNext() != null) {
                        pointer = pointer.getNext();
                        cont++;
                    }
                    node.setNext(pointer.getNext());
                    node.setPrevious(pointer);
                    pointer.getNext().setPrevious(pointer);
                    pointer.setNext(node);
                }
            }
        }
        size++;
        return node;
    }

    public Nodo deleteFirst() {
        if (!isEmpty()) {
            if (getSize() == 1) {
                setTail(null);
            }
            Nodo pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            size--;
            return pointer;
        }
        return null;
    }

    public Nodo deleteLast() {
        if (!isEmpty()) {
            Nodo pointer = getHead();
            if (getSize() == 1) {
                setHead(null);
                size--;
            } else {
                while (pointer.getNext() != null && pointer.getNext().getNext() != null) {
                    pointer = pointer.getNext();
                }
                pointer.getNext().setPrevious(null);
                Nodo nodeReturn = pointer.getNext();
                pointer.setNext(null);
                setTail(pointer);
                size--;
                return nodeReturn;
            }
        }
        return null;
    }

    public Nodo deleteInIndex(int index) {
        if (!isEmpty()) {
            Nodo pointer = getHead();
            if (index > getSize()) {
                JOptionPane.showMessageDialog(null, "The index is out of bounds. Instead, the last element will be deleted.");
                return deleteLast();
            } else {

                if (index > getSize() / 2) {
                    pointer = getTail();
                    int cont = 0;
                    while (cont < (getSize() - index) && pointer.getPrevious() != null) {
                        pointer = pointer.getPrevious();
                        cont++;
                    }
                    Nodo temp = pointer.getNext();
                    pointer.setNext(temp.getNext());
                    temp.getNext().setPrevious(pointer);
                    temp.setNext(null);
                    temp.setPrevious(null);
                    size--;

                } else {
                    pointer = getHead();
                    int cont = 0;
                    while (cont < (index - 1) && pointer.getNext() != null) {
                        pointer = pointer.getNext();
                        cont++;
                    }
                    Nodo temp = pointer.getNext();
                    pointer.setNext(temp.getNext());
                    temp.getNext().setPrevious(pointer);
                    temp.setNext(null);
                    temp.setPrevious(null);
                    size--;
                }
            }
        }
        return null;
    }

    public T getElement(int index) {
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "The list is empty");
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

    public T searchElement(T element) {
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "The list is empty");
            return null;

        } else {
            Nodo<T> pointer = getHead();
            
            while (pointer != null) {
                if(pointer.getData() == element) {
                    return pointer.getData();

                }
                pointer = pointer.getNext();
            }
        }
        return null;
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

    public ListaDoble merge(ListaDoble l1, ListaDoble l2) {
        Nodo one = l1.getHead();
        Nodo two = l2.getHead();

        ListaDoble merged = new ListaDoble();

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

    public ListaDoble mergeSort(Nodo head, Nodo tail) {
        if (head == tail) {
            ListaDoble br = new ListaDoble();
            br.addLast(head.getData());
            return br;
        }

        Nodo mid = middleNode(head, tail);

        ListaDoble leftSide = mergeSort(head, mid);
        ListaDoble rightSide = mergeSort(mid.getNext(), tail);

        ListaDoble sorted = merge(leftSide, rightSide);
        return sorted;

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

}
