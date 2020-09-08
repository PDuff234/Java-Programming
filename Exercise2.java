package package1;
import java.util.Scanner;

abstract class Book 
{
	String title; 
	abstract void setTitle (String s);
	String getTitle ()
	{
		return title; 
	}
}

class Book1 extends Book
{
	void setTitle (String s)
	{
		title = s; 
	}
}

public class Exercise2
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.print ("Please enter the name of a book: ");
		String title = scan.nextLine (); 
		Book1 novel = new Book1 (); 
		novel.setTitle(title);
		System.out.println ("The title is: " + novel.getTitle()); 
		scan.close (); 
	}
}