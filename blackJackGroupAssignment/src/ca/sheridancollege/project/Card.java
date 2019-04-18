/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the
 * code should remember to add themselves as a modifier.
 * 
 * @author dancye, 2018
 */
public class Card {
	// default modifier for child classes
	private String value;
	private String suit;
	private int intVal;

	// assigns random suit and value
	public Card() {
		int intVal = (int) Math.random() * 13 + 1;
		int suitVal = (int) Math.random() * 4 + 1;

		// sets the suit for the card
		if (suitVal == 1) {
			this.suit = "DIAMONDS";
		} else if (suitVal == 2) {
			this.suit = "HEARTS";
		} else if (suitVal == 3) {
			this.suit = "CLUBS";
		} else {
			this.suit = "SPADES";
		}

		this.intVal = intVal;
		// sets the value for the card
		if (intVal == 1) {
			this.value = "ACE";
		} else if (intVal == 2) {
			this.value = "TWO";
		} else if (intVal == 3) {
			this.value = "THREE";
		} else if (intVal == 4) {
			this.value = "FOUR";
		} else if (intVal == 5) {
			this.value = "FIVE";
		} else if (intVal == 6) {
			this.value = "SIX";
		} else if (intVal == 7) {
			this.value = "SEVEN";
		} else if (intVal == 8) {
			this.value = "EIGHT";
		} else if (intVal == 9) {
			this.value = "NINE";
		} else if (intVal == 10) {
			this.value = "TEN";
		} else if (intVal == 11) {
			this.value = "JACK";
		} else if (intVal == 12) {
			this.value = "QUEEN";
		} else {
			this.value = "KING";
		}

	}

	// assigns specified suit and value
	public Card(int intVal, String suit) {
		this.suit = suit;
		this.intVal = intVal;
		// sets the value for the card
		if (intVal == 1) {
			this.value = "ACE";
		} else if (intVal == 2) {
			this.value = "TWO";
		} else if (intVal == 3) {
			this.value = "THREE";
		} else if (intVal == 4) {
			this.value = "FOUR";
		} else if (intVal == 5) {
			this.value = "FIVE";
		} else if (intVal == 6) {
			this.value = "SIX";
		} else if (intVal == 7) {
			this.value = "SEVEN";
		} else if (intVal == 8) {
			this.value = "EIGHT";
		} else if (intVal == 9) {
			this.value = "NINE";
		} else if (intVal == 10) {
			this.value = "TEN";
		} else if (intVal == 11) {
			this.value = "JACK";
		} else if (intVal == 12) {
			this.value = "QUEEN";
		} else {
			this.value = "KING";
		}
	}

	
	
	public String getValue() {
		return value;
	}

	public String getSuit() {
		return suit;
	}

	public int getIntVal() {
		return intVal;
	}

	/**
	 * Students should implement this method for their specific children classes
	 * 
	 * @return a String representation of a card. Could be an UNO card, a regular
	 *         playing card etc.
	 */

	@Override
	public String toString() {
		return this.value + " " + this.suit;

	}

}
