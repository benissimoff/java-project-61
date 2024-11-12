package hexlet.code.games;

import java.util.Random;

public class GCD implements Game {
    private final String rules = "Find the greatest common divisor of given numbers.";
    private String question;
    private String answer;

    public String getRules() {
        return this.rules;
    }

    public void generate() {
        final int maxNumber = 100;
        Random generator = new Random();
        int randomNumber1 = 1;
        int randomNumber2 = 1;
        if (generator.nextInt(2) == 1) {
            //System.out.println("HARD");
            int randomBase = 1 + generator.nextInt(maxNumber / 5);
            randomNumber1 = randomBase * (1 + generator.nextInt(maxNumber / randomBase));
            randomNumber2 = randomBase * (1 + generator.nextInt(maxNumber / randomBase));
        } else {
            randomNumber1 = 1 + generator.nextInt(maxNumber);
            randomNumber2 = 1 + generator.nextInt(maxNumber);
        }

        int correctAnswer = gcd(randomNumber1, randomNumber2);

        question = randomNumber1 + " " + randomNumber2;
        answer = "" + correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    private static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
