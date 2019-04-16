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
    private ArrayList<Player> players = new ArrayList<Player>(); // the players of the game
    static Scanner input = new Scanner(System.in);
    public Game()
    {
        //gameName = givenName;
        players = new ArrayList();
    }


    public ArrayList <Player> getPlayers() 
    {
        return players;
    }


    public void setPlayers(ArrayList <Player> players)
    {
        this.players = players;
    }


    public void play()
    {
        String addPlayers = "";
        while (!(addPlayers.equals("stop")))
        {
            System.out.println("What is the player's name?");
            players.add(new Player(input.nextLine()));
            System.out.println("Would you like to add another player? type 'stop' for no, type anything else to continue");
            addPlayers = input.nextLine();

        }
        System.out.println("Players: " );
    }

    public void declareWinner()
    {

    }
   
    
}//end class
