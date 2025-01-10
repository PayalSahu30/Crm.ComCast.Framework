package String_methods;

import java.util.Scanner;

public class password_Strong_meths 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your password");
	String pass=sc.next();
	
	boolean uc= isuppercase(pass);
	boolean lc= islowercase(pass);
	boolean num= isnumber(pass);
	
	
	
	if(pass.length()>=8 && lc && uc && num)
	{
		System.out.println("Strong Password");
	}
	else
	{
		System.out.println("Weak Password");
	}

}

public static boolean isuppercase(String pass)
{
	boolean flag=false;
	for (int i = 0; i < pass.length(); i++) 
	{
		if(pass.charAt(i)>='A' && pass.charAt(i)<='Z')
		{
			flag=true;
			break;
		}
	}
	return flag;
}
public static boolean islowercase(String pass)
{
	boolean flag=false;
	for (int i = 0; i < pass.length(); i++) 
	{
		if(pass.charAt(i)>='a' && pass.charAt(i)<='z')
		{
			flag=true;
			break;
		}
	}
	return flag;
}

public static boolean isnumber(String pass)
{
	boolean flag=false;
	for (int i = 0; i < pass.length(); i++) 
	{
		if(pass.charAt(i)>='0' && pass.charAt(i)<='9')
		{
			flag=true;
			break;
		}
	}
	return flag;
}



}

