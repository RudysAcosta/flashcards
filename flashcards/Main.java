package flashcards;

public class Main {

    public static void main(String[] args) {
        UserInput userInput = new UserInput();

        System.out.println("Card:");
        String card = userInput.getInput();
        System.out.println(card);

        System.out.println("Definition:");
        String definition = userInput.getInput();
        System.out.println(definition);

    }
}
