package String;

public class Anagram_String
{
		public static void main(String[] args) 
		{
			String s1="silent";
			String s2="listen";
			
			if(s1.length() != s2.length())
			{
				System.out.println("not Anagram");
			}
			else
			{
				char[] a= s1.toCharArray();
				char[] b= s2.toCharArray();
				sort(a);
				sort(b);
				boolean flag=true;
				for (int i = 0; i < a.length; i++) 
				{
					if(a[i]!=b[i])
					{
						flag=false;
					}
				}
				if(flag)
				{
					System.out.println("Anagram");
				}
				else
				{
					System.out.println("not Anagram");
				}	
				
			}
		}

		private static void sort(char[] ch) 
		{
			for (int i = 0; i < ch.length; i++) 
			{
				for (int j = i+1; j < ch.length; j++)
				{
					if(ch[i]>ch[j])
					{
						char temp=ch[i];
						ch[i]=ch[j];
						ch[j]=temp;
					}
			
				}
			}
		}

}