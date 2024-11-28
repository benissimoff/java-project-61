package hexlet.code.games;


import hexlet.code.Engine;

import static hexlet.code.Utils.getRandomInt;

public final class Calc {
    private static final String RULE = "What is the result of the expression?";

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
        // make question
        int randomNumber1 = getRandomInt(maxNumber);
        int randomNumber2 = getRandomInt(maxNumber);
        String[] operations = {"+", "-", "*"};
        int operationsLength = operations.length;
        String randomOperation = operations[getRandomInt(operationsLength)];
        question[0] = randomNumber1 + " " + randomOperation + " " + randomNumber2;

        // make correct answer
        int correctAnswer;
        switch (randomOperation) {
            case "+":
                correctAnswer = randomNumber1 + randomNumber2;
                break;
            case "-":
                correctAnswer = randomNumber1 - randomNumber2;
                break;
            case "*":
                correctAnswer = randomNumber1 * randomNumber2;
                break;
            default:
                correctAnswer = 0;
                break;
        }

        question[1] = "" + correctAnswer;

        return question;
    }
}
