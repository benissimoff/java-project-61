package hexlet.code.games;

import java.util.Random;

public final class Calc implements Game {
    private final String rules = "What is the result of the expression?";
    private String question;
    private String answer;

    public String getRules() {
        return rules;
    }

    public void generate() {
        final int maxNumber = 100;

        // make question
        Random generator = new Random();
        int randomNumber1 = generator.nextInt(maxNumber);
        int randomNumber2 = generator.nextInt(maxNumber);
        String[] operations = {"+", "-", "*"};
        int operationsLength = operations.length;
        String randomOperation = operations[generator.nextInt(operationsLength)];
        question = randomNumber1 + " " + randomOperation + " " + randomNumber2;

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

        answer = "" + correctAnswer;

    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
