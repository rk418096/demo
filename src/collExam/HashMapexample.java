package collExam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapexample {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> hm = new HashMap<>();
		
		
		hm.put(0, "Hello");
		hm.put(1, "Good");
		hm.put(3, "Morning");
		hm.put(45, "Ritesh");
		hm.remove(45);
		
		
		System.out.println(hm);
		
		Set sn=hm.entrySet();
		
		System.out.println(sn);
		
		Iterator it=sn.iterator();
		
		while(it.hasNext())
		{
			
			Map.Entry mp=(Map.Entry)it.next();
			mp.getKey();
			mp.getValue();
			
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			
		}
		
		
		

	}

}
