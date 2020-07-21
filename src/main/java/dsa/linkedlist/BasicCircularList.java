package dsa.linkedlist;

public class BasicCircularList<E> implements CircularList<E> {
    private Node<E> tail;
    private int size;

    @Override
    public void addFirst(E e) {
        if (size == 0) {
            tail = new Node(e, null);
            tail.setNext(tail);
        } else {
            Node newNode = new Node(e, tail.getNext());
            tail.setNext(newNode);
        }
        size++;
    }

    @Override
    public void addLast(E e) {
        addFirst(e);
        tail = tail.getNext();
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
        if (size == 0) {
            return null;
        }
        return tail.getNext().getValue();
    }

    @Override
    public E last() {
        return tail.getValue();
    }

    @Override
    public E removeFirst() {
        return null;
    }

    public void rotate() {
        tail = tail.getNext();
    }
}
