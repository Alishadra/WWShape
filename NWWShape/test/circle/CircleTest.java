package circle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest {

	@Test
	public void testGetArea() {

		Circle circle = new Circle();
		
		circle.radius = 10;
		
		assertEquals((int)(3.14 * 10 *10), circle.getArea());
	
	}

}
