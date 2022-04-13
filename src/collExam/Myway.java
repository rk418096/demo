package collExam;

public class Myway {

	public static void main(String[] args) {
		
		int a[]= {2,4,2,3,4,5,6,5,1};
		
		
		for(int i=0;i<a.length;i++)
		{
		int k=0;
			for(int j=0;j<a.length;j++)
			{
				
				if(a[i]==a[j])
				{
					k++;
					//System.out.print(a[i]+" ");
				}
				
				
			}
			
			if(k==1)
			{
			System.out.println("Unique value "+a[i]);
			}
			
			}
		
		
				

	}

}
