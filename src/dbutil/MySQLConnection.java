package dbutil;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class MySQLConnection {
	 
	
	public static Connection getConnection() 
	{  
	    Connection dbConnection = null;

	    try {
	      String url = "jdbc:mysql://localhost:3306/employee_management";
	      Properties info = new Properties();
	      info.put("user", "root");
	      info.put("password", "root");

	      dbConnection = DriverManager.getConnection(url, info);
 

	      if (dbConnection != null) {
	        System.out.println("Successfully connected to MySQL database test");
	      }

	    } catch (SQLException ex) {
	      System.out.println("An error occurred while connecting MySQL databse");
	      ex.printStackTrace();
	    }
	    
		return dbConnection;
	}
}
