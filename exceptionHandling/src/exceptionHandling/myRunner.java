package exceptionHandling;

public class myRunner {

	public static void main(String args[]) {
		
		try {
			// this try block calls the above method to handle the exception
			Example_Throw obj = new Example_Throw();
			obj.testMethod(1);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}