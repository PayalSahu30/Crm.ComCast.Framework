package TwoDArray;

public class Transpose_matrix 
{
	public static void main(String[] args)
	{
		int [][] arr= { {4,6,7}, {1,2,3},{4,5,7}};
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
}
