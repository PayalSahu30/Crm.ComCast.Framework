package String;

import preProgramming.For_loop;

public class Replaceing
{
public static void main(String[] args)
{
String s="Meet me at the Clock tower";
String [] st= s.split(" ");

for (int i = 0; i < st.length; i++) 
{
	if(i%3==0)
	{
		System.out.print(vowel(st[i])+" ");
	}
	else if(i%3==1)
	{
		System.out.print(consonant(st[i])+" ");
	}
	else
	{
		System.out.print(st[i].toUpperCase()+" ");
	}
}
}

	private static String consonant(String s) {
		char[] ch= s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]!='a' && ch[i]!='e' &&ch[i]!='i' &&ch[i]!='o' &&ch[i]!='u' &&ch[i]!='A' &&ch[i]!='E' &&ch[i]!='I' &&ch[i]!='O' &&ch[i]!='U')
			{
				ch[i]='#';
			}
		}
		return new String(ch);
	}

	private static String vowel(String s) {
		char[] ch= s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='a' ||ch[i]=='e' ||ch[i]=='i' ||ch[i]=='o' ||ch[i]=='u' ||ch[i]=='A' ||ch[i]=='E' ||ch[i]=='I' ||ch[i]=='O' ||ch[i]=='U')
			{
				ch[i]='%';
			}
		}
		return new String(ch);
	}
}