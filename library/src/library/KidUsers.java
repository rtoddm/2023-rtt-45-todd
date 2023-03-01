package library;

public class KidUsers implements LibraryUser {

	int age;
	String bookType;

	public void setAge(int age) {
		this.age = age;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	
	@Override
	public void registerAccount() {
		if (age <= 11) {
			System.out.println("KidUser: You have successfully registered under a Kids Account.");
		} else if (age > 11) {
			System.out.println("KidUser: Sorry, Age must be less than 12 to register as a kid.");
		}
	}

	@Override
	public void requestBook() {
		if (bookType.equals("Kids")) {
			System.out.println("KidUser: Book issued successfully.  Please return the book within 10 days.");
		} else {
			System.out.println("KidUser: Oops, you are allowed to take only kids books.");

		}
	}

	

	

	

	

	
}
