package day24;

import java.sql.Connection;
import java.sql.Statement;

public class JDBCUsingHikariDriver {
public static void main(String[] args) {
	Thread tx=null;
	Runnable insertThread=()->{
		try(Connection con=HikariDatabaseConnection.getConnection();
			Statement st=con.createStatement();)
		{
			
			
			 String query="insert into emp1 values(6,'Shubman',900.0)";
			 
			
			 int rows= st.executeUpdate(query);
			 
			 if(rows>0)
			 System.out.println(rows+ " Records inserted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	};
	
	
	tx=new Thread(insertThread);
	tx.start();
	
	
	Runnable updateThread=()->{
		try(Connection con=HikariDatabaseConnection.getConnection();
				Statement st=con.createStatement();)
		{
			
			
			String query="update emp1 set salary=salary+99 where eno=1";
			 
			
			 int rows= st.executeUpdate(query);
			 
			 if(rows>0)
			 System.out.println(rows+ " Records Updated");


		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	};
	
	
	tx=new Thread(updateThread);
	tx.start();

}
}
