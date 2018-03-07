package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	//	TODO: Add 'cards' attribute that is an ArrayList of Card
	private ArrayList<Card> DeckCards = new ArrayList<Card>(100);
	
	//	TODO: Add a contructor that passes in the number of decks, and then populates
	//			ArrayList<Card> with cards (depending on number of decks).
	public Deck() {
		
		for(eSuit eSuit: eSuit.values()) {
			for(eRank eRank: eRank.values()) {
				DeckCards.add(new Card(eRank,eSuit));
			}
		}
		Collections.shuffle(DeckCards);
		
		for(Card c: DeckCards) {
			System.out.printf(c.geteSuit());
			System.out.print(' ');
			System.out.printf(c.geteRank());
		}
		
	}
	//			Example: Deck(1) will build one 52-card deck.  There are 52 different cards
	//			2 clubs, 3 clubs... Ace clubs, 2 hearts, 3 hearts... Ace hearts, etc
	
	//			Deck(2) will create an array of 104 cards.
	
	
	//	TODO: Add a draw() method that will take a card from the deck and
	//			return it to the caller
	
	public Card draw() throws Exception {
		
		if(DeckCards.size() == 0) {
			throw new Exception("Empty Deck");
		}
		return DeckCards.remove(0);
		
	}
}
