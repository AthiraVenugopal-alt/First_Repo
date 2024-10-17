package accessmodifier;

public class Accessmodifier1
{

	public static void main(String[] args) 
	{
		Accessmodifier1 objt=new Accessmodifier1();
		objt.display1();
		objt.display2();
		objt.display3();
		objt.display4();

	}
	public void display1()
	{
		System.out.println("This is a public method");
	}
	private void display2()
	{
		System.out.println("This is a private method");
		
	}
	protected void display3()
	{
		System.out.println("This is a protected method");
	}
	void display4()
	{
		System.out.println("This is a default method");
	}
	}
	





