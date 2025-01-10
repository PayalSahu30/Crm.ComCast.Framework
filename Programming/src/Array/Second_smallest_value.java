package Array;

public class Second_smallest_value 
{
	public static void main(String[] args) {
		
	
	int [] a= {8,2,3,7,5,6,8};
	System.out.println("second small "+ secondsmallest(a));
	}
	public static int secondsmallest(int[] a)
	{
	int first= Integer.MAX_VALUE;
	int second=Integer.MAX_VALUE;
	int third=Integer.MAX_VALUE;
	
	for (int i = 0; i < a.length; i++) {
		if(a[i]<first)
		{  
			third=second;
			second=first;
			first=a[i];
		}
		else if(a[i] <second && a[i] !=first)
		{
			third = a[i];
		}
		else if(a[i] <third && a[i] != second)
		{
			third = a[i];
		}	
	}
return third;
	
}

}
