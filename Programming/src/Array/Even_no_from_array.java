//WAJP to print even elements  count from the given array.

package Array;

public class Even_no_from_array 
{
	public static void main(String[] args)
	{
		int[] arr= {10,32,5,4,6,4,16,7,42,3,5,2};
		int total=count(arr);
		System.out.println(total);
	}
	public static int count(int[] arr)
	{
		int count=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
			count++;
			}
		}
		return count;
	}
}



