package String;
public class Toggle_String 
{
public static void main(String[] args) {
	String s="HeLLo WoRld";
	char [] ch=s.toCharArray();
	for (int i = 0; i < ch.length; i++)
	{ 
		
		if(ch[i]>='A' && ch[i]<='Z')
		{
			ch[i]=(char) (ch[i]+32);
		}
		else if(ch[i]>='a' && ch[i]<='z')
		{
			ch[i]=(char) (ch[i]-32);
		}
	}
	for (int i = 0; i < ch.length; i++) {
	System.out.print(ch[i]);	
	}
}
}
