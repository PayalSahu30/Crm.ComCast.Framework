package String;

public class Print 
{

	public static void main(String[] args) {
		String s="Qspiders";
		for (int i = 0; i < s.length(); i++) 
		{
			System.out.println(s.charAt(i));
		}
		
		//System.out.println(s.charAt(8));// StringIndexOutOfBoundsException
	}
}
