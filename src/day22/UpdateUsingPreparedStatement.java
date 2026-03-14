package day22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateUsingPreparedStatement {

	public static void main(String[] args) throws SQLException {
		 String url = "jdbc:mysql://localhost:3306/kiitdb";
		 String username = "root";
		 String password = "";
		 Connection con = DriverManager.getConnection(url, username, password);	//open state
		 
		 String query="update emp1 set salary=salary+? where eno=?";
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Emp no");
		 int a=sc.nextInt();
		 
		 System.out.println("Enter Salary Increment Amount");
		 double c=sc.nextDouble();
		 
		 PreparedStatement ps=con.prepareStatement(query);
		 ps.setDouble(1, c);
		 ps.setInt(2, a);
		 int rows= ps.executeUpdate();
		 
		 if(rows>0)
		 System.out.println(rows+ " Records inserted");
		 
		 ps.close();
		 con.close();

	}

}
