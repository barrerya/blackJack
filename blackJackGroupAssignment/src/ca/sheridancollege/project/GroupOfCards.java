/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 */
public class GroupOfCards 
{
   
    //The group of cards, stored in an ArrayList
    private ArrayList <Card> cards;
    private int size;//the size of the grouping
    private int handVal;
    private String handString = "";
    
    public GroupOfCards(int givenSize)
    {
        cards = new ArrayList<>();
        for (int x = 0 ; x < givenSize; x++) {
            cards.add(new Card());
        }
        handVal = 0;
    	size = givenSize;
    }
    
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public ArrayList<Card> showCards()
    {
        return cards;
    }
    
    

    public int getHandVal() {
        handVal = 0;
    	for (int x = 0 ; x < size; x++) {
    		handVal += cards.get(x).getIntVal();
    	}
		return handVal;
	}
	public String getHandString()
    {
        handString = "";
        for (int x = 0 ; x < size; x++) {
            handString = (handString + cards.get(x).toString());
        }

        return handString;
    }

	/**
     * @return the size of the group of cards
     */
    public int getSize()
    {
        return size;
    }


    
    public void addCard() {
    	size++;
    	this.cards.add(new Card());
    }
    
}//end class
