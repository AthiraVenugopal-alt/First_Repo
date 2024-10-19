package encapsulation;

public class encapsulation_parent
{
	private String name ;
	private int age ;

public void setdetail(String name, int age)
{
	this.name=name;
	this.age=age;
}
public void getdetail()
{
	System.out.println("the name is:" +name);
	System.out.println("the age is:" +age);
}
}