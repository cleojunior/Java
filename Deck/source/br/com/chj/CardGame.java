import java.util.*;

public class CardGame {
    private ArrayList<Card> cardList = new ArrayList<Card>();
    
    public static void main(String[] args) {
        Card card; 
        CardGame cardGame = new CardGame();
        cardGame.showCards();
        card = cardGame.getAleatoryCard();
        System.out.println(card);
    }
    
    public CardGame() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cardList.add(new Card(suit, rank));
            }    
        }
    }
    
    public Card getAleatoryCard() {
        int random = (int) (Math.random() * (cardList.size() - 1));
        return cardList.get(random);
    }
    
    public void showCards() {
        for (Card card : cardList) {
            System.out.println(card);
        }
    }
}