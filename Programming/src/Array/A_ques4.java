package Array;

import java.util.Iterator;

public class A_ques4
{
public static void main(String[] args) {
	int[] a= {37,823,122,2322,6017};
	int target=2;
	int max=0;
	int temp=0;    
	for (int i = 0; i < a.length; i++) {
		int oc=num(a[i],target);
		if(oc>max)
		{
			max=oc;
			temp=i;
		}
	}
	System.out.println(a[temp]);

}
public static int num(int n,int k)
{
	int oc=0;
	while(n!=0)
	{
		int d=n%10;
		if(d==k)
		{
			oc++;
		}
		n=n/10;
	}
return oc;

}
}
