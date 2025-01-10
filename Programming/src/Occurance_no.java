//WAJP to check how many times a digit occurs in a number.

import java.util.Scanner;

public class Occurance_no 
{
	public static void main(String[] args)
	   {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter whole number:");
		int num=sc.nextInt();
		System.out.println("Enter no to find:");
		int k=sc.nextInt();
		Occur(num,k);
}
	public static void Occur(int n, int k)
	{
		int tot=0;
		while(n!=0)
		{
		int d= n%10;
		if(d==k)
		{
			tot=tot+1;
		}	
		n=n/10;
		}
		System.out.println(tot);
	}
}

