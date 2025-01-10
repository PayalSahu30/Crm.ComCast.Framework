package Array;
public class Search_A_element 
{
public static void main(String[] args) {
	int[] a= {3,8,2,4,7,2,9};
	int k=2;
	boolean flag=false;
	for (int i = 0; i < a.length; i++)
	{
		if(a[i]==k)
		{
			System.out.println(k+" is present at index : "+ i);
			flag=true;
		}
	}
		
   if(flag==false)
   {
	   System.out.println("not present");
   }
}
}
