package task; 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Task {

	public static void main(String[] args) {
		Connection c = null;
		Statement stmt = null;
		
		try {
		   Class.forName("org.postgresql.Driver");
		   c = DriverManager
		      .getConnection("jdbc:postgresql://localhost:5432/postgres",
		      "postgres", "Prince311@kush");
		   
		   System.out.println("Opened database successfully");
		   
		   Statement stmt1 = c.createStatement();
	         String sql = "CREATE TABLE COMPANY " +
	            "(ID INT PRIMARY KEY     NOT NULL," +
	            " NAME           TEXT    NOT NULL, " +
	            " AGE            INT     NOT NULL, " +
	            " ADDRESS        CHAR(50), " +
	            " SALARY         REAL)";
	         stmt1.executeUpdate(sql);
//	         stmt1.close();
//	         c.close();
	   
		} catch (Exception e) {
		   e.printStackTrace();
		   System.err.println(e.getClass().getName()+": "+e.getMessage());
		   System.exit(0);
		}
		

	}

}

