package String;

import java.util.Scanner;

public class SOS_ChangeCount 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter SOS msg: ");
	String s=sc.next();
	
	
	int length=s.length()/3;
	
	String msg="";
	for (int i = 0; i <=length; i++) 
	{
		msg=msg+"SOS";
	}
	
	int wrong=0;
	for (int i = 0; i < s.length(); i++) {
		if(s.charAt(i)!=msg.charAt(i))
		{
			wrong++;
		}
	}
	System.out.println("Total Altered Chars: "+ wrong);
}
}
