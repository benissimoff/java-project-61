package hexlet.code.games;

import java.util.Random;

public final class Progression implements Game {
    private final String rules = "What number is missing in the progression?";
    private String question;
    private String answer;

    public String getRules() {
        return rules;
    }

    public void generate() {
        Random generator = new Random();
        final int minLength = 5;
        final int maxLength = 15;
        int progressionLength = minLength + generator.nextInt(maxLength - minLength);
        int[] elements = new int[progressionLength];
        final int maxZeroElement = 30;
        int n0 = generator.nextInt(maxZeroElement);
        final int maxDelta = 20;
        int delta = 1 + generator.nextInt(maxDelta);
        int secretIndex = generator.nextInt(progressionLength);

        question = "";

        for (int i = 0; i < progressionLength; i++) {
            elements[i] = n0 + i * delta;
            String item = "..";
            if (secretIndex != i) {
                item = "" + elements[i];
            }

            question += (i == 0 ? "" : " ") + item;
        }

        answer = "" + elements[secretIndex];

    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
