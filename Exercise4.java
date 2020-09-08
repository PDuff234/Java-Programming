package package1;

class Animal 
{
	void display ()
	{
		System.out.println ("Guanaco"); 
	}
}

class Noise extends Animal 
{
	void sounds ()
	{
		System.out.println ("BreEeEeEeEe"); 
	}

}

public class Exercise4 
{
	public static void main (String [] args)
	{
		Noise n = new Noise (); 
		n.display (); 
		n.sounds (); 
	}
}