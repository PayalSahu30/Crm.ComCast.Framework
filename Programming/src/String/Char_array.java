package String;

public class Char_array 
{
public static void main(String[] args)
{
	String s="Maharashtra";
	char[] c= s.toCharArray(); 
	
	//char [] arr= {'m','a','h','a','r','a','s','h','t','r','a'};
	System.out.println("duplicates : "+ occurs(c));
	
	}
	public static int occurs(char[]  a) 
	{
	  int finalCount=0;
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
		if(count>1)
		{
		    finalCount++;
		}  
		}
		
}
	return finalCount;

}
}