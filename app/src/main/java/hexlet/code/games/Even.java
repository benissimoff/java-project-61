package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Even {
    private static final String RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void run() {
        final int maxRounds = 3;
        String[][] questions = new String[maxRounds][2];

        for (int i = 0; i < maxRounds; i++) {
            String[] question = generateQuestion();
            questions[i] = question;
        }

        Engine.start(RULE, questions);
    }

    private static String[] generateQuestion() {
        String[] question = new String[2];

        final int maxNumber = 100;
        int randomNumber = Utils.getRandomInt(maxNumber);

        question[0] = "" + randomNumber;
        question[1] = Utils.convertBool2YesNo(randomNumber % 2 == 0);

        return question;
    }
}
