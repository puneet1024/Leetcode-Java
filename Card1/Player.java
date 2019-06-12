package Card1;

import java.util.ArrayList;
import java.util.List;

public class Player{
    private String name;
    private List<Card> hand;

    public Player(String name) {
        this.name = name;
        hand = new ArrayList<>();
    }

    public String sayHello() {
        return name;
    }

    public List<Card> show() {
        return hand;
    }

    public Card turn() {
        for (int i = hand.size() - 1; i > 0; i--) {
            int rint = (int) (Math.random() * i);
            if (rint == i)
                continue;
            int temp = hand.get(i).faceValue;
            hand.get(i).faceValue = hand.get(rint).faceValue;
            hand.get(rint).faceValue = temp;
        }
        return hand.remove(0);
    }

    public Card draw(Deck deck) {
        Card dealt = deck.deal();
        hand.add(dealt);
        return dealt;
    }

    public static void main(String[] args) {
        System.out.println("*********************** DECK *************************");
        Deck deck = new Deck();
        deck.shuffle();
        deck.show();
        System.out.println("*********************** PLAYER 1 *************************");
        Player player1 = new Player("puneet");
        System.out.println(player1.sayHello());
        for(int i=0;i<5;i++) {
            Card draw = player1.draw(deck);
            System.out.println("Card Drawn by " + player1.sayHello() + " from deck is " + draw.faceValue + " of " + draw.suite);
        }
        System.out.println(player1.show());
        System.out.println(player1.turn().faceValue);
    }
}
