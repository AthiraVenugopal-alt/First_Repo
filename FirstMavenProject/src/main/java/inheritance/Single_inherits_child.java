package inheritance;

public class Single_inherits_child extends Singleinherits 
{

	public static void main(String[] args)
	{
		Single_inherits_child obj=new Single_inherits_child();
		obj.display();
		obj.display1();
	}
	public void display1()
	{
		System.out.println("Child class");
	}

}
