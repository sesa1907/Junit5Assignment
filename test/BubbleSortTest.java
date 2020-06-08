import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BubbleSortTest {
	
	@Test
	void test1() {
		int arrTest[] = {1, 3, 2};
		
		int sortedArr[] = BubbleSort.Sort(arrTest);
		
		assertEquals(1, sortedArr[0]);
		assertEquals(2, sortedArr[1]);
		assertEquals(3, sortedArr[2]);
	}
	
	@Test
	void test2() {
		int arrTest[] = {0, 0, -8, 3};
		int sortedArr[] = BubbleSort.Sort(arrTest);
		
		assertEquals(-8, sortedArr[0]);
		assertEquals(0, sortedArr[1]);
		assertEquals(0, sortedArr[2]);
		assertEquals(3, sortedArr[3]);

	}
	
	@Test
	void test3() {
		int arrTest[] = {1};
		int sortedArr[] = BubbleSort.Sort(arrTest);
		
		assertEquals(1, sortedArr[0]);

	}

}
