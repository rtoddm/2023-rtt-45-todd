package arraysPractice;

public class Arrays {

	public static void main(String[] args) {
		
		//array = used to store multiple values in a single variable
		
		//A variable called Car
//		String car = "Camaro";
		
		//Turn that variable into an array
//		String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"};
		
		//Accessing Elements
//		cars[0] = "Mustang";
//		
//		System.out.println(cars[3]);
		
		//Additional way to create an array
		
		String[] cars = new String[3];
		
		cars[0] = "Camaro";
		cars[1] = "Corvette";
		cars[2] = "Tesla";
	
		
//		System.out.println(cars[0]);
		
		
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		
	}
	
}
