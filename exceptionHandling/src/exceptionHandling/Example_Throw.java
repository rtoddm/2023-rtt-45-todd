package exceptionHandling;

import java.io.*;

public class Example_Throw {

	//declare exception using throws in the method signature
	   public void testMethod(int num) throws IOException, ArithmeticException{
	       if(num==1)
	           throw new IOException("IOException Occurred");
	       else
	           throw new ArithmeticException("ArithmeticException");
	   }

	
}
