package bt13;

import java.util.NoSuchElementException;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes = 0;

    public MyLinkedList() {
    }

    void add(int index, E element) {
        Node newNode = new Node(element);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        numNodes++;
    }

    void addFirst(E e) {
        add(0, e);
    }

    void addLast(E e) {
        add(numNodes, e);
    }

    E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        E data = (E) current.next.getData();
        current.next = current.next.next;
        numNodes--;
        return data;
    }

    boolean remove(Object e) {
        Node current = head;
        if (e == null) {
            for (int i = 0; i < numNodes; i++) {
                if (current.next.getData() == null) {
                    current.next = current.next.next;
                    numNodes--;
                    return true;
                }
                current = current.next;
            }
        } else {
            for (int i = 0; i < numNodes; i++) {
                if (e.equals(current.next.getData())) {
                    current.next = current.next.next;
                    numNodes--;
                    return true;
                }
                current = current.next;
            }
        }
        return false;
    }

    int size() {
        return numNodes;
    }

    public MyLinkedList<E> clone() {
        MyLinkedList<E> newList = new MyLinkedList<>();
        Node current = head;
        while (current != null) {
            newList.addLast(current.getData());
            current = current.next;
        }
        return newList;
    }

    boolean contains(E o) {
        Node current = head;
        if (o == null) {
            for (int i = 0; i < numNodes; i++) {
                if (current.getData() == null) {
                    return true;
                }
                current = current.next;
            }
        } else {
            for (int i = 0; i < numNodes; i++) {
                if (o.equals(current.getData())) {
                    return true;
                }
                current = current.next;
            }
        }
        return false;
    }

    int indexOf(E o) {
        Node current = head;
        if (o == null) {
            for (int i = 0; i < numNodes; i++) {
                if (current.getData() == null) {
                    return i;
                }
                current = current.next;
            }
        } else {
            for (int i = 0; i < numNodes; i++) {
                if (o.equals(current.getData())) {
                    return i;
                }
                current = current.next;
            }
        }
        return -1;
    }

    boolean add(E e) {
        addLast(e);
        return true;
    }

    void ensureCapacity(int minCapacity) {
        throw new UnsupportedOperationException();
    }

    E get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.getData();
    }

    E getFirst() {
        if (numNodes == 0) {
            throw new NoSuchElementException();
        }
        return head.getData();
    }

    E getLast() {
        if (numNodes == 0) {
            throw new NoSuchElementException();
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.getData();
    }

    void clear() {
        head = null;
        numNodes = 0;
    }

    void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.next;
        }
    }

    private class Node {
        private E data;
        private Node next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }

        public E getData() {
            return data;
        }
    }

}
