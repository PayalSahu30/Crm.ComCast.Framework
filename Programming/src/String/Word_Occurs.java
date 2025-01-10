package String;

public class Word_Occurs
{
public static void main(String[] args) {
	String s= "java is a programming language it is a high level programming language";
	String [] s_arr= s.split(" ");
	
	occurs(s_arr);
}

public static void occurs(String[] s_arr)
{
	boolean [] b= new boolean[s_arr.length];

	for (int i = 0; i < b.length; i++) 
	{
		if(b[i]==false)
		{
		int count=1;
		for (int j = i+1; j < b.length; j++) 
		{
			if(s_arr[i].equalsIgnoreCase(s_arr[j]))
			{
				count++;
				b[j]= true;
			}
		
		}
		System.out.println(s_arr[i]+" =>"+ count);
		} 
	}
	
	
}
}
