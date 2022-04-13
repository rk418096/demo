package collExam;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Ritesh");
		hs.add("Akshada");
		hs.add("Ritesh");
		hs.add("UK");
		hs.remove("UK");
		
		System.out.println(hs);
		
		
		

	}

}
