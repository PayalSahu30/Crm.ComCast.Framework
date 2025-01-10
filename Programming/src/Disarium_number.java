//Disarium Number__ 89,175       1^1+ 7^2 + 5^3=175
public class Disarium_number 
{
public static void main(String[] args) 
{
	int n=175;               
	int count=count(n);
	int sum=disarium(n,count);
	if(sum==n)
	{
		System.out.println("Disarium Number");
	}
	else
	{
		System.out.println("not a Disarium Number");
	}
}

	public static int disarium(int n, int count)
	{
		int sum=0;
		while(n!=0)
		{
			int d= n%10;
			int prod=1;
			for (int i = 1; i <=count; i++) 
			{
			 prod=prod*d;	
			}
			count--;
			sum=sum+prod;
			n=n/10;
		}
		return sum;
	}
	public static int count(int n)
	{
		int res=0;
		while(n!=0)
		{
			res++;
			n=n/10;
		}
		return res;
	}
}
