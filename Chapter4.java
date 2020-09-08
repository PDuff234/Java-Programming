package package1;
import java.util.Scanner; 

public class Chapter4 {
	public static void main(String[] args) {
		
		//Defining Data
		int i; 
		int x; 
		int prime = 0; 
		Scanner scan = new Scanner (System.in);
		
		System.out.print ("Enter a whole number: ");
		int testNumber = scan.nextInt (); 
		
		scan.close(); 
		
		x = testNumber/2; 
		
		if (testNumber == 0 || testNumber == 1)
		{
			System.out.println (testNumber + " is not a prime number.");
		}
		else 
		{
			for (i = 2; i <= x; i++)
			{
				if (testNumber % i == 0)
				{
					System.out.println (testNumber + " is not a prime number."); 
					prime = 1; 
					break; 
				}
			}
			if (prime == 0)
			{
				System.out.println (testNumber + " is a prime number.");
			}
		}
	}
}
