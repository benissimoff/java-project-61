package hexlet.code;

import hexlet.code.games.Game;
import java.util.Scanner;

public class Engine {
    public static void run(Game game) {
        // greet user
        String userName = Greeting.greetUser();
        int correctAnswerCount = 0;
        // print rules
        String rules = game.getRules();
        System.out.println(rules);
        Scanner scanner = new Scanner(System.in);

        while (correctAnswerCount < 3) {
            // make question
            game.generate();
            String question = game.getQuestion();

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");

            // get user answer
            String userAnswer = scanner.nextLine();

            // check user answer
            String correctAnswer = game.getAnswer();
            boolean isCorrectAnswer = correctAnswer.equals(userAnswer);

            if (isCorrectAnswer) {
                System.out.println("Correct!");
                correctAnswerCount++;
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
