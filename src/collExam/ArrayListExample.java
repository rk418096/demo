package collExam;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {

		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Akshu");
		a.add("Akshu");
		a.add("Ritu");
		a.add("Rahul");
		a.add("Rahul");
		a.remove(2);
		a.add(2, "Boku");
		a.size();
		
		
		System.out.println(a.contains("Ritu"));
		System.out.println(a.size());
		
		Iterator it =a.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		

	}

}
