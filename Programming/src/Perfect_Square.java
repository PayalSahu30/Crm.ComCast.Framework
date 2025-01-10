//WAJPTP perfect square from the range 1 to 20.
// op-   1 2 9 16 only
public class Perfect_Square
{
public static void main(String[] args) 
{
	perfectSquare(1,20);
}
public static void perfectSquare(int start,int end) 
{
	for(int i=start; i*i<=end; i++)
	{
			System.out.print(i*i+ " ");
	}
		
}
}	



	

		
