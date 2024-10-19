package interface_abstraction;

public class Interface_childclass implements Interface_Example1
{

	public static void main(String[] args) 
	{
		Interface_childclass obj=new Interface_childclass();
		obj.add();
	}
	public void add()
	{
		int a=10,b=5;
		int c=a+b;
		System.out.println(c);
	}

}
