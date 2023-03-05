package examples;

public class Deck {

    public static final int DECK_SIZE = 52; // this is public so that anyone can find out how many cards are in a deck.

    private Card[] cards = new Card[DECK_SIZE];

    public void print() {
        for (int i = 0; i < cards.length; i++) {
            System.out.println(cards[i]);
        }
    }

}

class Card{}
