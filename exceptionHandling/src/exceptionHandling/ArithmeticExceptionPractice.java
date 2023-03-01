package exceptionHandling;

public class ArithmeticExceptionPractice extends Throwable {

	public static void main(String[] args) {
		try {	//"Try" this code and see if it creates an exception
			int d = 0;
			int n = 5;
			// code that generates exception
			int divideByZero = n / d;
		} catch (ArithmeticException e) {	//This "Catches" the exception and provides the error along with a message (ArithmaticException e)  
											//about the error
			System.out.println("ArithmeticException occur  => " + e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("This is the finally block"); //This block prints regardless of outcome
		}

	}

}
