package flashcards.entity;

public class Card {

    private final String card;

    private final String definition;

    public Card(String card, String definition) {
        this.card = card;
        this.definition = definition;
    }

    public String getCard() {
        return card;
    }

    public String getDefinition() {
        return definition;
    }

}
