//WAJP to check whether the given no is armStrong number or not

import java.util.Scanner;

public class ArmStrongNumber 
{
	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number:");
		int n=sc.nextInt(); 
		
		int pow=count(n);
		int sum=digitPowSum(n,pow);
		if(sum==n)
		{
			System.out.println("ArmStrong Number");
		}
		else
		{
			System.out.println("not a ArmStrong Number");
		}	
	}
public static int digitPowSum(int n,int pow) 
	{
		int res=0;
		while(n!=0)
		{
		int d = n%10;
		int prod = 1;
		for(int i=1;i<=pow;i++)
		{
		prod= d * prod;
		}
		res = res+prod;
		n=n/10;
		}                   
		return res;
	}
public static int count(int n) 
{
	int res = 0;
	while(n!=0)
	{
	int d = n%10;
	res = res+1;
	n=n/10;
	}
	return res;
}
}