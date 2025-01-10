package Array;

public class SumOfArray 
{
	public static void main(String[] args)
	{
		int[] a= {10,20,30,40,50,60};
		int sum=add(a);
		System.out.println("sum is : "+ sum);
	}
	public static int add(int[] arr)
	{
		int res=0;
		for(int i=0; i<arr.length; i++)
		{
			if(i%2!=0)
			{
			res=res+arr[i];
			}
		}
		return res;
	}
}
