package Patterns;

public class SquareStar 
{
public static void main(String[] args) 
{
	for (int row = 1; row <=5; row++) 
	{
		for (int col = 1; col <=5; col++) 
		{
			if(row==1 || row==3 || (col==1 && row<=3) ||(col==5 && row<=3) || (col==3 && row >=3))
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
