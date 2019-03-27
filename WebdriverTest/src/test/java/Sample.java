
public class Sample extends Test
{
 
	public static void main(String[] args)
	{
		Test s = new Sample();
		s.function();
	
	}
	
	public void function()
	{
		System.out.println("This is Subclass Function");
	}
	
	

}

class Test
{
	
	public void function()
	{
		System.out.println("This is Superclass Function");
	}

}