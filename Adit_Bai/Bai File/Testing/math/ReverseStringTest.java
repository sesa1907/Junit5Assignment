package math;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ReverseStringTest {
	
	ReverseString reverseString = new ReverseString();
	
	@BeforeEach
	public void beforeAll() {
		System.out.println("ReverseString Test Start...");
	}
	
	@AfterEach
	public void afterAll() {
		System.out.println("...ReverseString Test Finished");
	}
	
	@Test
	@DisplayName("Testing the value output")
	void assertTrueFalse() {
		String correctString = "Baihaqi";
		System.out.println(correctString);
		System.out.println(reverseString.reverse("Baihaqi"));
//		assertTrue("Baihaqi" == "Baihaqi");
		assertTrue(correctString == reverseString.reverse("iqahiaB"));
//		assertFalse(correctString != reverseString.reverse("iqahiaB"));
	}
	
	@Test
	@DisplayName("Testing the value output")
	void testReverseString() {
		String expected = "Baihaqi";
		String actual = reverseString.reverse("iqahiaB"); 
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Assume Testing on Development Environment")
	void onDevelopmentTest() {
		System.setProperty("ENV", "DEV");
		assumeTrue("DEV".equals(System.getProperty("ENV")));
		// Test if is working if in Development Environment
		String expected = "Baihaqi";
		String actual = reverseString.reverse("iqahiaB"); 
		assertEquals(expected, actual);
	}

}