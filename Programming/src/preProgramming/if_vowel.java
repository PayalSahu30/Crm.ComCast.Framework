package preProgramming;

import java.util.Scanner;

public class if_vowel 
{

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Charcter: ");
	char ch= sc.next().charAt(0);
	if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	{  
	System.out.print("Vowel");
	}
	else
	{
	System.out.print("Consonant");
	}
	}
}
