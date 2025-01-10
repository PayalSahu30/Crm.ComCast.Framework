package Array;

public class palindrome_Array 
{
	public static void main(String[] args) {
		int[] a= {1,2,3,3,2,1};
		int[] rev=new int[a.length];
		int j=0;
		for (int i=a.length-1; i>=0; i--) 
		{
			rev[j]=a[i];
			j++;
		}
		boolean flag=true;
		for (int i = 0; i < rev.length; i++)
		{
			if(a[i]!=rev[i])
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Palindrome Array");
		}
		else
		{
			System.out.println("Not a palindrome Array");
		}
			
	}
	
		
			
}
