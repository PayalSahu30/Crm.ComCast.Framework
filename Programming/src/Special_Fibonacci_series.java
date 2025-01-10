// WAJP to print special fibonacci series.
//1 2 6 16 44 120 328 896 2448 6688 
import java.util.Scanner;

public class Special_Fibonacci_series
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many terms you want: ");
		int n= sc.nextInt();
		
		int first=1;
		int sec=2;
		int k=2;
//		int n=10;
		
		System.out.print(first+" ");
		System.out.print(sec+" ");
		for(int i=3;i<=n;i++)
		{
			int num=(first+sec)*k;
			first=sec;
			sec=num;
			System.out.print(num+" ");
		}
		

}
}
