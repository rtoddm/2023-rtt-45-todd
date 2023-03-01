package library;

import java.util.ArrayList;
import java.util.List;

public class LibraryInterfaceDemo {
	
//	public String myMethod(ArrayList users) {
//		for(LibraryUser user : users) {
//			user.registerAccount();
//		}
		
//	}
	
	public static void main(String[] args) {

		KidUsers kiddos = new KidUsers();
		kiddos.setAge(10);
		kiddos.registerAccount();
		kiddos.setAge(18);
		kiddos.registerAccount();

		kiddos.setBookType("Kids");
		kiddos.requestBook();
		kiddos.setBookType("Fiction");
		kiddos.requestBook();

		System.out.println("========================");

		AdultUser bigKids = new AdultUser();
		bigKids.setAge(10);
		bigKids.registerAccount();

		bigKids.setAge(23);
		bigKids.registerAccount();

		bigKids.setBookType("Kids");
		bigKids.requestBook();

		bigKids.setBookType("Fiction");
		bigKids.requestBook();

		System.out.println("=======================================");
		
		// Two New AdultUser Objects
		AdultUser Sam = new AdultUser();
		Sam.setAge(35);

		AdultUser Julie = new AdultUser();
		Julie.setAge(29);

		// Two New KidUser Objects
		KidUsers Johnny = new KidUsers();
		Johnny.setAge(10);

		KidUsers Susy = new KidUsers();
		Susy.setAge(7);

		// New LibraryUser List
		List<LibraryUser> users = new ArrayList<>();

		// Add New Objects to the Users List
		users.add(Sam);
		users.add(Susy);

		users.add(Johnny);
		users.add(Julie);
		
		System.out.println(users);

		
	}
}
