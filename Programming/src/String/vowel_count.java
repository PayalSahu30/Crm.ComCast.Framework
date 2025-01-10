package String;

import java.util.Scanner;

public class vowel_count
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string: ");
	String s= sc.next();
	
	
	int v_count=0;
	for (int i = 0; i < s.length(); i++) 
	{ 
		char ch= s.charAt(i);
		if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')
		{
			v_count++;
		}
	}
	System.out.println("total vowels are : "+v_count);
}
}