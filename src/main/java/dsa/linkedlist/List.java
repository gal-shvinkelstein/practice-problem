package dsa.linkedlist;

public interface List<E> {
    int size();

    boolean isEmpty();

    E first();

    E last();

    void addFirst(E e);

    void addLast(E e);

    E removeFirst();
}
