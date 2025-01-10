package String;

public class Char_occur 
{
public static void main(String[] args) {
	String s="maharashtra";
	char [] ch= s.toCharArray();
	occurs(ch);
	}
	public static void occurs(char[]  a) {
	boolean [] b= new boolean[a.length];

	for (int i = 0; i < b.length; i++) 
	{
		if(b[i]==false)
		{
		int count=1;
		for (int j = i+1; j < b.length; j++) 
		{
			if(a[i]==a[j]) 
			{
				count++;
				b[j]= true;
			}
		
		}
		System.out.println(a[i]+" =>"+ count);
		} 
	}
}
}
