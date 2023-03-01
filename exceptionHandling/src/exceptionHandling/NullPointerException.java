package exceptionHandling;

public class NullPointerException extends Throwable {

	public static void main(String[] args) {
	       try {
	           String s = null;
	           s.length();
	       } catch (NullPointerException e) {
	           System.out.println("Exception caught:String length is Zero " + e);
	       } finally {
	           System.out.println("finally block us always execute");
	       }
	   }

}
