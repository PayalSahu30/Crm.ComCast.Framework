package String;

import java.util.Scanner;

public class String_task 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s= sc.next();
		int num=0;
		int uc=0;
		int lc=0;
		int spc=0;
	
		for (int i = 0; i < s.length(); i++) 
		{ 
			char ch= s.charAt(i);
				if(ch>='a' && ch<='z')
				{
					lc++;
				}
				else if(ch>='A' && ch<='Z')
				{
					uc++;
				}
				else if(ch>='0' && ch<='9'){
					num++;
				}
				else
				{
					spc++;
				}
		}
		System.out.println("UPPERCASE : "+uc);
		System.out.println("LOWERCASE : "+lc);
		System.out.println("SPECIAL CHARACTERS : "+spc);
		System.out.println("NUMBERS : "+num);


}
}