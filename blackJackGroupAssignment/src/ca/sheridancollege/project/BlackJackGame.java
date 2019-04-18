package ca.sheridancollege.project;

import java.util.Scanner;

public class BlackJackGame {

	static Game game = new Game();
	public static void main(String []args) {
		Scanner r = new Scanner(System.in);
		String response;
		System.out.print("Do you want to start a game of 21? ");
		response = r.nextLine();

		if (response.equals("yes") || response.equals("Yes"))
		{
			System.out.println("Enter your name");
			String pName1 = r.nextLine();

			game.play(pName1);

			


			


		}
		else
		{
			System.out.println("I see");

		}
		
	}
}
