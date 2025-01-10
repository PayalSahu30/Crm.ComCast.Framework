package Array;

public class largest_no 
{
	public static void main(String[] args) {
		int [] a= {3,5,2,7,1,8};
		int large=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>large)
			{
				large=a[i];
			}
		}
	System.out.println(large);
	}
}
