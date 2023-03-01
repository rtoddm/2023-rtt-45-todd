package sba1Practice;

public class Tree {

	//Declare Uninitialized Variables
	String leafColor;
	String type;
	int height;
	String sound;
	
	public void rustle(String sound) {
		System.out.println("Leaves are " + this.sound);
	}
	
	//Parameterized Constructor Function
	Tree(String leafColor, String type, int height, String sound){
		this.leafColor = leafColor;
		this.height = height;
		this.type = type;
		this.sound = sound;
	}
	
	
}
