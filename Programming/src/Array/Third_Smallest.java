package Array;

public class Third_Smallest
{
	public static void main(String[] args) 
	{
			
		int [] a= {1,2,3,5,4,6,7};
		System.out.println("third small "+ secondsmallest(a));
		}
		public static int secondsmallest(int[] a)
		{
		int first= Integer.MAX_VALUE;
		int second=Integer.MAX_VALUE;
		int third=Integer.MAX_VALUE;
		int fourth= Integer.MAX_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]<first)
			{  
				fourth=third;
				third=second;
				second=first;
				first=a[i];
			}
			else if(a[i] <second && a[i] !=first)
			{
				fourth=a[i];
			}
			else if(a[i] <third && a[i] != second)
			{
				fourth=a[i];
			}	
			else if(a[i] <fourth && a[i] != third)
			{
				fourth=a[i];
			}
		}
	return fourth;
		
	}

}
