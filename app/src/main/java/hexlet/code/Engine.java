package hexlet.code;

import hexlet.code.games.Game;
import java.util.Scanner;

public class Engine {
    public static void run(Game game) {
        final int maxRounds = 3;
        String userName = Greeting.greetUser();
        int score = 0;
        String rules = game.getRules();
        System.out.println(rules);
        Scanner scanner = new Scanner(System.in);

        while (score < maxRounds) {
            game.generate();

            String question = game.getQuestion();
            System.out.println("Question: " + question);

            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();
            String correctAnswer = game.getAnswer();
            boolean isCorrectAnswer = correctAnswer.equals(userAnswer);

            if (isCorrectAnswer) {
                System.out.println("Correct!");
                score++;
            } else {
                String message = "'" + userAnswer + "' is wrong answer ;(. "
                        + "Correct answer was '" + correctAnswer + "'.\n"
                        + "Let's try again, " + userName + "!\n";
                System.out.println(message);
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }

    public static void start(String rule, String[][] questions) {
        final int maxRounds = 3;
        String userName = Greeting.greetUser();
        int round = 0;
        int score = 0;
        System.out.println(rule);
        Scanner scanner = new Scanner(System.in);

        while (round < maxRounds) {
//            game.generate();

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
