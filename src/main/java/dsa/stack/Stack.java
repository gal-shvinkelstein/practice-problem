package dsa.stack;

public interface Stack<T> {
    boolean push(T item);

    boolean isEmpty();

    boolean hasMoreItem();

    int getSize();

    T peek();

    T pop();
}
