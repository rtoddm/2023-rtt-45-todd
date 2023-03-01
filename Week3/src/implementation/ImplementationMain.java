package implementation;

import java.util.ArrayList;
import java.util.List;

import implementation.AreaCalculation;
import implementation.Shape;
import implementation.Square;
import implementation.Triangle;

public class ImplementationMain {

	// Next feature is to be able to have each shape print its own description

	public static void main(String[] args) {
		
		Square s = new Square();
		s.setShapeName("Square");
		s.setHeight(10);
		s.setLength(5);

		Square s1 = new Square();
		s1.setShapeName("Square1");
		s1.setHeight(7);
		s1.setLength(7);

		Triangle t = new Triangle();
		t.setShapeName("Triangle");
		t.setBase(5);
		t.setHeight(10);

		Triangle t1 = new Triangle();
		t1.setShapeName("Triangle1");
		t1.setBase(7);
		t1.setHeight(4);
		
		Circle c = new Circle();
		c.setShapeName("Circle");
		c.setRadius(5);

		List<Shape> shapes = new ArrayList<>();
		shapes.add(s1);
		shapes.add(t1);
		shapes.add(s);
		shapes.add(t);
		shapes.add(c);

		for (Shape shape : shapes) {
			System.out.println(shape);

//			String name = shape.getShapeName(); // this is inherited from Shape class
//			double area = shape.calculateArea(); // this implementation is mandatory due to the AreaCalculation - this is now defined at the Shape Level
//			System.out.println("The area of a " + name + " is " + area);
			// }

		}
	}

}
