package package1;
import java.io.*; 

import java.io.BufferedWriter;

public class Example1 
{
	public static void main (String [] args)
	{
		String fileName = "info.txt"; 
		
		try 
		{
			FileWriter fileWriter = new FileWriter (fileName); 
			
			BufferedWriter bufferedWriter = new BufferedWriter  (fileWriter);
			
			bufferedWriter.write ("My name is Patrick Duffany. I am a second year student at the University of South Florida. \n"
					+ "I am studying to become a Computer Science and Engineering double major, and am really good at table tennis.");
			
			bufferedWriter.close (); 
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
