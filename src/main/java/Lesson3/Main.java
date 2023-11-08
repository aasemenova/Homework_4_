package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> sequence = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 8, 1, 9, 0, 5, 3));
        int score = Game.playGame(sequence);
        System.out.println("Результирующий счет: " + score);
    }
}