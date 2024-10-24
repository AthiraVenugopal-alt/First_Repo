package inheritance;

public class Child_Override extends Parent_Override
{

	public static void main(String[] args)
	{
		Child_Override obj=new Child_Override();
		obj.display();

	}
	public void display()
	{
		super.display();
				System.out.println("CHILD");
	}

}
