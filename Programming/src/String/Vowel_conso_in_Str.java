//find the vowel and consonenet in an array.

package String;

import java.util.Scanner;

public class Vowel_conso_in_Str {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s= sc.next();
		
		char[] ch= s.toCharArray();
		int v_count=0;
		int c_count=0;
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]=='a' ||ch[i]=='e' ||ch[i]=='i' ||ch[i]=='o' ||ch[i]=='u' ||ch[i]=='A' ||ch[i]=='E' ||ch[i]=='I' ||ch[i]=='O' ||ch[i]=='U')
			{
				v_count++;
			}
			else
			{
				c_count++;
			}
		}
			
		System.out.println("Total vowels : "+v_count);
		System.out.println("Total consonents : "+c_count);
		}
		
	}

