package TwoDArray;

public class Reverse_diagonal
{

		public static void main(String[] args) {
			int [][] arr= {{10,20,30}, {40,50,60},{70,80,90}};
			for (int i = 0; i < arr.length; i++) 
			{
				for (int j = 0; j < arr[i].length; j++) 
				{
					if(i+j== arr[i].length-1)
					{
					System.out.print(arr[i][j]+" ");
					}
				}
				System.out.println();
			}
		}
	

}
