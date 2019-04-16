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
		}
		else
		{
			System.out.println("I see");

		}
		
	}
}
