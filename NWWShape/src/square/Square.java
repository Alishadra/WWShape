package square;

import shape.AbstractShape;

public class Square extends AbstractShape {
	
	public int side;
	
	public int getArea() {
		
		int area = side * side;
		
		return area;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	
}
