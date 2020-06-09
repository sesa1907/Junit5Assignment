import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DecimalToBinaryTest {

	@BeforeEach
	void before() {
		System.out.print("before test 5\n");
	}
	
	@Test
	void test1() {
		String binary = DecimalToBinary.Binary1(54);

		assertEquals("110110", binary);
	}
	
	@Test
	void test2() {
		String binary = DecimalToBinary.Binary2(1);

		assertEquals("1", binary);
	}
	
	@Test
	void test3() {
		String binary = DecimalToBinary.Binary2(15);

		assertEquals("1111", binary);
	}
	
	@AfterEach
	void after() {
		System.out.print("before test 5\n\n");
	}

}
