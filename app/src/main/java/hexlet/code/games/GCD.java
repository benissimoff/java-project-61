package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Utils.getRandomInt;

public final class GCD {
    private static final String RULE = "Find the greatest common divisor of given numbers.";

    public static void run() {
        final int maxRounds = 3;
        String[][] questions = new String[maxRounds][2];

        for (int i = 0; i < maxRounds; i++) {
            questions[i] = generateQuestion();
        }

        Engine.start(RULE, questions);
    }

    private static String[] generateQuestion() {
        final int maxNumber = 100;
        String[] question = new String[2];
//        Random generator = new Random();
        int randomNumber1 = 1;
        int randomNumber2 = 1;
        if (getRandomInt(2) == 1) {
            final int maxBase = 20;
            int base = getRandomInt(1, maxBase);
            randomNumber1 = base * (getRandomInt(1, maxNumber / base));
            randomNumber2 = base * (getRandomInt(1, maxNumber / base));
        } else {
            randomNumber1 = getRandomInt(1, maxNumber);
            randomNumber2 = getRandomInt(1, maxNumber);
        }

        int correctAnswer = gcd(randomNumber1, randomNumber2);

        question[0] = randomNumber1 + " " + randomNumber2;
        question[1] = "" + correctAnswer;

        return question;
    }

    private static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
