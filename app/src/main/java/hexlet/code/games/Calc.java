package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Utils.getRandomInt;

public final class Calc {
    private static final String RULE = "What is the result of the expression?";

    public static void run() {
        final int maxRounds = Engine.getMaxRounds();
        String[][] questions = new String[maxRounds][2];

        for (int i = 0; i < maxRounds; i++) {
            questions[i] = generateQuestion();
        }

        Engine.start(RULE, questions);
    }

    private static String[] generateQuestion() {
        final int maxNumber = 100;
        String[] question = new String[2];
        int number1 = getRandomInt(maxNumber);
        int number2 = getRandomInt(maxNumber);
        char operator = getRandomOperator();

        question[0] = makeExpression(number1, number2, operator);
        question[1] = "" + calcAnswer(number1, number2, operator);

        return question;
    }

    private static char getRandomOperator() {
        char[] operators = {'+', '-', '*'};
        int operatorsLength = operators.length;
        char randomOperator = operators[getRandomInt(operatorsLength)];

        return randomOperator;
    }

    private static String makeExpression(int number1, int number2, char operator) {
        String result = number1 + " " + operator + " " + number2;

        return result;
    }

    private static int calcAnswer(int number1, int number2, char operator) {
        int answer = 0;

        switch (operator) {
            case '+':
                answer = number1 + number2;
                break;
            case '-':
                answer = number1 - number2;
                break;
            case '*':
                answer = number1 * number2;
                break;
            default:
                break;
        }

        return answer;
    }
}
