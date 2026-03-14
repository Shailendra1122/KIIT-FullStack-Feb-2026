package day22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectUsingStatement2 {

	public static void main(String[] args) throws SQLException {
		 String url = "jdbc:mysql://localhost:3306/kiitdb";
		 String username = "root";
		 String password = "";
		 Connection con = DriverManager.getConnection(url, username, password);	//open state
		 
		 Statement st=con.createStatement();
		 //String query="select eno,ename from emp1 where eno=3";
		 String query="select ename,eno from emp1 ";
		 
		
		 ResultSet rs= st.executeQuery(query);
		 
		// if(rs.next())
		 while(rs.next())
		 System.out.println(rs.getInt("eno") + " " + rs.getString("ename"));
		 
		 st.close();
		 con.close();

	}

}
