package exception;

public class Exception_example1
{

	public static void main(String[] args)
	{
		int a=10;
		int b=0;
		try
		{
			int c=a/b;
			System.out.println(c);
		}
		/*catch (ArithmeticException x)
		{
			int d=a+b;
		System.out.println(d);
				
			}*/
		finally
		{
	System.out.println("Exceution completed");
		}
		
	}
}

