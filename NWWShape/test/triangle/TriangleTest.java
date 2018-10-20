package triangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {

	@Test
	public void testGetArea() {

		Triangle triangle = new Triangle();
		
		triangle.base = 3;
		triangle.height = 7;
		
		assertEquals((3*7/2), triangle.getArea());
		
	}

}
