package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int MAX_ROUNDS = 3;

    public static int getMaxRounds() {
        return MAX_ROUNDS;
    }

    public static void start(String rule, String[][] questions) {
        final int maxRounds = questions.length;
        String userName = Greeting.greetUser();
        int round = 0;
        int score = 0;
        System.out.println(rule);
        Scanner scanner = new Scanner(System.in);

        while (round < maxRounds) {
            String question = questions[round][0];
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();
            String correctAnswer = questions[round][1];
            boolean isCorrectAnswer = correctAnswer.equals(userAnswer);

            if (!isCorrectAnswer) {
                String message = "'" + userAnswer + "' is wrong answer ;(. "
                        + "Correct answer was '" + correctAnswer + "'.\n"
                        + "Let's try again, " + userName + "!\n";
                System.out.println(message);
                scanner.close();
                return;
            }

            System.out.println("Correct!");
            score++;
            round++;
        }

        scanner.close();
        System.out.println("Congratulations, " + userName + "!");
    }
}
