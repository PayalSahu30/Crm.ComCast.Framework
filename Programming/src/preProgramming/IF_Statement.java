package preProgramming;

import java.util.Scanner;

public class IF_Statement 
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Number");
	int a= sc.nextInt();
	
	System.out.println(a%2==0?"even":"odd");
	
	
	
	if(a%13==0)
	{  //if block
	System.out.print(" DIvisible");
	
	}
	else
	{
	System.out.print(" Not Divisible");
	}
	}
	
	
}

