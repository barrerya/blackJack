/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The class that models your game. You should create a more specific
 * child of this class and instantiate the methods given.
 * @author dancye, 2018
 */
public class Game 
{
	//private final String gameName;//the title of the game
    private ArrayList<Player> players; // the players of the game
    private Player user, dealer;
    private String handString = "";
    private boolean gameState = true;

    public Game()
    {
        //gameName = givenName;
        players = new ArrayList();

    }






    public void setPlayers(ArrayList <Player> players)
    {
        this.players = players;
    }
    
    public void addPlayer(String name) {
    	players.add(new Player(name));
    }


    public void play(String playerName)
    {
        Scanner input = new Scanner(System.in);
        user = new Player(playerName);
        dealer = new Player("Dealer");
        players.add(user);
        players.add(dealer);
        System.out.print("Players: ");
        System.out.println(players.get(0).getPlayerID() + ", " + players.get(1).getPlayerID());
        updateHandString();


        do {
            System.out.println("Your hand is: " + handString + " Its point value is: " + players.get(0).getHandValue());
            System.out.println("Do you want to draw a card?");
            String hit = input.nextLine();
            if (hit.equalsIgnoreCase("yes")) {
                players.get(0).hit();
                updateHandString();

            } else {

                gameState = false;
            }
        } while (gameState);
        dealerTurn();

        declareWinner();






    }
    public void dealerTurn()
    {
        while (players.get(1).getHandValue() < 16)
        {
            players.get(1).hit();
        }
    }
    public void declareWinner()
    {
        if (players.get(0).getHandValue() > 21 && players.get(1).getHandValue() < 21)
        {
            System.out.println("You have lost");
        }
        else if (players.get(1).getHandValue() > 21 && players.get(0).getHandValue() < 21)
        {
            System.out.println("You have won");
        }
        else if (players.get(0).getHandValue() == 21)
        {
            System.out.println("You have won");
        }
        else if (players.get(1).getHandValue() > players.get(0).getHandValue())
        {
            System.out.println("Dealer wins");
        }
        else if (players.get(0).getHandValue() > players.get(1).getHandValue())
        {
            System.out.println("You have won");
        }
    }
    public void updateHandString()
    {
       handString = players.get(0).getHand();
    }
   
    
}//end class
