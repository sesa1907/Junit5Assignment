package finalpackage;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Square Star Pattern Test")
class SquareStarPatternTest {

	@BeforeAll
	public static void beforeAll() {
		System.out.println("Square Start Pattern Test Start...");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("...Square Start Pattern Test Finished");
	}
	
	@Test
	@DisplayName("Testing the value True False output")
	void assertTrueFalseTest() {
		int correctAnswer = 5;
		assertTrue(correctAnswer == createStarPattern(5), "Function not giving expected value");
		assertFalse(correctAnswer != createStarPattern(5), "Function not giving expected value");
	}
	
	@Test
	@DisplayName("Testing the value Equal output")
	void assertEqualTest() {
		int correctAnswer = 5;
		assertEquals(correctAnswer, createStarPattern(5), "Function not giving expected value");
	}
	
	@Test
	@DisplayName("Testing null output")
	void assertNullTest() {
		assertNotNull(createStarPattern(12), "Function giving Null value");
	}
	
	@Test
	@DisplayName("Assume Testing on Developement Environment")
	void onDevelopmnetTest() {
		System.setProperty("ENV", "DEV");
		assumeTrue("DEV".equals(System.getProperty("ENV")));
		// The test is working if in Development Environment
		assertNotNull(createStarPattern(12), "Function giving Null value");
	}
	
	@Test
	@DisplayName("Assume Testing on Production Environment")
	void onProductionTest() {
		System.setProperty("ENV", "PROD");
		assumeTrue("PROD".equals(System.getProperty("ENV")));
		// The test is working if in Production Environment
		assertNotNull(createStarPattern(12), "Function giving Null value");
	}

	static int createStarPattern(int n){	
		int i;
		for(i=0; i<n; i++)
        {

                for(int j=0;j<n;j++)
         
                {
                        System.out.print("*");
                }
              System.out.println();
        }
		System.out.println();
		return i;
	}

}
