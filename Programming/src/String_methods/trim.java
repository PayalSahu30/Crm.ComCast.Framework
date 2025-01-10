package String_methods;

public class trim 
{
	public static void main(String[] args)
	{
			 
			String s="    Maham";
			s=s.trim();
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
