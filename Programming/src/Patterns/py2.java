package Patterns;

public class py2 
{
	public static void main(String[] args) 
	{
		for (int row = 1; row <=5; row++) 
		{
			for (int col = 1; col <=5; col++) 
			{
				if(row+col==6 || col==5|| row==5 )
				{
					System.out.print("* ");	
				}
				else
				{
					System.out.print("  ");
				}
			}	
			System.out.println();
		}
	}
}
