package String;

public class Selection_sort 
{
	public static void main(String[] args) 
	{
		String s="pratyush";
		char[] a= s.toCharArray();
		for (int i = 0; i < a.length; i++) 
		{
			int min=i;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[j]< a[min])
				{
					min=j;
				}
			}
			char temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+ " ");
		}
	}
}
