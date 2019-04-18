/*
 * Joshua Clark
 * 991516472
 * SYST10199 - Web Programming
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cyber
 */
public class GameTest {
    
    public GameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setPlayers method, of class Game.
     */
    @Test
    public void testSetPlayersGood() {
        System.out.println("setPlayers");
        ArrayList<Player> players = null;
        Game instance = new Game();
        instance.setPlayers(players);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testSetPlayersBad() {
        System.out.println("setPlayers");
        ArrayList<Player> players = null;
        Game instance = new Game();
        instance.setPlayers(players);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testSetPlayersBoundary() {
        System.out.println("setPlayers");
        ArrayList<Player> players = null;
        Game instance = new Game();
        instance.setPlayers(players);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of addPlayer method, of class Game.
     */
    @Test
    public void testAddPlayer() {
        System.out.println("addPlayer");
        String name = "";
        Game instance = new Game();
        instance.addPlayer(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of play method, of class Game.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        String playerName = "";
        Game instance = new Game();
        instance.play(playerName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of dealerTurn method, of class Game.
     */
    @Test
    public void testDealerTurn() {
        System.out.println("dealerTurn");
        Game instance = new Game();
        instance.dealerTurn();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of declareWinner method, of class Game.
     */
    @Test
    public void testDeclareWinner() {
        System.out.println("declareWinner");
        Game instance = new Game();
        instance.declareWinner();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateHandString method, of class Game.
     */
    @Test
    public void testUpdateHandString() {
        System.out.println("updateHandString");
        Game instance = new Game();
        instance.updateHandString();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
