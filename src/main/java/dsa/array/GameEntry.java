package dsa.array;

public class GameEntry {
    private String name; // name of player
    private int score; // score of player in this game

    public GameEntry(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public static GameEntryBuilder builder() {
        return new GameEntryBuilder();
    }

    public static class GameEntryBuilder {
        private String name; // name of player
        private int score; // score of player in this game

        public GameEntryBuilder name(String name) {
            this.name = name;
            return this;
        }

        public GameEntryBuilder score(int score) {
            this.score = score;
            return this;
        }

        public GameEntry build() {
            return new GameEntry(this.name, this.score);
        }
    }
}
