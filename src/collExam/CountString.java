package collExam;

import java.util.HashMap;

public class CountString {

	
	public static void main(String[] args) {
		
		Countchars("test");
	}
	
	
	public static void Countchars(String name)
	{
		
		
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		char a[]=name.toCharArray();
		
		for(char c:a)
		{
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
		}
		
		System.out.println(name + ":" +hm);
	}
	
	
	
}
	
	
	
	
	


