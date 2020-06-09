package math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assumptions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

class AreaRectangleTest {

	AreaRectangle arearectangleTest = new AreaRectangle();
	
	@BeforeEach
	public void beforeAll() {
		System.out.println("Area Rectangle Test Start...");
	}
	
	@AfterEach
	public void afterAll() {
		System.out.println("...Area Rectangle Test Finished");
	}
	
	@Test
	@DisplayName("Testing the value output")
	void assertTrueFalse() {
		int correctAnswer = 6;
		assertTrue(correctAnswer == arearectangleTest.area(2, 3));
		assertFalse(correctAnswer != arearectangleTest.area(2, 3));
	}

	@Test
	@DisplayName("Testing the value output")
	void testAdd() {
		int expected = 6;
		int actual = arearectangleTest.area(2, 3);
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Assume Testing on Development Environment")
	void onDevelopmentTest() {
		System.setProperty("ENV", "DEV");
		assumeTrue("DEV".equals(System.getProperty("ENV")));
		// Test if is working if in Development Environment
		int expected = 6;
		int actual = arearectangleTest.area(2, 3);
		assertEquals(expected, actual);
	}

}
