package hexlet.code;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        //System.out.println("Welcome to the Brain Games!");
        String welcomeString =
                "Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "0 - Exit\n"
                + "Your choice: ";
        System.out.print(welcomeString);
        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.nextLine();
        switch (userAnswer) {
            case "1":
                Greeting.greetUser();
                break;
            case "2":
                GameEven.runGame();
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
