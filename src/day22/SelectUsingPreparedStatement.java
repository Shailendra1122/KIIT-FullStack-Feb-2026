package day22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectUsingPreparedStatement {

	public static void main(String[] args) throws SQLException {
		 String url = "jdbc:mysql://localhost:3306/kiitdb";
		 String username = "root";
		 String password = "";
		 Connection con = DriverManager.getConnection(url, username, password);	//open state
		 
		 
		 //String query="select eno,ename from emp1 where eno=3";
		 String query="select ename,eno from emp1 where salary>? ";
		 PreparedStatement ps=con.prepareStatement(query);
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Salary");
		 int a=sc.nextInt();
		 
		 ps.setDouble(1, a);
		 
		 ResultSet rs= ps.executeQuery();
		 
		// if(rs.next())
		 while(rs.next())
		 System.out.println(rs.getInt("eno") + " " + rs.getString("ename"));
		 
		 ps.close();
		 con.close();

	}

}
