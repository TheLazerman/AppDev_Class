package rockPaperScissors;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class GameTest {
	
	private static Game rps;


	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		rps = new Game();
	}

	@Test
	@Order(1)
	void rps_GivenNoParam_ConstructsObj() {
		assertTrue(rps instanceof Game);
	}
	
	@Test
	@Order(2)
	void promptChoice_GivenString_ReturnsTrue() {
		boolean sucess = false;
		String input = "rock";
		sucess = rps.prompt(input);
		assertTrue(sucess);
		assertEquals(input, rps.getInput());
	}
	
	@Test
	@Order(3)
	void shoot_GivenNoParam_ReturnsResponse() {
		String response = null;
		response = rps.shoot();
		assertEquals("Rock", response);
	}

}
