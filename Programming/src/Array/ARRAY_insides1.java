package Array;

public class ARRAY_insides1 
{
	public static void main(String[] args)
	{
		int[] a={2,4,7,2,8,1,7,5};
		System.out.println(divisible(a)); 
		
}
	public static int divisible(int[] arr)
	{
		int Esum=0;
		int Osum=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
			 Esum=Esum+arr[i];
			 
			}
			else
			{
				Osum=Osum+arr[i];
			}
			
		}
		int prod=Esum*Osum;
		return prod;
	}
}