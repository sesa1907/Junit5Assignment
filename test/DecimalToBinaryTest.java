import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DecimalToBinaryTest {

	@Test
	void test1() {
		String binary = DecimalToBinary.Binary1(54);

		assertEquals("110110", binary);
	}
	
	@Test
	void test2() {
		String binary = DecimalToBinary.Binary1(16);

		assertEquals("10000", binary);
	}
	
	@Test
	void test3() {
		String binary = DecimalToBinary.Binary2(15);

		assertEquals("1111", binary);
	}

}
