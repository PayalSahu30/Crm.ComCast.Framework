package Array;

public class Second_largest 
{
	public static void main(String[] args) {
		int [] a= {8,2,3,7,5,6,8};
		System.out.println(" second large "+ secondlargest(a));
}
	public static int secondlargest(int[] a)
	{
		int first= Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>first)
			{
				second=first;
				first=a[i];
			}
			else if(a[i]>second && a[i] !=first)
			{
				second=a[i];
			}
					
		}
	return second;
		
	}
}