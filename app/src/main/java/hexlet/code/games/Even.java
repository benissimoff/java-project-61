package hexlet.code.games;

import java.util.Random;

public class Even implements Game {
    private final String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private String question;
    private String answer;

    public String getRules() {
        return rules;
    }

    public void generate() {
        final int maxNumber = 100;
        Random generator = new Random();
        int randomNumber = generator.nextInt(maxNumber);

        question = "" + randomNumber;
        answer = randomNumber % 2 == 0 ? "yes" : "no";
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
