//Anagram Array


package Array;

public class Same_array
{

	public static void main(String[] args) {
		
		int[] a= {2,3,1,8,2,5,6};
		int[] b= {5,2,1,6,3,2,8};
		
		if(a.length != b.length)
		{
			System.out.println("size is not same");
		}
		else {
			
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				if(b[i]>b[j])
				{
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		
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
			System.out.println("same array");
		}
		else
		{
			System.out.println("not same");
		}

		}
		
			
		}
}
