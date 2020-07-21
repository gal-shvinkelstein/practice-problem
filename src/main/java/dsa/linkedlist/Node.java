package dsa.linkedlist;

public class Node<E> {
    private E value;
    private Node next;

    public Node(E value, Node next) {
        this.value = value;
        this.next = next;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public boolean hasNext() {
        return this.next != null;
    }
}
