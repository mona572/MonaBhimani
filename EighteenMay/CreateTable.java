//Program to create database table using Java
import java.sql.*;
public class CreateTable {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","root");
			Statement stmt=con.createStatement(); 
			stmt.executeUpdate("CREATE TABLE registration(id INT NOT NULL AUTO_INCREMENT, FirstName Varchar(20) NOT NULL, Age INT Not Null, PRIMARY KEY ( id ))");
			System.out.println("Table is created");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}