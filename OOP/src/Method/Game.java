package Method;

import java.util.Scanner;

class Guseer{
		int guessNumber;
		
		int gussinNumber() {
			System.out.println("Enter the guessNumber...");
			Scanner sc=new Scanner(System.in);
			guessNumber=sc.nextInt();
			return guessNumber;
		}
	}
	
	class Player
	{
		int guessingNumber;
		
		int guessingNumber() 
		{
			System.out.println("Player Enter the number...");
			Scanner sc=new Scanner(System.in);
			guessingNumber= sc.nextInt();
			return guessingNumber;
		}
	}
	
	class Umpire
	{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGusser() 
	{
	
		Guseer g=new Guseer();
		numFromGuesser=g.gussinNumber();
	}
	void collectNumFromPlayer() {
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
		numFromPlayer1=p1.guessingNumber();
		numFromPlayer2=p2.guessingNumber();
		numFromPlayer3=p3.guessingNumber();
	}
	void compare() {
		if(numFromGuesser==numFromPlayer1) 
		{
			
			System.out.println("Player 1 won the game");
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			System.out.println("Player 2 won the game");
		}else if(numFromGuesser==numFromPlayer3) 
		{
			System.out.println("Player 3 won the game");
		}else {
			System.out.print("No one is won try again...");
		}
	}
	}
public class Game {

	public static void main(String[] args) 
	{
	Umpire u=new Umpire();
	u.collectNumFromGusser();
	u.collectNumFromPlayer();
	u.compare();

	}

}
