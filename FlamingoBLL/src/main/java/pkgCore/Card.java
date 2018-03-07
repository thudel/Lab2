package pkgCore;
import pkgEnum.*;
public class Card implements Comparable {

	//	TODO: Card has two attributes, eRank and eSuit, add these attributes
	private eRank eRank;
	private eSuit eSuit;
	
	//	TODO: Build a constructor for Card passing in eRank and eSuit
	public Card (eRank eRank, eSuit eSuit) {
		
		this.eRank = eRank;
		this.eSuit = eSuit;
		
	}
	public Card(eSuit eSuit, eRank eRank) {
		
		this.eRank = eRank;
		this.eSuit = eSuit;
	}
	//	TODO: Add a public 'getter' method for eRank and eSuit.  
	//			Add a private 'setter' method for eRank and eSuit
	
	public 
	
	@Override
	public int compareTo(Object arg0) {
		Card c1 = (Card)arg0;
		if (this.geteRank().getiCardValue() - c1.geteRank().getiCardValue())
			return this.geteRank().getiCardValue() - c1.geteRank().getiCardValue();
		//return c.geteRank().compareTo(this.geteRank());

}
	
}
