package ca.sheridancollege.project;

import java.util.Scanner;

public class BlackJackGame {

	Game curentGame = new Game();
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		String response;
		System.out.print("Do you want to start a game of 21? ");
		response = input.nextLine();
		
		if (response.equals("yes") || response.equals("Yes"))
		{
			
			curentGame.play();

			//Player
			Player player = new Player("DangItRonPaul");
			

			//Dealer
			Player dealer = new Player("Mr.Singleton");
			


			//condition to ask if card value goes above 21 at the end of the game
			if (cards >=21)
			{
				System.out.println("Do you want to draw another card?");
				String draw = in.nextLine();

				if(draw.equalsIgnoreCase("yes"))
				{
					Card drawCard = new Card();
				}


			}


		}
		else
		{
			System.out.println("I see");

		}
		
	}
}
