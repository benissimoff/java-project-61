package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String[] games = {"Exit", "Greet", "Even", "Calc", "GCD", "Progression", "Prime"};
        String welcomeString = "Welcome to the Brain Games!\n"
            + "Please enter the game number and press Enter.\n";
        for (int i = 1; i < games.length; i++) {
            welcomeString += i + " - " + games[i] + "\n";
        }
        welcomeString += "0 - Exit\n";
        welcomeString += "Your choice: ";
        System.out.print(welcomeString);

        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.nextLine();

        switch (userAnswer) {
            case "1":
                Greeting.greetUser();
                break;
            case "2":
                Even.run();
                break;
            case "3":
                Calc.run();
                break;
            case "4":
                GCD.run();
                break;
            case "5":
                Progression.run();
                break;
            case "6":
                Prime.run();
                break;
            default:
                System.out.println("Bye bye!");
                break;
        }
    }
}
