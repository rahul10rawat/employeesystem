package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.model.Employee;
import com.model.User;

import dbutil.MySQLConnection;
import exception.BusinessException;


public class businessDAO {

	public businessDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean getUserList() throws BusinessException, ClassNotFoundException, SQLException
	{  System.out.println("getUserList func called");
		boolean b=false;
		   Connection dbConnection = null;

		    try { 
		      dbConnection = MySQLConnection.getConnection();
		      
		      Statement stmt = dbConnection.createStatement();

		      String sql = "SELECT user_id,password,role FROM login_master";
		      System.out.println(sql);
		      ResultSet rs = stmt.executeQuery(sql);
		      //STEP 5: Extract data from result set
		      while(rs.next()){
		         //Retrieve by column name
		    	 
		         int id  = rs.getInt("user_id");
		         String pass  = rs.getString("password");
		         String role  = rs.getString("role");
 
		         User user = new User();
		        
		         
		      }
		      rs.close();

		      if (dbConnection != null) {
		        System.out.println("Successfully connected to MySQL database test");
		      dbConnection.close();
		      
		      }

		    } catch (SQLException ex) {
		      System.out.println("An error occurred while connecting MySQL databse");
		      ex.printStackTrace();
		    }
	System.err.println("b" +b);
		return b;
	}

	public boolean saveEmployee(Employee emp) throws BusinessException, ClassNotFoundException, SQLException
	{  System.out.println("saveEmployee func called");
		boolean b=false;
		   Connection dbConnection = null;

		    try { 
		      dbConnection = MySQLConnection.getConnection();
		      
		      Statement stmt = dbConnection.createStatement();

		      String  sql = "INSERT INTO employees " +
	                   "VALUES (1, '"+ emp.getFirst_name() +"', '"+ emp.getLast_name() +"', '"+ emp.getDob() +"', '"+ emp.getEmail() +"', "+ emp.getDepartment_id() +")";
		      stmt.executeUpdate(sql);
	       
		      System.out.println(sql);
		     
		      if (dbConnection != null) {
		        System.out.println("Successfully connected to MySQL database test");
		      dbConnection.close();
		      
		      }

		    } catch (SQLException ex) {
		      System.out.println("An error occurred while connecting MySQL databse");
		      ex.printStackTrace();
		    }
	System.err.println("b" +b);
		return b;
	}
}
