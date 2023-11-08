package Lesson3;

import java.util.List;

public class Game {
    public static int playGame(List<Integer> sequence) {
        int score = 0;
        boolean foundMatch;

        do {
            foundMatch = false;

            for (int i = 0; i < sequence.size() - 1; i++) {
                int currentNumber = sequence.get(i);
                int nextNumber = sequence.get(i + 1);

                if (currentNumber == nextNumber || currentNumber + nextNumber == 9) {
                    sequence.remove(i);
                    sequence.remove(i);
                    score++;
                    foundMatch = true;
                    break;
                }
            }
        } while (foundMatch);

        return score;
    }
}