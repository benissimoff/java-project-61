package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void start(String rule, String[][] questions) {
        final int maxRounds = 3;
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
                return;
            }

            System.out.println("Correct!");
            score++;
            round++;
        }

        System.out.println("Congratulations, " + userName + "!");
    }
}
