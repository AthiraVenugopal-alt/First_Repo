package inheritance;

public class Multichild_1 extends Multiparent2 
{

	public static void main(String[] args) 
	{
		Multichild_1 obj=new Multichild_1 ();
		obj.display1();
		obj.display3();
		obj.display2();
		
	}
public void display3()
{
	System.out.println("Tower");
}
}

