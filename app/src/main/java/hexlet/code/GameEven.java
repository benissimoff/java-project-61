package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class GameEven {
    public static void runGame() {
        final int maxNumber = 100;
        String userName = Greeting.greetUser();
        int correctAnswerCount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (correctAnswerCount < 3) {
            Random generator = new Random();
            int randomNumber = generator.nextInt(maxNumber);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String correctAnswer = randomNumber % 2 == 0 ? "yes" : "no";
            String userAnswer = scanner.nextLine();

            if (correctAnswer.equals(userAnswer)) {
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
