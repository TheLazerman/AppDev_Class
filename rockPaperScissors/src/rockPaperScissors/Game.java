package rockPaperScissors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BooleanSupplier;


public class Game { //POJO - Plain ole Java Object

	private static String input;
	public static List<String> responses;

	static Scanner sc = new Scanner(System.in);
	
	public static void rps() {
		responses = new ArrayList<String>() {{ add("rock"); add("paper"); add("scissors");}};
		
	}

	public String prompt() {
		input = sc.next();
		return Game.input;
	}

	
	//Once, Twice, shoot
	public String shoot() {
		int random = getRandom();
		String ourChoice = responses.get(random);
		return ourChoice;
	}

	//Return random int from 0 to 2
	public int getRandom() {
		return (int) (Math.random()*3);
	}
	
	//Test for a winner
	public Boolean getWinner(String input, String ourChoice) {
		//true if user wins
		//false if we win
		switch(input) {
		case "rock":
			switch(ourChoice) {
			case "paper":
				return false;
			case "scissors":
				return true;
			}
		case "paper":
			switch(ourChoice) {
			case "rock":
				return true;
			case "scissors":
				return false;
			}
		case "scissors":
			switch(ourChoice) {
			case "paper":
				return true;
			case "rock":
				return false;
			}
		}
		return null;
	}
	

	public Boolean checkTie(String string1, String string2) {
		if(string1.equals(string2)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String runGame(String prompt, String shoot) {
		System.out.println(shoot);
		if(checkTie(prompt, shoot)) {
			System.out.println("It's a Tie!");
			return "tie";
		}
		else if(getWinner(prompt, shoot)){
			System.out.println("You Win!");
			return "win";
		}else {
			System.out.println("You lose.");
			return "lose";
		}
	}
	
	

}
