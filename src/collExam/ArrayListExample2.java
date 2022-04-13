package collExam;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample2 {

	public static void main(String[] args) {

		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Akshu");
		
		a.add("Ritu");
		
		a.add("Rahul");
		
		a.add("Ri");
		
		
		
		
		Iterator it =a.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		

	}

}
