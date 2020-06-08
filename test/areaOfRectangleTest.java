import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class areaOfRectangleTest {
	
	areaOfRectangle areaTest = new areaOfRectangle();

	@Test
	void testArea() {
		assertEquals(24, areaTest.area(6, 4));
	}

}
