package Card1;

import java.util.ArrayList;
import java.util.List;

class Deck{
    List<Card> cardDeck;
    private static int count = 0;
    public Deck() {
        cardDeck = new ArrayList<>();
        for(int i=1;i<=13;i++) {
            for(Suite suite:Suite.values()) {
                cardDeck.add(new Card(i,suite));
            }
        }
    }

    public void show() {
        for(Card card:cardDeck)
            if (card.faceValue == 11){
                System.out.println("JACK of " + card.suite + " " + count++);
            } else if (card.faceValue == 12) {
                System.out.println("QUEEN of " + card.suite + " " + count++);
            } else if (card.faceValue == 13) {
                System.out.println("KING of " + card.suite + " " + count++ );
            } else if (card.faceValue == 1) {
                System.out.println("ACE of " + card.suite +  " " + count++);
            } else {
                System.out.println(card.faceValue + " of " + card.suite +  " " + count++);
            }
        count =0;
    }

    public void shuffle() {
        for(int i=cardDeck.size()-1;i>0; i--) {
            int rint = (int) (Math.random() * i);
            if (rint == i)
                continue;
            int temp = cardDeck.get(i).faceValue;
            cardDeck.get(i).faceValue = cardDeck.get(rint).faceValue;
            cardDeck.get(rint).faceValue = temp;

        }
    }

    public int deckSize() {
        return cardDeck.size();
    }

    public Card deal() {
        return cardDeck.remove(0);
    }

    public static void main(String[] args) {
        Deck d = new Deck();
//        d.show();
        d.shuffle();
        d.show();
        Card c = d.deal();
        System.out.println("Card removed " + c.faceValue + " of " + c.suite);
        d.shuffle();
        d.show();
        Card x = d.deal();
        System.out.println("Card removed " + x.faceValue + " of " + x.suite);
        System.out.println("cards in deck  " + d.deckSize());
    }
}
