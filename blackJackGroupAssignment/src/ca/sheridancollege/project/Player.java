/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author dancye, 2018
 */
public class Player 
{
	    public String playerID; //the unique ID for this player
	    private GroupOfCards hand;
	    private int handValue;
	    private String cards;
	    
	    public Player(String name)
	    {
	        playerID= name;
	        hand = new GroupOfCards(2);
	    }
	    

	    public String getPlayerID() 
	    {
	        return playerID;
	    }


	    public void setPlayerID(String givenID)
	    {
	        playerID = givenID;
	    }
	    
	    

	    public String getHand()
		{
			cards = hand.getHandString();
			return cards;
		}
	    public ArrayList<Card> showCards()
	    {
	    	return hand.showCards();
	    }


		public void setHand(GroupOfCards hand) {
			this.hand = hand;
		}


		public int getHandValue() {
			handValue = hand.getHandVal();
			return handValue;
		}


		public void hit()
	    {
	    	hand.addCard();
	    	
	        //option to receive another card from the card class
	    	
	    }
		
    
}
