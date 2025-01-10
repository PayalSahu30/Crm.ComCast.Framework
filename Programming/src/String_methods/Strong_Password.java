package String_methods;
import java.util.Scanner;

public class Strong_Password
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your password");
	String pass=sc.next();
	char[] ch= pass.toCharArray();
	boolean num=false, uc=false,lc=false,spc=false;
	
	for (int i = 0; i < ch.length; i++)
	{
		if(ch[i]>='a' && ch[i]<='z')
		{
			lc=true;
		}
		else if(ch[i]>='A' && ch[i]<='Z')
		{
			uc=true;
		}
		else if(ch[i]>='0' && ch[i]<='9'){
			num=true;
		}
		else
		{
			spc=true;
		}
	}
if(pass.length()>=8 && lc && uc && num && spc)
{
	System.out.println("Strong Password");
}
else
{
	System.out.println("Weak Password");
}
}
}
