package rockPaperScissors;

import java.util.ArrayList;
import java.util.List;


public class Game { //POJO - Plain ole Java Object

	private String input;
	private List<String> responses;
	
	public void rps() {
		this.input = null;
		responses = new ArrayList<String>() {{ add("Rock"); add("Papper"); add("Scissors");}};
		
		
		
	}
	
	
	public String getInput() {
		return this.input;
	}


	public boolean prompt(String input) {
		if(input instanceof String) {
			this.input = input;
			return true;
		}
		else {
			return false;
		}
	}


	public String shoot() {
		return "Rock";
	}
	
	

}
