package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.convertBool2YesNo;
import static hexlet.code.Utils.getRandomInt;

public final class Prime {
    private static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void run() {
        final int maxRounds = Engine.getMaxRounds();
        String[][] questions = new String[maxRounds][2];

        for (int i = 0; i < maxRounds; i++) {
            questions[i] = generateQuestion();
        }

        Engine.start(RULE, questions);
    }

    private static String[] generateQuestion() {
        final int maxNumber = 200;
        int randomNumber = getRandomInt(maxNumber);
        String[] question = {"" + randomNumber, convertBool2YesNo(isPrime(randomNumber)) };

        return question;
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        boolean result = true;

        int divisor = 2;

        while (divisor * divisor <= number) {
            if (number % divisor == 0) {
                result = false;
                break;
            }

            divisor++;
        }

        return result;
    }
}
