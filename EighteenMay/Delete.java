//Program to delete record from database

import java.sql.*;
import java.util.Scanner;
public class Delete {
	public void delete(int id1) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","root");
			String delete="DELETE FROM registration WHERE id=?";
			PreparedStatement pt=con.prepareStatement(delete); 
			pt.setInt(1,id1);
			int i = pt.executeUpdate(); 
 			if(i>0) { 
 				System.out.println("Deleted records into table "); 
 			} 
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Delete i=new Delete();
		System.out.print("Enter id of the record which you want to delete: ");
		int id1 = sc.nextInt();
		i.delete(id1);
		sc.close();
	}

}
