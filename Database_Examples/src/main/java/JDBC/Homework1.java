package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Homework1 {

	// Make this in a new Homework1 Class
	// I want to see a list of all customers that have made a payment larger than
	// <amount>
	// Print the checkNumber, amount (formatted to $#.00), and the customer name
	// ordered
	// by the largest amount first
	// input variables for the scanner are 1) the amount and 2) 2 digit state code.

	public static void main(String[] args) {
		String dburl = "jdbc:mysql://localhost:3306/classicmodels";
		String user = "root";
		String password = "SQLPassword";
		System.out.println("-------- MySQL JDBC Connection Demo ------------");

		try {
			// create a new scanner and read the first name into the variable
			Scanner scanner1 = new Scanner(System.in);
			System.out.println("Enter a payment amount:");
			Integer paymentAmount = scanner1.nextInt();

			// Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(dburl, user, password);

			String SelectSQL = "select c.customerName, format(p.amount, 2) as 'amount', p.checkNumber "
					+ "from customers c,  payments p " 
					+ "where c.customerNumber = p.customerNumber and p.amount > ? " 
					+ "order by p.amount asc";

			// this is a JDBC class that creates the statement which will in turn run the
			// SQL
			PreparedStatement stmt = connection.prepareStatement(SelectSQL);
			// this is 1 based so the first ? is #1
			stmt.setInt(1, paymentAmount);

			ResultSet result = stmt.executeQuery();

			while (result.next()) {
				String customerName = result.getString("customerName");
				String amount = result.getString("amount");
				String checkNumber = result.getString("checkNumber");
				System.out.println(customerName + " | " + amount + " | " + checkNumber);
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
