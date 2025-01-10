//WAJP to check wheather the given no is special no or not.
/*eg 19
 *sum of digit: 1+9=10
 *multiplication of digit 1*9=9
 *addition of both 10+9=19(number itself)
 **/

import java.util.Scanner;

public class Special_no
{
	public static int digitTotal(int n)
	 {

		int sum = 0;
		int prod=1;
		while(n!=0)
		{
		int d= n%10;
		sum=sum+d;
		prod=prod*d;
		n=n/10;
		}
		return sum+prod;
		}
	
	public static void main(String[] args)
	   {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number:");
		int num=sc.nextInt();
		 
				
		int total=digitTotal(num);
		if(total==num)
		{
		System.out.println("Special no");	
		}
		else
		{
			System.out.println("not a special no");
		}

	   }
}
