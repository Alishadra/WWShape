package triangle;
import shape.AbstractShape;

public class Triangle extends AbstractShape {
	
	int height;
	
	int base;
	
	public int getArea() {
		
		int area = base * height/2;
		
		return area;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}
	
	

}
