package abstraction;

public class Abstraction_child  extends abstraction_parent
{

	public static void main(String[] args)
	{
		Abstraction_child obj=new Abstraction_child ();
		obj.display();
		obj.display1();
		}
	public void display1()
	{
		int a=10;
		int b=15;
		int c=a+b;
		System.out.println(c);
	}
}
