package day22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertMultipleUsingBatch {

	public static void main(String[] args) throws SQLException {
		 String url = "jdbc:mysql://localhost:3306/kiitdb";
		 String username = "root";
		 String password = "";
		 Connection con = DriverManager.getConnection(url, username, password);	//open state
		 
		 Statement st=con.createStatement();
		 String query="insert into emp1 values(1,'Alice',800.0)";
		 String query1="insert into emp1 values(2,'Ben',800.0)";
		 String query2="insert into emp1 values(3,'Chris',800.0)";
		 String query3="insert into emp1 values(4,'David',800.0)";
		 
		 st.addBatch(query);
		 st.addBatch(query1);
		 st.addBatch(query2);
		 st.addBatch(query3);				//0		1	2	3
		 int rows[]= st.executeBatch();		//1		1	1	1
		 
		 if(rows.length>0)
		 System.out.println(rows.length+ " Records inserted");
		 
		 st.close();
		 con.close();

	}

}
