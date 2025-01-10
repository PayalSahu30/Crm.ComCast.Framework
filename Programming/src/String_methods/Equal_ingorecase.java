package String_methods;

public class Equal_ingorecase 
{
	public static void main(String[] args)
	{
			 
			String s="Maham";
			// String rev=new String();
			String rev="";
			for (int i = s.length()-1; i>=0; i--) 
			{
				rev= rev+s.charAt(i);
			}
			if(s.equalsIgnoreCase(rev))
			{
				System.out.println("palindrome");
			}
			else
			{
				System.out.println("Not palindrome");
			}
		}
	}

