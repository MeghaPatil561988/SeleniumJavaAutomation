package data_driven_framework2.data_point;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import data_driven_framework2.automation.LoginAutomation;
import data_driven_framework2.automation.ShoppingCart;
import data_driven_framework2.beans.LoginPage;
import data_driven_framework2.util.DBConnectionUtil;

public class LoginUsingDatabase {
	// Access the database table which contains the data

	public static void main(String[] args) throws Exception 
	{
		// connect to database using DBConnectionUtil file to get userName and passwords
		// and call LoginAutomation.fillTheLoginForm() method
		
		
		        Connection con = DBConnectionUtil.getMysqlDBConnection();
		        System.out.println(con);
		        
		        try {
		        	 String sql = "SELECT * FROM login_table;";
		 	        PreparedStatement pst = con.prepareStatement(sql);
		 	        ResultSet rs = pst.executeQuery();
		 	        while (rs.next()) {
		 	            String userName = rs.getString("user_name");
		 	            String password = rs.getString("password");
		 	      
		 	           LoginPage loginPage = new LoginPage(userName, password);
		 	          LoginAutomation.fillTheLoginForm(loginPage);
		 	        System.out.println("connected to the database"); 
		 	       //ShoppingCart.fillTheShoppingCartForm();
		 	      // System.out.println("clicked on shopping cart");
		 	        }
		        }
		        catch(SQLException e)
		        {
		        	System.out.println("error");
		        	e.printStackTrace();
		        }
		        
		        

	}

}
