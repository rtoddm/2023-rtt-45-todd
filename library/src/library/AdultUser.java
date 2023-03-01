package library;

public class AdultUser implements LibraryUser {

	int age;
	String bookType;
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setBookType(String bookType){
		this.bookType = bookType;
	}
	
	@Override
	public void registerAccount () {
		if(age >= 12) {
			System.out.println("AdultUser: You have successfully registered under an Adult Account");
		}else if(age <= 11) {
			System.out.println("AdultUser: Sorry, Age must be greater than 12 to register as an adult");
		}
	}

	@Override
	public void requestBook() {
		if(bookType.equals("Fiction")) {
			System.out.println("AdultUser: Book Issued successfully, please return the book within 7 days");
		}else{
			System.out.println("AdultUser: Oops, you are allowed to take only adult Fiction books");
		}
	}

	

	
	
}
