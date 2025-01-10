package TwoDArray;

public class Diagonal 
{
	public static void main(String[] args) {
		int [][] arr= { {4,6,7}, {1,2,3},{4,5,7}};
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				if(arr[i]==arr[j])
				{
				System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
}
