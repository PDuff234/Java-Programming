package package1;
import java.util.Arrays; 
import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {

		int sum = 0; 
		int array [] = new int [5]; 
		Scanner scan = new Scanner (System.in);
		System.out.println ("Please enter the numbers that you want in an array (Up to 5 integers)");
		for (int i = 0; i < array.length; i++)
		{
			array [i] = scan.nextInt(); 
			sum = sum + array [i];
		}
		scan.close ();
		System.out.println ("The elements of the array are: " + Arrays.toString (array)); 
		System.out.println ("The sum of all the elements of the array is: " + sum);
	}
}