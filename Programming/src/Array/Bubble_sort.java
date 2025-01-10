package Array;
public class Bubble_sort
{
	public static void main(String[] args) {
	
int[] a= {3,2,4,5,1};
for (int i = 0; i < a.length; i++) 
{
	for (int j = i+1; j < a.length; j++)
	{
		if(a[i]>a[j])
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}
//to print
for (int i = 0; i < a.length; i++) {
	System.out.print(a[i]+" ");
}
}
}