package package1;

import java.sql.*;

class Insert 
{
	public static void main (String [] args)
	{
		
		String url = "jdbc:mysql://localhost:3306/asgn4?useSSL=false"; 
		String username = "root";
		String password = "root";
				
		Connection conn = null; 
		Statement stmt = null; 
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); 
			
			conn = DriverManager.getConnection (url, username, password); 
			stmt = conn.createStatement (); 
			
			stmt.executeUpdate("insert into Cars values (1, 'Mercedes', 34475) "); 
			stmt.executeUpdate("insert into Cars values (2, 'BMW', 30025) "); 
			stmt.executeUpdate("insert into Cars values (3, 'Audi', 37250) "); 
			
			System.out.println ("Database updated successfully"); 
		}
		catch (SQLException se)
		{
			se.printStackTrace(); 
		}
		catch (Exception e)
		{
			e.printStackTrace(); 
		}
		finally 
		{
			try 
			{
				if (stmt != null)
					conn.close(); 
			}
			catch (SQLException se)
			{
			}
				try
				{
					if (conn != null )
						conn.close(); 
				}	
			
			catch (SQLException se)
			{
				se.printStackTrace(); 
			}
		}
	}
}
