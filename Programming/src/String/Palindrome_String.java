package String;

public class Palindrome_String
{
	public static void main(String[] args) {
		 
		String s="maham";
		// String rev=new String();
		String rev="";
		for (int i = s.length()-1; i>=0; i--) {
			rev= rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println("palindrome");
			}
		else {
			System.out.println("Not palindrome");
		}
		}
}
