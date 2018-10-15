package shape;

public class Triangle extends AbstractShape {
	
	private int height;
	
	private int base;
	
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
