package flashcards;

import java.util.Scanner;

public class UserInput {

    private final Scanner scanner;

    public UserInput() {
        this.scanner = new Scanner(System.in);
    }

    public String getInput() {
        while (true) {
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("You must enter a value");
                continue;
            }

            return input;
        }
    }

    public void close() {

    }

}
