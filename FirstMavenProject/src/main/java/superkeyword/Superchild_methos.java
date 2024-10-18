package superkeyword;

public class Superchild_methos extends Superparent_methods
{
	public static void main(String[] args) 
	{
		Superchild_methos obj=new Superchild_methos();
		obj.sub();

	}
	public void sub()
	{
		int a=10,b=5;
		int c=a-b;
		System.out.println(c);
		System.out.println("sum");
	}

	}


