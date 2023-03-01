package exceptionHandling;

public class ArrayOutOfBoundsException {

	public static void main(String[] args) {
	       try {
	           String[] st = {"A","B","C","D","E"};
	           st[11] = "X";
	       }
	       catch(ArrayIndexOutOfBoundsException e){

	        System.out.println("index position does not exsist --> " + e.getMessage());
	          // e.printStackTrace();

	       }
	       finally {
	           System.out.println("This is the finally block");
	       }
	   }

	
	
}
