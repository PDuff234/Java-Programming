package package1;
import java.util.Scanner;

public class Exercise3 
{
	public static void main(String[] args) 
	{
		int array [] = new int [5]; 
		Scanner scan = new Scanner (System.in);
		System.out.println ("Please enter the numbers that you want in an array (Up to 5 integers)");
		for (int i = 0; i < array.length; i++)
		{
			array [i] = scan.nextInt(); 
		}
		scan.close ();
		System.out.println ("First Element: " + array [0]); 
		System.out.println ("Last Element: " + array [array.length-1]);
	}
}
