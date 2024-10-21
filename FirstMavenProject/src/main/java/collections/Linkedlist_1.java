package collections;

import java.util.LinkedList;

public class Linkedlist_1 {

	public static void main(String[] args)
	{
		LinkedList<String> s=new LinkedList<String>();
		s.add("Lion");
		s.add("Tiger");
		s.add("Bear");
		System.out.println(s);
		LinkedList<String> s1=new LinkedList<String>();
		s1.add("Parrot");
		s1.add("Sparrow");
		s1.add("Crow");
		System.out.println(s1);
		s.addAll(s1);
		System.out.println(s);
		System.out.println(s.contains("cow"));
		System.out.println(s.contains("Crow"));
		System.out.println(s.get(1));
		System.out.println(s1.get(1));
		System.out.println(s.isEmpty());
		s.remove(2);
		System.out.println(s);
System.out.println(s.size());
	}

}
