//WAJP to check whether the given no is Strong number or not

import java.util.Scanner;

public class Strong_no
{
	public static void main(String[] args) 
	{
		
	Scanner sc=new Scanner(System.in);
	System.out.print("enter number:");
	int num=sc.nextInt(); 
	int sum=sumDigitFactorial(num);
	
	if(sum==num)
	{
		System.out.println("Strong Number");
	}
	else
	{
		System.out.println("not a Strong Number");
	}
}
	public static int sumDigitFactorial(int num)
	{
		int result=0;
		while(num!=0)
		{
		int digit= num%10;
		int fact=1;
		
		for(int i=digit; i>=1; i--) 
		{
			fact =fact*i;
			
		}
		result=fact+result;
		num=num/10;
		}
		return result;
}
}

