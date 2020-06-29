package catProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class persianCatTest {

	private static persianCat liam;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		liam = new persianCat("Liam","male", 3, true, 8);
	}

	@Test
	void test() {
		assertTrue(liam instanceof persianCat);
		assertEquals("Liam", liam.getName());
		assertEquals("male", liam.getGender());
		assertEquals(3, liam.getAge());
		assertNotEquals(80, liam.getAge());
		assertEquals(true, liam.getIsAMouser());
		assertNotEquals(9, liam.getWeight());
	}

}
