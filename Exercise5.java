package package1;

/* The difference between Overloading and Overriding is as follows: 
 * 
 * Overloading: When two or more methods (in a class) have the same method name but different parameters.
 * 
 * Overriding: When two methods (in a class) have the same method name and parameters but uses the method in the child class for a specific 
 * implementation exclusive to that class. 
 */


//Overriding Example

class Activities
{
	public void Act ()
	{
		System.out.println ("Today I will go Swimming"); 
	}
}

class DayActivities extends Activities
{
	public void Act ()
	{
		System.out.println ("Today I will go surfing");
	}
}

//Overloading Example 

class Dogs
{
	public void Sound ()
	{
		System.out.println ("Bark"); 
	}
	
	public void Sound (int x)
	{
		x = 5; 
		for (int i = 0; i < x; i++)
			System.out.println ("Woof");
	}
}

public class Exercise5
{
	public static void main (String [] args)
	{
		DayActivities da = new DayActivities (); 
		Dogs dog = new Dogs (); 
		
		da.Act(); 
		
		dog.Sound();
		dog.Sound(1); 
	}
}