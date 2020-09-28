package data_driven_framework2.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnectionUtil {

	public static Connection getMysqlDBConnection() throws ClassNotFoundException, SQLException 
	{
		 String driverClassName="com.mysql.cj.jdbc.Driver";
		 String url = "jdbc:mysql://localhost:3306/selenium_practice";   
		 String dbUserName = "root";
	     String dbPassword  = "Swapnil88@";
	 
	        Class.forName(driverClassName);
	        Connection con = DriverManager.getConnection(url, dbUserName, dbPassword);
	       
	 
		return con;
	}

	
}
