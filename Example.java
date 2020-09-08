package package1;

class Example
{
    public static void main(String[] args) {
        System.out.println("Initializing program....");
        int a=34;
        int b=0;
        try 
        {
        int c=a/b;
        System.out.println("Quotient is = "+c);
        System.out.println("Terminating program........");
        }
        catch (Exception Null) 
        {
        	System.out.println ("You are unable to divide by zero. Please try again with a non-zero number in the denominator");
        }
    }
}
