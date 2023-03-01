package coffee;

//This class is a POJO - Plain Old Java Object
//This class can also be referred to as a bean or entity
public class MenuItem {

	

	//The constructor does not have a return type
	//by default all objects have an empty argument constructor
	//that we do not have to code
	public MenuItem() {
		
		
	}
	
	
	
	//This constructor takes in 2 parameters that will populate the member variables
	//This constructor needs to be able to tell the difference between the argument passed in and the member variable itself
	//by using this. it specifies the member variable of the class
	//This 
	public MenuItem(String name, double price, int quantityInStock) {
		this.name = name;
		this.price = price;
		this.quantityInStock = quantityInStock;
	}
	
	
	//These private variables are called member variables
	//because they are defined at the class level meaning
	//they are available to the entire class, not just the code block they are defined in
	private String name = null;
	private double price = 0.00;
	private int quantityInStock = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantityInStock() {
		return quantityInStock;
	}


	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

}
