package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.getRandomInt;

public final class Progression {
    private static final String RULE = "What number is missing in the progression?";

    public static void run() {
        final int maxRounds = 3;
        String[][] questions = new String[maxRounds][2];

        for (int i = 0; i < maxRounds; i++) {
            questions[i] = generateQuestion();
        }

        Engine.start(RULE, questions);
    }


    private static String[] generateQuestion() {
        final int minLength = 5;
        final int maxLength = 15;
        int progressionLength = getRandomInt(minLength, maxLength);
        int[] elements = new int[progressionLength];

        final int maxStartElement = 30;
        int startElement = getRandomInt(maxStartElement);
        final int maxDelta = 20;
        int delta = getRandomInt(1, maxDelta);
        int secretIndex = getRandomInt(progressionLength);

        String[] question = new String[2];

        String questionTmp = "";

        for (int i = 0; i < progressionLength; i++) {
            elements[i] = startElement + i * delta;
            String item = "..";
            if (secretIndex != i) {
                item = "" + elements[i];
            }

            questionTmp += (i == 0 ? "" : " ") + item;
        }

        question[0] = questionTmp;
        question[1] = "" + elements[secretIndex];

        return question;
    }
}
