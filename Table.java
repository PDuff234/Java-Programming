package package1;

import java.sql.*; 

class Table 
{
	
	private static final String CREATE_TABLE_CARS= "CREATE TABLE Cars ("
			+ "ID INT NOT NULL," + "MODEL VARCHAR(50) NOT NULL," + "PRICE DOUBLE NOT NULL," + "PRIMARY KEY (ID))";
	
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
			
			stmt.executeUpdate (CREATE_TABLE_CARS); 
			
			System.out.println ("Table Created"); 
			
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
