package superkeyword;

public class Super_childvariable extends Super_parentclass 
{
String a1="This is a child class";
	public static void main(String[] args)
	{
		
		Super_childvariable obj=new Super_childvariable ();
		obj.display();

	}
	public void display()
	{
		System.out.println(a1);
		System.out.println(super.c);
	}

}
