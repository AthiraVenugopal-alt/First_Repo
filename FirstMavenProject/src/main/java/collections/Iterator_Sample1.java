package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Sample1 {

	public static void main(String[] args)
	{
		ArrayList<String> s1=new ArrayList<String>();
		s1.add("Dog");
		s1.add("cat");
		s1.add("Goat");
		s1.add("Cow");
		Iterator it=s1.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());
		}
		it.remove();
		System.out.println(s1);
		
	}

}
