package rockPaperScissors;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.hamcrest.MatcherAssert.assertThat;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class GameTest {
	
	private static Game rps;


	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		rps = new Game();
		//Call rps to instantiate array list
		Game.rps();
	}

	@Test
	@Order(1)
	void rps_GivenNoParam_ConstructsObj() {
		assertTrue(rps instanceof Game);
	}
	
	@Test
	@Order(2)
	void rps_GivenNoParam_CreatesArrayListOfResponses() {
		assertThat(Game.responses, containsInAnyOrder("rock","paper","scissors"));
	}
	
	@Test
	@Order(3)
	void prompt_GivenNoParam_AcceptsInput_ReturnsString()
	{
		System.out.println("testing user input:");
		assertNotNull(rps.prompt());
	}
	
	@Test
	@Order(4)
	void random_GivenNoParam_ReturnsRandomIntZeroToThree() {
		int random = rps.getRandom();
	    assertThat(random, allOf(greaterThan(-1), lessThan(4)));
	}
	
	@Test
	@Order(5)
	void getWinner_GivenTwoParams_ReturnsBool() {
		String string1 = "scissors";
		String string2 = "rock";
		assertFalse(rps.getWinner(string1, string2));
		System.out.println(rps.getWinner(string1, string2));
		assertTrue(rps.getWinner(string2, string1));
		System.out.println(rps.getWinner(string2, string1));
		
	}
	
	@Test
	@Order(6)
	void shoot_GivenNoParam_ReturnsRandomItemFromArray() {
		String response = rps.shoot();
		assertTrue(Game.responses.contains((response)));
	}
	
	@Test
	@Order(7)
	void checkTie_GivenTwoParams_ReturnsBool() {
		String string1 = "rock";
		String string2 = "scissors";
		assertFalse(rps.checkTie(string1, string2));
		assertTrue(rps.checkTie(string1,string1));
	}
	
	@Test
	@Order(8)
	void runGame_GivenUserInput_PlayerWins() {
		//Good Luck!!
		System.out.println("Please input: rock, paper, scissors");
		String game = rps.runGame(rps.prompt(), rps.shoot());
		assertEquals("win", game);
	}
	
	

}
