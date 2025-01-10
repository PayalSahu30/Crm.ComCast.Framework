package Array;

import java.util.Scanner;

public class DisplayArray 
{
public static void main(String[] args)
{
	
	int[] a=new int[5];
	display(a);
}

public static void display(int[] arr)
{
	Scanner sc=new Scanner(System.in);
	for(int i=0; i<arr.length; i++)
	{
		System.out.println("Enter value for index: "+i+ ":");
		int val=sc.nextInt();
		arr[i]= val;
	}
	for(int i=0; i<arr.length; i++)
	{
		
		System.out.print(arr[i]+" ");
		
	}
}
}
