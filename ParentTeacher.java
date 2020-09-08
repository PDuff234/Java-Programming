package package1;

public class ParentTeacher extends Parent 
{
	String mainSub = "Chemistry";
	public static void main (String [] args) 
	{
		ParentTeacher obj = new ParentTeacher (); 
		System.out.println (obj.college);
		System.out.println (obj.mainSub);
		System.out.println (obj.occ);
		obj.demo (); 
	}
}
