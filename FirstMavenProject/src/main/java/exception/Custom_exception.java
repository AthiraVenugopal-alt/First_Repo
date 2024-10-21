package exception;

public class Custom_exception
{

	public static void main(String[] args) 
	{
		int age=24;
		if(age>=18)
		{
			System.out.println("The candidate is eligible for voting");
		}
		else
		{
			throw new VotingException("under age 18");
		}
	}

}
