
package Array;

public class D0410_Q1 
{
public static void main(String[] args) {
	//int[] arr= {2,2,2,2,2};
	int[] arr={1,2,3,4,5};
	 int sum=0;
	 
	for (int i = 0; i < arr.length; i++) {                 //for addition
		sum=sum+arr[i];
	}
		
	int num= sum/arr.length;                                //number to find occurance in array
	System.out.println(num);
	
	int count=0;
	for (int i = 0; i < arr.length; i++) {                 //count occurance
		if(arr[i]==num)
		{
			count++;
		}
	
	}
	System.out.println("occurance of "+num+ " in array : "+ count);
}
}
