import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import circle.Circle;
import shape.Shape;
import square.Square;
import triangle.Triangle;

public class AppCollectionRunner {
	
	private static Logger logger = Logger.getLogger(AppCollectionRunner.class.getName());

	public static void main(String[] args) {

		List<Shape> shapes = new ArrayList<>();
		
		Square square = new Square();
		square.setSide(15);
		
		Triangle triangle = new Triangle();
		triangle.setBase(34);
		triangle.setHeight(12);
		
		Circle circle = new Circle();
		circle.setRadius(14);
		
		shapes.add(triangle);
		shapes.add(circle);
		shapes.add(square);
		
		Shape maxShapes = shapes.get(0);
		
		for(int i = 0; i< shapes.size(); i++) {
				if (maxShapes.getArea() >= shapes.get(i).getArea()) {
					
					maxShapes = shapes.get(i);
				}
				
			}
			
		logger.info(String.valueOf(maxShapes));
		
		for(int i = 0; i< shapes.size(); i++) {
			if (maxShapes.getArea() <= shapes.get(i).getArea()) {
				
				maxShapes = shapes.get(i);
			}
			
		}
		
	logger.info(String.valueOf(maxShapes));

		
		}
		
		
//List<Integer> integers = Arrays.asList(12,58,56,58,4,5,6,7,8,9);
//		
//		int max = Integer.MIN_VALUE;
//		for(int i = 0; i<integers.size(); i++) {
//			if(i==0) {
//				continue;
//			}
//			else {
//				if(integers.get(i) >= max) {
//					max = integers.get(i);
//				}
//			}
//		}
//		
//		System.out.println(max);
		
		
	}


