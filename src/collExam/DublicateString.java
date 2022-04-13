package collExam;

public class DublicateString {

	public static void main(String[] args) {
		
		String s1= "Good Morning";
		
		char[] a= s1.toCharArray();
		
		for(int i=0;i<s1.length();i++)
		{
			int c=0;
			
			for(int j=i+1;j<s1.length();j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[j]+ " ");
					c++;
					
					break;
				}
				
				
			}
			if(c==1)
			{
			System.out.println(c);	}
		}
		
		

	}

}
