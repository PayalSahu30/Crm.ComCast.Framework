package Array;

import java.util.Iterator;

public class Small_no
{
public static void main(String[] args) {
	int [] a= {3,5,2,7,1,8};
	int small=a[0];
	for (int i = 0; i < a.length; i++) {
		if(a[i]<small)
		{
			small=a[i];
		}
	}
System.out.println(small);
}

}
	