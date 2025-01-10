// Daksh loves maths more than he loves his cold drinks and chips. one fine day while scrolling through the learning resources center he found an interesting book on harshd number.
// a harshad number (or niven number) is an integer number that is divisible by the sum of its digits.
// digitSum(n) : sum of digits of n(in decimal representation)

//eg:n=200 then digitSum(n) =2+0+0 =2
// as 200% digitSum(200) is 0, 200 is a harshad number

//help him to create a algorithim to check if the number in harshad number or not.

import java.util.Scanner;

public class Number
{
	
	 public static int digitSum(int n)
	 {

		int sum = 0;
		while(n!=0)
		{
		int d= n%10;
		sum=sum+d;
		n=n/10;
		}
		return sum;
		
	 }
  public static void main(String[] args)
   {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter number:");
	int num=sc.nextInt();
	 
	int sum=digitSum(num);
	
	if(num%sum==0)
	{
	System.out.println("niven no");	
	}
	else
	{
		System.out.println("not a niven no");
	}

}
}

