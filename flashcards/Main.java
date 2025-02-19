package flashcards;

import flashcards.entity.Card;

public class Main {

    public static void main(String[] args) {
        UserInput userInput = new UserInput();

        String cardInput = userInput.getInput();
        String definition = userInput.getInput();

        Card card = new Card(cardInput, definition);
        String answer = userInput.getInput();

        if (answer.equals(card.getDefinition())) {
            System.out.println("Your answer is right!");
        } else {
            System.out.println("Your answer is wrong...");
        }
    }
}
