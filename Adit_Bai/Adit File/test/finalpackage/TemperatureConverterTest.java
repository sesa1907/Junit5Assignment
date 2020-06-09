package finalpackage;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Temperature Converter Test")
class TemperatureConverterTest {
	
	@BeforeEach
	public void beforeAll() {
		System.out.println("Temperature Converter Test Start...");
	}
	
	@AfterEach
	public void afterAll() {
		System.out.println("...Temperature Converter Test Finished");
	}
	
	@Test
	@DisplayName("Testing the value True False output")
	void assertTrueFalseTest() {
		int correctAnswer = 40;
		assertTrue(correctAnswer == convertToCelsius(104), "Function not giving expected value");
		assertFalse(correctAnswer != convertToCelsius(104), "Function not giving expected value");
	}
	
	@Test
	@DisplayName("Testing the value Equal output")
	void assertEqualTest() {
		int correctAnswer = 40;
		assertEquals(correctAnswer, convertToCelsius(104), "Function not giving expected value");
	}
	
	@Test
	@DisplayName("Testing null output")
	void assertNullTest() {
		assertNotNull(convertToCelsius(32), "Function giving Null value");
	}
	
	@Test
	@DisplayName("Assume Testing on Developement Environment")
	void onDevelopmnetTest() {
		System.setProperty("ENV", "DEV");
		assumeTrue("DEV".equals(System.getProperty("ENV")));
		// The test is working if in Development Environment
		assertNotNull(convertToCelsius(32), "Function giving Null value");
	}
	
	@Test
	@DisplayName("Assume Testing on Production Environment")
	void onProductionTest() {
		System.setProperty("ENV", "PROD");
		assumeTrue("PROD".equals(System.getProperty("ENV")));
		// The test is working if in Production Environment
		assertNotNull(convertToCelsius(32), "Function giving Null value");
	}

	static double convertToCelsius(double f){	
		return  (f-32)*5/9;
	}
}
