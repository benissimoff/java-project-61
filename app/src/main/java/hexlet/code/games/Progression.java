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
        int progressionLength = 5 + generator.nextInt(10);
        int[] elements = new int[progressionLength];
        int n0 = generator.nextInt(30);
        int delta = 1 + generator.nextInt(20);
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
