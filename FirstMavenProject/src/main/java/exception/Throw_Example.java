package exception;

public class Throw_Example {

	public static void main(String[] args) {
		int age=24;
		if(age>=18)
		{
			System.out.println("The candidate is eligible for voting");
		}
		else
		{
			throw new ArithmeticException("under age 18");
		}
	}

}
