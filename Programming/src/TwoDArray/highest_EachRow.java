package TwoDArray;

public class highest_EachRow 
{
	public static void main(String[] args) 
	{
	int [][] arr= {{100,198,333,323}, {122,232,221,111},{223,565,245,764}};
	for (int i = 0; i < arr.length; i++) 
	{
		int large=arr[0][0];
		for (int j = 0; j < arr[i].length; j++) 
		{
			
			for (int k = 1; k <= arr[i][j]; k++) 
			{
				if(arr[i][j]>large)
				{
					
					large=arr[i][j];
				}
			}
		
		}
		System.out.println("largest in :" + large);
			
	}
		
	}
			
}
