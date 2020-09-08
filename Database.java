package package1;
import java.sql.*; 

class Database 
{
	public static void main (String [] args)
	{
		Connection conn = null; 
		Statement stmt = null; 
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "root", "root");
			
			stmt = conn.createStatement (); 
			stmt.executeUpdate("insert into student values (2, 'Cory Chung', 92) "); 
			stmt.executeUpdate("insert into student values (3, 'John Wayne', 84) "); 
			stmt.executeUpdate("insert into student values (4, 'Gof Wayne', 100) "); 
			stmt.executeUpdate("insert into student values (5, 'Joe Strumpf', 78) "); 
			stmt.executeUpdate("insert into student values (6, 'Tyler Okonma', 101) "); 
			ResultSet rs = stmt.executeQuery ("select * from student"); 
			
			while (rs.next ())
				System.out.println (rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3)); 
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
