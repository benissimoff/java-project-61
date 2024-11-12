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
}
