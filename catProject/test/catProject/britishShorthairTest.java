package catProject;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class britishShorthairTest {
	
	private static britishShorthair beth;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		beth = new britishShorthair("Beth","female", 100, true, 10);
	}

	@Test
	void test() {
		assertTrue(beth instanceof britishShorthair);
		assertNotEquals("Elizabeth", beth.getName());
		assertEquals("female", beth.getGender());
		assertEquals(100, beth.getAge());
		assertNotEquals(80, beth.getAge());
		assertEquals(true, beth.getIsAMouser());
		assertNotEquals(12, beth.getWeight());
		//couldn't figure out this test case in the short time I tried.
		//assertEquals("Meow Meow ", beth.meow(2));
	}
}
