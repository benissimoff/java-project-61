package hexlet.code.games;

import java.util.Random;

public final class Prime implements Game {
    private final String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private String question;
    private String answer;

    public String getRules() {
        return rules;
    }

    public void generate() {
        Random generator = new Random();
        int maxNumber = 200;
        int randomNumber = generator.nextInt(maxNumber);

        question = "" + randomNumber;
        answer = isPrime(randomNumber) ? "yes" : "no";
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

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
