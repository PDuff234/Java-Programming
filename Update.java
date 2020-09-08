package package1;

import java.sql.*; 

class Update 
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
			
			stmt.executeUpdate ("update Cars set price=40000 where id=3");
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
