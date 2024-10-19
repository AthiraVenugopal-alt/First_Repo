package interface_abstraction;

public class MultipleInterface_child implements interface_interface_parent_1,interface_Interface_parent_2 
{

	public static void main(String[] args)
	{
		MultipleInterface_child obj=new MultipleInterface_child ();
		obj.display();
		obj.sum();
	}
public void sum()
{
	int x=1,y=2;
	int z=x+y;
	System.out.println(z);
}
public void display()
{
	System.out.println("Hello");
}

}
