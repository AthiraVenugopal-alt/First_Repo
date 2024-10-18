package inheritance;

import java.util.Scanner;

public class Multichild_Example1 extends Multiparent_Example2
{

	public static void main(String[] args) 
	{
		Multichild_Example1 obj=new Multichild_Example1 ();
				obj.sub();
		        obj.sum();
		        obj.multiply();
	}
public void multiply()

{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter two numbers:");
	int a=10;
	int b=20;
	int product=a*b;
	System.out.println("The product is: "+product);
	
}
}

	
