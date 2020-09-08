package package1;

interface Shape 
{
	void perimeter (); 
	void area (); 
}

class Rectangle implements Shape 
{

	int length = 0, breadth = 0; 
	double ar; 
	@Override
	public void perimeter ()
	{
		length = 7; 
		breadth = 4; 
	}
	
	@Override
	public void area ()
	{
		ar = length * breadth; 
		System.out.println ("Area of Rectangle: " + ar);
	}
}

