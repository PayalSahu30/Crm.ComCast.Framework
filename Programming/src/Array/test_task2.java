package Array;

public class test_task2 
{
public static void main(String[] args) 
{
	int [] a= {44,17,63,28,74,2,6};
	evenodd(a);
	primes(a);
	perfect(a);
}

	
public static void evenodd(int[] a)
{
	int even=0;
	int odd=0;
	for (int i = 0; i < a.length; i++) 
	{
		if(a[i]%2==0)
		{
			even++;
		}
		else
		{
			odd++;	
		}
	}
	System.out.println("Total even : "+even);
	System.out.println("total odd : "+odd);
}

public static void primes(int[] a)
{
	int prime=0;
	for(int i=0; i<a.length; i++)
	{
		int count=0;
		for(int j=1; j<=a[i]; j++)
		{
			if(a[i]%j==0)
			{
				count++;
			}
							
		}
		if(count==2)
		{
			prime++;
		}
	}
	System.out.println("Total prime: "+ prime);
}


public static void perfect(int[] a)
	{ 
		int perfect=0;
		
		for (int i = 0; i < a.length; i++) 
		{
			int sum=0;
			for(int j=1; j<=a[i]/2; j++)
			{
				if(a[i]%j==0)
				{
					sum=sum + j;
					//System.out.println(a[i]+ " " +j);
				}
								
			}
			if(sum==a[i])
			{
			perfect++;
			}
		}
	 System.out.println("Total Perfect : "+ perfect);
	}
}
	

