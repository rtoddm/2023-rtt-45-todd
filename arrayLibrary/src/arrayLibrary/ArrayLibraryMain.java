package arrayLibrary;

public class ArrayLibraryMain {

	public static void main(String[] args) {

		ArrayLibrary al = new ArrayLibrary();
		int[] numbers = new int[10];

		// 1 - initialize the array with numbers from 1 to 10
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}

		al.printArray(numbers, "Default initialization\t");

		// 2 - create a function that will insert a number into the array at a position

		try {
			numbers = al.insertElement(numbers, 40, 11);
			al.printArray(numbers, "After element insert\t");
		} catch (NegativePositionException npe) {
			System.out.println("NEGATIVE POSITION EXCEPTION " + npe.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// this is where you would do cleanup
			// an example of what code goes here is...closing a scanner
			System.out.println("This code will be executed in either case no matter what");
		}
		// append 12 to the end of the array
		numbers = al.append(numbers, 12);
		al.printArray(numbers, "After element append: ");

		numbers = al.deleteElement(numbers, 3);
		al.printArray(numbers, "After delete element");

		int position = al.findPositionOfValue(numbers, 11);
		System.out.println("The position of value 11 is " + position);

	}
}