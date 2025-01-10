//WAJP to find factorial of all digits from the given no.

import java.util.Scanner;

public class Factorial_of_all
{
	public static void main(String[] args) 
	{
		
	Scanner sc=new Scanner(System.in);
	System.out.print("enter number:");
	int num=sc.nextInt();
	
	fact(num);
	
}
	public static void fact(int num)
	{
		while(num!=0)
		{
		int digit= num%10;
		int fact=1;
		for(int i=digit; i>=1; i--) 
		{
			fact =fact*i;
			
		}
		System.out.println("factorial of "+digit+" is : "+ fact);
		num=num/10;
		}
	}
	}
