package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Even {
    private static final String RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void run() {
        final int maxRounds = Engine.getMaxRounds();
        String[][] questions = new String[maxRounds][2];

        for (int i = 0; i < maxRounds; i++) {
            questions[i] = generateQuestion();
        }

        Engine.start(RULE, questions);
    }

    private static String[] generateQuestion() {
        String[] question = new String[2];

        final int maxNumber = 100;
        int randomNumber = Utils.getRandomInt(maxNumber);

        question[0] = "" + randomNumber;
        question[1] = makeAnswer(randomNumber);

        return question;
    }

    private static String makeAnswer(int number) {
        String result = isEven(number) ? "yes" : "no";

        return result;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
