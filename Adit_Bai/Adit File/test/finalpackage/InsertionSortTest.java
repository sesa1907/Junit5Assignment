package finalpackage;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Sort Test")
class InsertionSortTest {
	
	@BeforeEach
	public void beforeAll() {
		System.out.println("Sort Test Start...");
	}
	
	@AfterEach
	public void afterAll() {
		System.out.println("...Sort Test Finished");
	}
	
	@Test
	@DisplayName("Testing the value True False output")
	void assertTrueFalseTest() {
		int correctAnswer = 1;
		assertTrue(correctAnswer == InsertionSort(), "Function not sorting array");
		assertFalse(correctAnswer != InsertionSort(), "Function not sorting array");
	}
	
	@Test
	@DisplayName("Testing null output")
	void assertNullTest() {
		assertNotNull(InsertionSort(), "Function giving Null value");
	}
	
	@Test
	@DisplayName("Testing array Equal output")
	void assertArrayEqualsTest() {
		int[] correctAnswer = {1,2,3,4,5};
		assertArrayEquals(correctAnswer, InsertionArraySort(), "Array are not equal");
	}
	
	@Test
	@DisplayName("Assume Testing on Developement Environment")
	void onDevelopmnetTest() {
		System.setProperty("ENV", "DEV");
		assumeTrue("DEV".equals(System.getProperty("ENV")));
		// The test is working if in Development Environment
		int[] correctAnswer = {1,2,3,4,5};
		assertArrayEquals(correctAnswer, InsertionArraySort(), "Array are not equal");
	}
	
	@Test
	@DisplayName("Assume Testing on Production Environment")
	void onProductionTest() {
		System.setProperty("ENV", "PROD");
		assumeTrue("PROD".equals(System.getProperty("ENV")));
		// The test is working if in Production Environment
		int[] correctAnswer = {1,2,3,4,5};
		assertArrayEquals(correctAnswer, InsertionArraySort(), "Array are not equal");
	}

	static int InsertionSort() {
		int a[] = {5,3,1,2,4};
		int n=a.length,i,j,temp;
		for (i = 1;i < n; i++){ 
			for (j=i-1; j >=0 && a[j+1]<a[j]; j--){ 
				temp=a[j+1];
				a[j+1]=a[j];
				a[j]=temp;
			}
		}
		return a[0];
	}
	
	static int[] InsertionArraySort() {
		int a[] = {5,3,1,2,4};
		int n=a.length,i,j,temp;
		for (i = 1;i < n; i++){ 
			for (j=i-1; j >=0 && a[j+1]<a[j]; j--){ 
				temp=a[j+1];
				a[j+1]=a[j];
				a[j]=temp;
			}
		}
		return a;
	}
}