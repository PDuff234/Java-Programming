package package1;
import javax.swing.*; 

public class GreetingPanel extends JPanel
{
	private JLabel greeting; 
	
	public GreetingPanel ()
	{
		greeting = new JLabel ("Welcome to P Duff's Bagel House!");
		add (greeting); 
	}
}
