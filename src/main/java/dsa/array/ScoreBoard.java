package dsa.array;

public class ScoreBoard {
    private GameEntry[] items;
    private int head;
    private int capacity;

    public ScoreBoard(int capacity) {
        this.items = new GameEntry[capacity];
        this.capacity = capacity;
        this.head = 0;
    }

    public boolean add(GameEntry item) {
        if (isFull()) {
            throw new IllegalStateException("Can not store more item.");
        }
        insert(item);
        return true;
    }

    public GameEntry get(int index) {
        if (index >= head || index >= items.length) {
            throw new IllegalStateException(String.format("No item exist at index %d", index));
        }
        return items[index];
    }

    public GameEntry remove(int index) {
        if (index >= head || index >= items.length) {
            throw new IllegalStateException(String.format("No item exist at index %d", index));
        }
        return doRemove(index);
    }

    private GameEntry doRemove(int index) {
        GameEntry itemToBeRemoved = items[index];
        leftShiftItemsByOne(index);
        items[head - 1] = null;
        head--;
        return itemToBeRemoved;
    }

    private void leftShiftItemsByOne(int itemIndex) {
        int shiftingIndex = itemIndex;
        while (shiftingIndex < head - 1) {
            items[shiftingIndex] = items[shiftingIndex + 1];
            shiftingIndex++;
        }
    }

    private void insert(GameEntry item) {
        int index = head;
        while (index > 0 && items[index - 1].getScore() > item.getScore()) {
            items[index] = items[index - 1];
            index--;
        }
        items[index] = item;
        head++;
    }

    public boolean isFull() {
        return head == capacity;
    }

    public void display() {
        System.out.println(String.format("%s  %s   :     %s", "Rank", "score", "name"));
        for (int i = head - 1; i > 0; i--) {
            System.out.println(String.format("%s       %s     :     %s", head - i, items[i].getScore(), items[i].getName()));
        }
    }

}
