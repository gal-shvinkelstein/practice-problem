package dsa.linkedlist;

public class DoublyLinkedList<E> implements DoublyList<E> {
    private int size;
    private Node<E> header;
    private Node<E> trailer;

    public DoublyLinkedList() {
        header = new Node(null, null, null);
        trailer = new Node(null, null, header);
        header.setNext(header);
    }

    @Override
    public E removeLast() {
        if (size == 0) {
            return null;
        }
        return remove(trailer.getPrev());
    }

    private E remove(Node<E> node) {
        Node successor = node.getNext();
        Node predecessor = node.getPrev();
        successor.setPrev(predecessor);
        predecessor.setNext(successor);
        size--;
        return node.getValue();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E first() {
        if (isEmpty()) {
            return null;
        }
        return header.getPrev().getValue();
    }

    @Override
    public E last() {
        if (isEmpty()) {
            return null;
        }
        return trailer.getPrev().getValue();
    }

    @Override
    public void addFirst(E e) {
        addInBetween(e, header, header.next);
    }

    private void addInBetween(E e, Node<E> predecessor, Node<E> successor) {
        Node node = new Node(e, successor, predecessor);
        predecessor.setNext(node);
        successor.setPrev(node);
        size++;
    }

    @Override
    public void addLast(E e) {
        addInBetween(e, trailer.prev, trailer);
    }

    @Override
    public E removeFirst() {
        if (size == 0) {
            return null;
        }
        return remove(header.getNext());
    }

    private static class Node<E> {
        private E value;
        private Node next;
        private Node prev;

        public Node(E value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
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

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }
    }
}
