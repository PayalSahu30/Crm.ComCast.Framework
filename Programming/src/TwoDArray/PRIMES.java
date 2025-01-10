package TwoDArray;

public class PRIMES 
{

	public static void main(String[] args) {
		int [][] arr= {{4,6,7},{2,5,33},{9,13,11}};
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				int count=0;
				for (int k = 1; k <= arr[i][j]; k++) 
				{
					if(arr[i][j] % k==0)
					{
						count++;
					}
				}
				if(count==2)
				{
					System.out.println("Prime Num: "+ arr[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
}
