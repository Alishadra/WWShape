package square;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import square.Square;

class SquareTest {

	@Test
	void testGetArea() {

		Square square = new Square();
		
		square.side = 25;
	
		assertEquals((25 * 25), square.getArea());
	}

}
