import java.util.Scanner;

public class SumOfDigitUnit
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number");
	int num= sc.nextInt();
	int sum=0;
	
	while(num!=0)
	{
		int d= num%10;
		sum=sum+d;
		num=num/10;
}
	if (sum<10) 
	{
		System.out.println("Sum: "+ sum);
	} 
	else
	{
		num=sum;
		sum=0;
		while(num!=0)
		{
			int d= num%10;
			sum=sum+d;
			num=num/10;
		}
	
	System.out.println("Sum: "+ sum);
	}
}
}
