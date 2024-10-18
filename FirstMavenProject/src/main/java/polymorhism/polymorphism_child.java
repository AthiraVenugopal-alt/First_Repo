package polymorhism;

public class polymorphism_child extends Polymorphism_parent 
{

	public static void main(String[] args) 
	{
		
		polymorphism_child obj=new polymorphism_child();
		obj.display(5, 4);

	}
	public void display(int a,int b)
	{
		super.display(5, 8);
		int c=a-b;
		System.out.println(c);
	}

}
