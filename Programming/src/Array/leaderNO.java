package Array;

public class leaderNO
{
public static void main(String[] args) {
	int[] a={8,7, 4, 3, 5, 2};
	leaders(a);
}
public static void leaders(int[] arr)
{

	for(int i=0;i<arr.length;i++)
	{
		boolean flag=true;
		
		for(int j=i+1;j<arr.length;j++)
		{
		if(arr[i]<arr[j])
			{
			flag=false;
			break;
			}	
		}
		if(flag)
		{
		System.out.println(arr[i]);
		}
	}
	
}
}