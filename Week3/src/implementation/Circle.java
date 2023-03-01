package implementation;

public class Circle extends Shape {
	//PI * r * r
	
	private static final double PI = 3.14159;
	
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	} 
	
	//this method is forced by the interface on the Shape class
	@Override
	public double calculateArea() {
		double area = PI * radius * radius;
		return area;
	}
	
	
}
