package day22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteUsingStatement {

	public static void main(String[] args) throws SQLException {
		 String url = "jdbc:mysql://localhost:3306/kiitdb";
		 String username = "root";
		 String password = "";
		 Connection con = DriverManager.getConnection(url, username, password);	//open state
		 
		 Statement st=con.createStatement();
		 String query="delete from emp1 where eno=2";
		 
		
		 int rows= st.executeUpdate(query);
		 
		 if(rows>0)
		 System.out.println(rows+ " Records deleted");
		 
		 st.close();
		 con.close();

	}

}
