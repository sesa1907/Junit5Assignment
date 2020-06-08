import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactoralTest {
	
	Factoral factTest = new Factoral();

	@Test
	void testFactorial() {
		assertEquals(120, factTest.factorial(5));
	}

}
