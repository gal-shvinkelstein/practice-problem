package dsa.array.main;

import dsa.array.GameEntry;
import dsa.array.ScoreBoard;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ScoreBoardMain {
    private static final Random RANDOM = new Random();
    private static final String[] NAMES = {"Rinat",
            "Thoma",
            "Siddharth",
            "Rabia",
            "Nikki",
            "Michi",
            "Tyra",
            "Nishat",
            "Sonal",
            "Herman"};

    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard(10);
        buildGameEntries(10)
                .forEach(scoreBoard::add);
        scoreBoard.display();
        System.out.println(scoreBoard.isFull());
        scoreBoard.remove(9);
        scoreBoard.display();
        System.out.println(scoreBoard.isFull());
        System.out.println(scoreBoard.get(8));
    }

    private static List<GameEntry> buildGameEntries(int count) {
        /*return IntStream.range(0, count)
                .mapToObj(index -> buildGameEntry())
                .collect(Collectors.toList());*/
        //Collections.nCopies(n, T)
        return Stream.generate(ScoreBoardMain::buildGameEntry)
                .limit(count)
                .collect(Collectors.toList());
    }

    private static GameEntry buildGameEntry() {
        return GameEntry.builder()
                .name(NAMES[RANDOM.nextInt(NAMES.length - 1)])
                .score(RANDOM.nextInt(10))
                .build();
    }
}
