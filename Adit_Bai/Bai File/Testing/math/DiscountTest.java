package math;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DiscountTest {
	
	Discount discountTest = new Discount(); 
	
	@BeforeEach
	public void beforeAll() {
		System.out.println("Discount Test Start...");
	}
	
	@AfterEach
	public void afterAll() {
		System.out.println("...Discount Test Finished");
	}
	
	
	@Test
	@DisplayName("Testing the value output")
	void assertTrueFalse() {
		int correctAnswer = 700;
		assertTrue(correctAnswer == discountTest.count(1000, 30));
		assertFalse(correctAnswer != discountTest.count(1000, 30));
	}

	@Test
	@DisplayName("Testing the value output")
	void testDiscount() {
		int expected = 700;
		int actual = discountTest.count(1000, 30);
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Assume Testing on Development Environment")
	void onDevelopmentTest() {
		System.setProperty("ENV", "DEV");
		assumeTrue("DEV".equals(System.getProperty("ENV")));
		// Test if is working if in Development Environment
		int expected = 700;
		int actual = discountTest.count(1000, 30);
		assertEquals(expected, actual);
	}

}
