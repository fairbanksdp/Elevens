/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
    String[] tempRank = {"Ace","10","4"};
    String[] tempSuit = {"Hearts","Clubs","Spades"};
    int[] tempVal = {1,10,4};
    Deck deck1 = new Deck(tempRank,tempSuit,tempVal);
    Deck deck2 = new Deck(tempRank,tempSuit,tempVal);
    Deck deck3 = new Deck(tempRank,tempSuit,tempVal);
    
    System.out.println(deck1.isEmpty());
    System.out.println(deck2.isEmpty());
    System.out.println(deck3.isEmpty());
    System.out.println(deck1.size());
    System.out.println(deck2.size());
    System.out.println(deck3.size());
    System.out.println(deck1.deal());
    System.out.println(deck2.deal());
    System.out.println(deck3.deal());
	}
}
