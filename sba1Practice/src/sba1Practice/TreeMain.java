package sba1Practice;

public class TreeMain {

public static void main(String[] args) {
		

	Tree pineTree = new Tree("red", "pine", 6, "rustling");
	
		System.out.println(pineTree.leafColor);
		System.out.println(pineTree.type);
		System.out.println(pineTree.height);
		pineTree.rustle("rustle");
	}
	
	

}
