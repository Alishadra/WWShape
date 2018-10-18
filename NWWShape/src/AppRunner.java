
import java.util.logging.Logger;


import circle.Circle;
import square.Square;
import triangle.Triangle;

public class AppRunner {

	private static Logger logger = Logger.getLogger(AppRunner.class.getName());
	
	public static void main(String[] args) {

		Square square = new Square();
		square.setSide(15);
		
		logger.info(String.valueOf(square.getArea()));
		
		
		Triangle triangle = new Triangle();
		triangle.setBase(34);
		triangle.setHeight(12);
		
		logger.info(String.valueOf(triangle.getArea()));
		
		Circle circle = new Circle();
		circle.setRadius(14);
		
		logger.info(String.valueOf(circle.getArea()));
		
		
	}

}
