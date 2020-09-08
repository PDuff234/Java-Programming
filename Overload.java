package package1;

public class Overload {
	
	private int rollNum; 
	Overload () 
	{
		rollNum = 100; 
	}
	Overload (int ranNum) 
	{
		this (); 
		rollNum = rollNum + ranNum; 
	}
	public int getrollNum () 
	{
		return rollNum; 
	}
	public void setrollNum (int rollNum) 
	{
		this.rollNum = rollNum; 
	}
	public static void main (String [] args) 
	{
		Overload obj = new Overload (24); 
		System.out.println (obj.getrollNum()); 
	}
}
