package Array;
public class Prime_no_fromArray 
{
	public static void main(String[] args)
	{
		int[] a= {2,4,6,5,3,11,1,15,17};
		primes(a);
	}

	public static void primes(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			int count=0;
			for(int j=1; j<=arr[i]; j++)
			{
				if(arr[i]%j==0)
				{
					count++;
				}
								
			}
			if(count==2)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
