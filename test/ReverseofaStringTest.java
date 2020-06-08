import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseofaStringTest {
	
	ReverseofaString reverseTest = new ReverseofaString();

	@Test
	void testReverse() {
		assertEquals("nanda", reverseTest.reverseString("adnan"));
	}

}
