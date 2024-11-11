package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        //System.out.println("Welcome to the Brain Games!");
        String[] games = {"Exit", "Greet", "Even", "Calc"};
        String welcomeString =
                "Please enter the game number and press Enter.\n";
        for (int i = 1; i < games.length; i++) {
            welcomeString += i + " - " + games[i] + "\n";
        }
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
            case "0":
                System.out.println("Bye bye!");
                break;
            default:
                System.out.println("NO THIS WRONGGG!!!11");
                break;
        }

    }
}
