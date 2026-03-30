	package day22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteUsingPreparedStatement {

	public static void main(String[] args) throws SQLException {
		 String url = "jdbc:mysql://localhost:3306/kiitdb";
		 String username = "root";
		 String password = "";
		 Connection con = DriverManager.getConnection(url, username, password);	//open state
		 
		 
		 //String query="update emp1 set salary=salary+200 where eno=1";
		 String query="delete from emp1 where eno=?";
		 PreparedStatement ps=con.prepareStatement(query);
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Emp no");
		 int a=sc.nextInt();
		
		 ps.setInt(1, a);
		 int rows= ps.executeUpdate();
		 
		 if(rows>0)
		 System.out.println(rows+ " Records updated");
		 
		 ps.close();
		 con.close();

	}

}
