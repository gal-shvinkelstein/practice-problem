package dsa.stack;

public class Stack<T extends Object> {
    private T[] array;
    private int top;
    private int size;
    private float loadFactor;

    public Stack(int size) {
        this(size, .5f);
    }

    public Stack(int size, float loadFactor) {
        array = (T[]) new Object[size];
        this.size = size;
        this.loadFactor = loadFactor;
        top = -1;
    }

    public boolean push(T item) {
        if (top == size) {
            size = size + Math.round(size * loadFactor);
        }

        this.array[++top] = item;
        return true;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean hasMoreItem() {
        return top != -1;
    }

    public int getSize() {
        return size;
    }

    public T peek() {
        if (isEmpty()) {
            throw new UnsupportedOperationException("Stack is empty");
        }
        return this.array[top];
    }

    public T pop() {
        if (isEmpty()) {
            throw new UnsupportedOperationException("Stack is empty");
        }
        return this.array[top--];
    }
}
