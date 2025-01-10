// WAJP to print reverse no of given no

import java.util.Scanner;

public class Reverse_no 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number : ");
	int n= sc.nextInt();
	int rev= reverse(n);
	System.out.println(rev);
	
}
public static int reverse(int n)
{
	int rev=0;
	while(n!=0)
	{
		int d = n % 10;
		rev= rev*10+d;
		n=n/10;
		
	}
	
	return rev;
}

}

