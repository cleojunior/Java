public class Card {
    private Suit suit;
    private Rank rank;
    
    public Card(Suit suit, Rank rank) {
        setSuit(suit);
        setRank(rank);
    }
    
    public Suit getSuit() {
        return this.suit;
    }
    
    public void setSuit(Suit suit) {
        this.suit = suit;
    }
    
    public Rank getRank() {
        return this.rank;
    }
    
    public void setRank(Rank rank) {
        this.rank = rank;
    }
    
    public String toString() {
        return getRank() + " of " + getSuit();      
    }
}