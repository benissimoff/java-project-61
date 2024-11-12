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
        String welcomeString = "Welcome to the Brain Games!\n"git
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
                Engine.run(new Even());
                break;
            case "3":
                Engine.run(new Calc());
                break;
            case "4":
                Engine.run(new GCD());
                break;
            case "5":
                Engine.run(new Progression());
                break;
            case "6":
                Engine.run(new Prime());
                break;
            default:
                System.out.println("Bye bye!");
                break;
        }
    }
}
