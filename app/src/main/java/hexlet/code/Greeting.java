package hexlet.code;

import java.util.Scanner;

public class Greeting {
    public static String greetUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        return userName;
    }
}
