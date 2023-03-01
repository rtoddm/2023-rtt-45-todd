package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class BasicJDBCExamples {

	public static void main(String[] args) {
		String dburl = "jdbc:mysql://localhost:3306/classicmodels";
		String user = "root";
		String password = "SQLPassword";
		System.out.println("-------- MySQL JDBC Connection Demo ------------");

		try {
			// create a new scanner and read the first name into the variable
			Scanner scanner1 = new Scanner(System.in);
			System.out.println("Enter a first name or a last name:");
			String name = scanner1.nextLine();
			
			
			// Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(dburl, user, password);
			
			
			
			String SelectSQL = "Select * FROM employees where firstName = ? or lastName = ?";
			
			
			//this is a JDBC class that creates the statement which will in turn run the SQL
			PreparedStatement stmt = connection.prepareStatement(SelectSQL);
			// this is 1 based so the first? is #1
			stmt.setString(1, name);
			stmt.setString(2, name);
			
			
			ResultSet result = stmt.executeQuery();
			
			
			while (result.next()) {
				String EmployeeID = result.getString("employeeNumber");
				String fname = result.getString("firstName");
				String lname = result.getString("lastName");
				String email = result.getString("email");
				System.out.println(EmployeeID + " | " + fname + " | " + lname + " | " + email);
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	

}
