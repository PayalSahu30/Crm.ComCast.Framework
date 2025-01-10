package Array;

public class D0410_Q2

{
public static void main(String[] args) {
	int[] a= {1,4,3,2};
	//int [] a= {1,4,3,4,1};
	
	int large=a[0];
	int small=a[0];
	for (int i = 1; i < a.length; i++) {
		if(a[i]>large)
		{
			large=a[i];
		}
		if(a[i]<small)
		{
			small=a[i];
		}
	}
	int count=0;
	float sum=0;
	for (int i = 0; i < a.length; i++) {
		if(a[i]==large)
		{
			sum=sum+a[i];
			count++;
		}
		if(a[i]==small)
		{
			sum=sum+a[i];
			count++;
		}
	}
	System.out.println("totalnum "+count);
	System.out.println("sum is: " +sum);
	System.out.println("avarage is : "+ sum/count);
	
}
}
