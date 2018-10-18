
import java.io.File;
import java.io.PrintStream;
import java.util.logging.Logger;

import org.omg.CORBA.LocalObject;

import circle.Circle;
import square.Square;
import triangle.Triangle;

public class AppRunner {

	public static void main(String[] args) {

		Square square = new Square();
		square.setSide(15);
		
		System.setErr(new PrintStream(new File("log.txt")));
		System.err.println("" + square.getArea());
		try {
		     throw new Exception("error");
		} catch (Exception e) {
		     e.printStackTrace();
		
//		Logger log = Logger.getLogger(AppRunner.class.getName());
//		log.info("" + square.getArea());
		
		Triangle triangle = new Triangle();
		triangle.setBase(34);
		triangle.setHeight(12);
		
		Logger log1 = Logger.getLogger(AppRunner.class.getName());
		log.info("" + triangle.getArea());
		
		Circle circle = new Circle();
		circle.setRadius(14);
		
		Logger log2 = Logger.getLogger(AppRunner.class.getName());
		log.info("" + circle.getArea());
		
		
	}

}
