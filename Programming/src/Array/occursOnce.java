//Wajp to print elements which occurs only once.

package Array;

public class occursOnce
{
	public static void main(String[] args) {
		
		int [] arr= {6,2,3,4,2,3,7,1,3};
		occurs(arr);
		}
		public static void occurs(int[]  a) {
		boolean [] b= new boolean[a.length];

		for (int i = 0; i < b.length; i++) 
		{
			if(b[i]==false)
			{
			int count=1;
			for (int j = i+1; j < b.length; j++) 
			{
				if(a[i]==a[j]) 
				{
					count++;
					b[j]= true;
				}
			
			}
			if(count==1)
			{
			System.out.println(a[i]);
			}
			}  
			
		}
		}
}
