package TwoDArray;

//import java.util.Iterator;
import java.util.Scanner;

public class Addition 
{

	public static void main(String[] args) 
	{
	int [][] a= {{1,2,3},{4,5,6},{7,8,9}};
	int [][] b= {{1,2,3},{4,5,6},{7,8,9}};
	int [][] add= new int[3][3];
	Scanner sc= new Scanner(System.in);
	
	for (int i = 0; i < a.length; i++) 
	{
	for (int j = 0; j < b.length; j++) 
	{
		add[i][j]= a[i][j]+b[i][j];
		System.out.println(add[i][j]+ " ");
	}	
	System.out.println();
	}
	
}
}