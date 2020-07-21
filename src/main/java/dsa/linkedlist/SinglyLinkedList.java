package dsa.linkedlist;

public class SinglyLinkedList<E> implements List<E> {
    private int size;
    /**
     * Last node of the list
     */
    private Node<E> tail;
    /**
     * First node of the list
     */
    private Node<E> head;

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
        if (size == 0) {
            return null;
        }
        return head.getValue();
    }

    @Override
    public E last() {
        if (size == 0) {
            return null;
        }
        return tail.getValue();
    }

    @Override
    public void addFirst(E e) {
        head = new Node<>(e, head);
        if (size == 0) {
            tail = head;
        }
        size++;
    }

    @Override
    public void addLast(E e) {
        Node node = new Node<>(e, null);
        if (size == 0) {
            head = node;
        }
        tail = node;
        tail.setNext(node);
        size++;
    }

    @Override
    public E removeFirst() {
        if (size == 0) {
            return null;
        }
        E e = head.getValue();
        head = head.getNext();
        size--;
        if (size == 0) {
            tail = null;
        }
        return e;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return null;
        }

        Node node = tail;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(node.getValue());

        while (node != null && node.hasNext()) {
            sb.append(",");
            sb.append(node.getValue());
            node = node.getNext();
        }
        sb.append("]");
        return sb.toString();
    }
}
