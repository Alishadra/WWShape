package circle;

import shape.AbstractShape;

public class Circle extends AbstractShape {


	int radius;
	
	public int getArea() {
		
		double area = radius * radius * Math.PI;
		
		return (int) area;
	}
	
	public int getRadius() {
		
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	

}
