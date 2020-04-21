package dsa.stack;

public class BasicStack<T> implements Stack<T> {
    private T[] array;
    private int top;
    private int size;
    private float loadFactor;

    public BasicStack(int size) {
        this(size, .5f);
    }

    public BasicStack(int size, float loadFactor) {
        array = (T[]) new Object[size];
        this.size = size;
        this.loadFactor = loadFactor;
        top = -1;
    }

    @Override
    public boolean push(T item) {
        if (top == size) {
            size = size + Math.round(size * loadFactor);
        }

        this.array[++top] = item;
        return true;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean hasMoreItem() {
        return top != -1;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new UnsupportedOperationException("BasicStack is empty");
        }
        return this.array[top];
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new UnsupportedOperationException("BasicStack is empty");
        }
        return this.array[top--];
    }
}
