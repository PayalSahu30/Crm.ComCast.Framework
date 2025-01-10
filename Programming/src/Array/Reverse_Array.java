package Array;

import java.util.Iterator;

public class Reverse_Array 
{
	public static void main(String[] args) {
		int[] a= {5,3,2,4,1};
		reverse(a);
}
	public static void reverse(int[] a) 
	{
		int temp;
		for (int i = 0; i < (a.length/2); i++) 
		{
		 	temp=a[i];
		 	a[i]=a[a.length-1-i];
		 	a[a.length-1-i]= temp;
		 	
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
	}
}