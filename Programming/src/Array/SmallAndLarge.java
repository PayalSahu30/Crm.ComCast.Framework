package Array;

public class SmallAndLarge
{
	public static void main(String[] args) {
		int [] a= {5,3,5,1,2,5,3,1,4};
		int large=a[0];
		int largecount=0;
		int small=a[0];
		int smallcount=0;
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
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]==large)
			{
				largecount++;
			}
			if(a[i]==small)
			{
				smallcount++;
			}
		}
		
	System.out.println("largest no of array is : " +large+ " occures : "+ largecount+ " times.");
	System.out.println("smallest no of array is : "+small+ " occures : "+ smallcount+ " times.");
	}
}
