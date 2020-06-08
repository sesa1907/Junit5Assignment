import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PASTangleTest {

	@Test
	void test1() {
		String expectedPyramid = ""
				+ "  q\n"
				+ " qqq\n"
				+ "qqqqq\n";
		String actualPyramid = PASTangle.Pyramid(3, 'q');
//		System.out.print(expectedPyramid);
//		System.out.print(actualPyramid);
		
		assertEquals(expectedPyramid, actualPyramid);
	}
	
	@Test
	void test2() {
		String expectedPyramid = ""
				+ "  m\n"
				+ " mmm\n"
				+ "mmmmm\n";
		String actualPyramid = PASTangle.Pyramid(3, 'm');
//		System.out.print(expectedPyramid);
//		System.out.print(actualPyramid);
		
		assertEquals(expectedPyramid, actualPyramid);
	}
	
	@Test
	void test3() {
		String expectedPyramid = ""
				+ "    *\n"
				+ "   ***\n"
				+ "  *****\n"
				+ " *******\n"
				+ "*********\n";
		String actualPyramid = PASTangle.Pyramid(5, '*');
//		System.out.print(expectedPyramid);
//		System.out.print(actualPyramid);
		
		assertEquals(expectedPyramid, actualPyramid);
	}
	
	@Test
	void test4() {
		String expectedPyramid = "";
		String actualPyramid = PASTangle.Pyramid(0, 'H');
//		System.out.print(expectedPyramid);
//		System.out.print(actualPyramid);
		
		assertEquals(expectedPyramid, actualPyramid);
	}
	
	@Test
	void test5() {
		String expectedPyramid = " \n";
		String actualPyramid = PASTangle.Pyramid(1, ' ');
//		System.out.print(expectedPyramid);
//		System.out.print(actualPyramid);
		
		assertEquals(expectedPyramid, actualPyramid);
	}

}
