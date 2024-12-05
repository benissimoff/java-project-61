package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

import static hexlet.code.Utils.getRandomInt;

public final class Progression {
    private static final String RULE = "What number is missing in the progression?";
    private static final int MIN_PROGRESSION_LENGTH = 5;
    private static final int MAX_PROGRESSION_LENGTH = 15;
    private static final int MAX_PROGRESSION_START_ELEMENT = 30;
    private static final int MAX_PROGRESSION_DELTA = 20;

    public static void run() {
        final int maxRounds = Engine.getMaxRounds();
        String[][] questions = new String[maxRounds][2];

        for (int i = 0; i < maxRounds; i++) {
            questions[i] = generateQuestion();
        }

        Engine.start(RULE, questions);
    }


    private static String[] generateQuestion() {
        int progressionLength = getRandomInt(MIN_PROGRESSION_LENGTH, MAX_PROGRESSION_LENGTH);
        int startElement = getRandomInt(MAX_PROGRESSION_START_ELEMENT);
        int delta = getRandomInt(1, MAX_PROGRESSION_DELTA);

        String[] progression = generateProgression(progressionLength, startElement, delta);

        int secretIndex = getRandomInt(progressionLength);

        String[] question = new String[2];

        question[1] = progression[secretIndex];
        question[0] = makeQuestion(progression, secretIndex);

        return question;
    }

    private static String[] generateProgression(int progressionLength, int start, int delta) {
        String[] elements = new String[progressionLength];

        for (int i = 0; i < progressionLength; i++) {
            elements[i] = Integer.toString(start + i * delta);
        }

        return elements;
    }

    private static String makeQuestion(String[] progression, int secretIndex) {
        int progressionLength = progression.length;
        String[] progressionWithSecret = Arrays.copyOf(progression, progressionLength);
        progressionWithSecret[secretIndex] = "..";
        String question = String.join(" ", progressionWithSecret);

        return question;
    }
}
