package String;

public class sort_name 
{
public static void main(String[] args) {
	String s= "payal";
	char [] a= s.toCharArray();
	for (int i = 0; i < a.length; i++) 
	{
		for (int j = i+1; j < a.length; j++)
		{
			if(a[i]>a[j])
			{
				char temp=a[i];
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

