package day22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateUsingStatement {

	public static void main(String[] args) throws SQLException {
		 String url = "jdbc:mysql://localhost:3306/kiitdb";
		 String username = "root";
		 String password = "";
		 Connection con = DriverManager.getConnection(url, username, password);	//open state
		 
		 Statement st=con.createStatement();
		 //String query="update emp1 set salary=salary+200 where eno=1";
		 String query="update emp1 set salary=salary+200,ename='Alex' where eno=1";
		 
		
		 int rows= st.executeUpdate(query);
		 
		 if(rows>0)
		 System.out.println(rows+ " Records updated");
		 
		 st.close();
		 con.close();

	}

}
