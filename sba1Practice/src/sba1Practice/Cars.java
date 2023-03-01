package sba1Practice;

public class Cars {

	String color;
	int numberOfDoors;
	String model;
	
	//Constructor
	Cars(String color, int numberOfDoors, String model){
		this.color = color;
		this.numberOfDoors = numberOfDoors;
		this.model = model;
	}
	
	
	
	public static void main(String[] args) {
		
		String col = "blue";
		int numberOfDoors = 4;
		String model = "mustang"; 
		
		Cars toddsCar = new Cars(col, numberOfDoors, model);
		System.out.println(toddsCar.color);
		
		Cars honda = new Cars("green", 5, "accord");
		
		Cars tesla = new Cars("black", 6, "modelY");
		System.out.println(tesla.model);
	}
}
