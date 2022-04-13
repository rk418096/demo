package collExam;

import java.util.ArrayList;

public class HowMany {

	public static void main(String[] args) {
		int a[]= {1,2,1,5,9,9,7,6,1,4};
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0;i<a.length;i++)
		{	
			int k=0;
			if(!al.contains(a[i]))
			{
			al.add(a[i]);
			k++;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
			System.out.println(a[i]+ " repeat "+k +" times");
			}
			
			
		}

	}

}
