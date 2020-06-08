import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RevNumTest {
	
	RevNum revTest = new RevNum();

	@Test
	void testRev() {
		assertEquals(41, revTest.revNum(14));
	}

}
