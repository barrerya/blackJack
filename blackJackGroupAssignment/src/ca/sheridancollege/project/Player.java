/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author dancye, 2018
 */
public class Player 
{
	 public static String playerID; //the unique ID for this player
	    GroupOfCards hand;
	    int handValue;
	    
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
	    
	    

	    public GroupOfCards getHand() {
			return hand;
		}


		public void setHand(GroupOfCards hand) {
			this.hand = hand;
		}
		
		


		public void hit()
	    {
	    	hand.addCard();
	    	
	        //option to receive another card from the card class
	    	
	    }
		
    
}
