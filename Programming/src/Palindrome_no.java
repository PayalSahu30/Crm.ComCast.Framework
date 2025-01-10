//WAJP to check whether the given no is palindrome or not.
// number and it's reverse should same

import java.util.Scanner;

public class Palindrome_no
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number : ");
		int n= sc.nextInt();
		int temp=n;
		int rev= reverse(n);
		if(temp==rev)
		{
			System.out.println("Palindrome number");
		}
		else
		{
			System.out.println("not a Palindrome number");
		}
		
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


